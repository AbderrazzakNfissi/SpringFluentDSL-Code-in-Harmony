package org.xtext.spring.fluent.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.spring.fluent.springFluentDSL.Entity

class ServiceGenerator {

  def void generateService(Entity entity, IFileSystemAccess2 fsa, String basePackage) {
    val entityName = entity.name
    val servicePackage = basePackage + ".services"
    val serviceContent = generateServiceCode(entity, basePackage,servicePackage)

    fsa.generateFile('src/main/java/' + servicePackage.replace('.', '/') + '/' + entityName + 'Service.java', serviceContent)
  }

  def String generateServiceCode(Entity entity,String basePackage, String servicePackage) {
    val entityName = entity.name
    val repositoryPackage = basePackage + ".repositories"
    val repositoryName = entityName + 'Repository'
    val createMethod = generateServiceCreateMethod(entity)
    val readAllMethod = generateServiceReadAllMethod(entity)
    val readByIdMethod = generateServiceReadByIdMethod(entity)
    val updateMethod = generateServiceUpdateMethod(entity)
    val deleteMethod = generateServiceDeleteMethod(entity)

    '''
    package ''' + servicePackage + ''';

    import org.springframework.stereotype.Service;
    import lombok.extern.slf4j.Slf4j;
    import lombok.RequiredArgsConstructor;
    import ''' + repositoryPackage + '.' + repositoryName + ''';
    import org.springframework.transaction.annotation.Transactional;
    import java.util.List;

    @Service
    @RequiredArgsConstructor
    @Slf4j
    public class ''' + entityName + '''Service {

        private ''' + entityName + '''Repository ''' + entityName.toLowerCase + '''Repository;

        ''' + createMethod + '''

        ''' + readAllMethod + '''

        ''' + readByIdMethod + '''

        ''' + updateMethod + '''

        ''' + deleteMethod + '''
    }
    '''
  }

  def String generateServiceCreateMethod(Entity entity) {
    if (entity.feature.operation.operation.contains("c")) {
      val entityName = entity.name
      '''
      // Create
      @Transactional
      public ''' + entityName + ''' create''' + entityName + '''(''' + entityName + ''' ''' + entityName.toLowerCase + ''') {
          return ''' + entityName.toLowerCase + '''Repository.save(''' + entityName.toLowerCase + ''');
      }
      '''
    } else {
      ''
    }
  }

  def String generateServiceReadAllMethod(Entity entity) {
    if (entity.feature.operation.operation.contains("r")) {
      val entityName = entity.name
      '''
      // Read
      public List<''' + entityName + '''> getAll''' + entityName + '''s() {
          return ''' + entityName.toLowerCase + '''Repository.findAll();
      }
      '''
    } else {
      ''
    }
  }

  def String generateServiceReadByIdMethod(Entity entity) {
    if (entity.feature.operation.operation.contains("r")) {
      val entityName = entity.name
      '''
      public ''' + entityName + ''' get''' + entityName + '''ById(Long ''' + entityName.toLowerCase + '''Id) {
          return ''' + entityName.toLowerCase + '''Repository.findById(''' + entityName.toLowerCase + '''Id).orElse(null);
      }
      '''
    } else {
      ''
    }
  }

def String generateServiceUpdateMethod(Entity entity) {
  if (entity.feature.operation.operation.contains("u")) {
    val entityName = entity.name
    val attributes = entity.feature.attributes.map[attribute |
      '''updated''' + entityName + '''.''' + attribute.name + ''' = ''' + entityName.toLowerCase + '''.''' + attribute.name + ''';
    '''].join
    '''
    // Update
     @Transactional
    public ''' + entityName + ''' update''' + entityName + '''(Long ''' + entityName.toLowerCase + '''Id, ''' + entityName + ''' updated''' + entityName + ''') {
        if (''' + entityName.toLowerCase + '''Repository.existsById(''' + entityName.toLowerCase + '''Id)) {
            ''' + entityName + ''' ''' + entityName.toLowerCase + ''' = ''' + entityName.toLowerCase + '''Repository.findById(''' + entityName.toLowerCase + '''Id).orElse(null);
            if (''' + entityName.toLowerCase + ''' != null) {
                ''' + attributes + '''
                return ''' + entityName.toLowerCase + '''Repository.save(''' + entityName.toLowerCase + ''');
            }
        }
        return null; // Handle non-existent ''' + entityName.toLowerCase + '''
    }
    '''
  } else {
    ''
  }
}

def String generateServiceDeleteMethod(Entity entity) {
  if (entity.feature.operation.operation.contains("d")) {
    val entityName = entity.name
    '''
    // Delete
    @Transactional
    public void delete''' + entityName + '''(Long ''' + entityName.toLowerCase + '''Id) {
        try {
            Optional<''' + entityName + '''> optional''' + entityName + ''' = ''' + entityName.toLowerCase + '''Repository.findById(''' + entityName.toLowerCase + '''Id);
            if (optional''' + entityName + '''.isPresent()) {
                ''' + entityName.toLowerCase + '''Repository.deleteById(''' + entityName.toLowerCase + '''Id);
            } else {
                throw new Exception("''' + entityName + ''' not found with id: " + ''' + entityName.toLowerCase + '''Id);
            }
        } catch (Exception e) {
            // Handle the exception by logging it
            log.error("Error deleting ''' + entityName + ''': {}", e.getMessage(), e);
        }
    }
    '''
  } else {
    ''
  }
}


}
