// EntityGenerator.xtend
package org.xtext.spring.fluent.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.spring.fluent.springFluentDSL.Entity
import org.xtext.spring.fluent.springFluentDSL.Attribute
import org.xtext.spring.fluent.springFluentDSL.Type
import org.xtext.spring.fluent.springFluentDSL.Operation
import org.xtext.spring.fluent.springFluentDSL.Relation

class EntityGenerator {

  def void generateEntity(Entity entity, IFileSystemAccess2 fsa, String basePackage) {
    val entityName = entity.name
    val entityPackage = basePackage + ".entities"

    val attributes = entity.feature.attributes
    val relations = entity.feature.relations
    val operations = entity.feature.operation

    // Generate Entity Class
    val entityContent = generateEntityCode(entity,entityName, attributes, relations, operations)
    
    fsa.generateFile('src/main/java/' + entityPackage.replace('.', '/') + '/' + entityName + '.java', entityContent)
  }

  def String generateEntityCode(Entity entity,String entityName, Iterable<Attribute> attributes, Iterable<Relation> relations, Operation operations) {
    val idAttribute = attributes.findFirst[a | a.name == 'id']
    val superType = entity.superType

    '''
      package ma.nemo.assignment.entities;

      import jakarta.persistence.*;
      import lombok.AllArgsConstructor;
      import lombok.Data;
      import lombok.NoArgsConstructor;
      import org.hibernate.annotations.CreationTimestamp;

      import java.util.Date;

      @Entity
      @Table(name = "''' + entityName + '''")
      @Data
      @AllArgsConstructor
      @NoArgsConstructor
      public class ''' + entityName + ''' ''' + (superType !== null ? 'extends ' + superType.name.toFirstUpper + ' ' : '') + '''{
    ''' 
      +generateIdCode(entity.feature.id.type)+
      generateAttributesCode(attributes) + 
      generateRelationsCode(entityName,relations) +
    '''
      }
    '''
}

def String generateIdCode(Type type) {
    if (type !== null) {
        val name = "id"
        '''
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private ''' + type.toString + ' ' + name + ''';
        '''
    }
}
 
 def String generateAttributesCode(Iterable<Attribute> attributes) {
    attributes.map[a |
      val attributeName = a.name
      val attributeType = mapAttributeType(a.type)
      '''
        private ''' + attributeType + ' ' + attributeName.toLowerCase + ''';
      '''
    ].join('\n')
  }


  def String generateRelationsCode(String entityName, Iterable<Relation> relations) {
    relations.map[r |
        val targetEntityName = r.target.name
        val relationType = r.type

        switch (relationType) {
            case 'mto':
                return '''
                    @ManyToOne
                    @JoinColumn(name = "''' + r.name + '''_id")
                    private ''' + targetEntityName + ' ' + r.name + ''';
                '''
            case 'otm':
                return '''
                    @OneToMany(mappedBy = "''' + entityName + '''")
                    private List<''' + targetEntityName + '''> ''' + r.name + ''';
                '''
            case 'oto':
                return '''
                    @OneToOne
                    private ''' + targetEntityName + ' ' + r.name + ''';
                '''
            case 'mtm':
                return '''
                    @ManyToMany
                    private List<''' + targetEntityName + '''> ''' + r.name +"s"+''';
                '''
            default:
                return ''
        }
    ].join('\n')
}



  def String mapAttributeType(Type attributeType) {
    switch (attributeType.toString) {
    case 'Long': return 'Long'
    case 'Integer': return 'Integer'
    case 'Double': return 'Double'
    case 'String': return 'String'
    case 'Date': return 'Date'
    case 'Time': return 'Time'
    case 'Boolean': return 'Boolean'
    default: return 'Object'
  }
  }

  
  
}
