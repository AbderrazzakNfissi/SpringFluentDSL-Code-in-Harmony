package org.xtext.spring.fluent.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.spring.fluent.springFluentDSL.Entity

class ServiceGenerator {

  def void generateService(Entity entity, IFileSystemAccess2 fsa, String basePackage) {
    val entityName = entity.name
    val servicePackage = basePackage + ".services"
    val serviceImplementationPackage = servicePackage + ".implementations"
    val serviceInterfaceContent = generateServiceInterfaceCode(entity, basePackage, servicePackage)
    val serviceImplementationContent = generateServiceImplementationCode(entity, basePackage, servicePackage, serviceImplementationPackage)

    // Generate Service Interface
    fsa.generateFile('src/main/java/' + servicePackage.replace('.', '/') + '/' + entityName + 'Service.java', serviceInterfaceContent)

    // Generate Service Implementation
    fsa.generateFile('src/main/java/' + serviceImplementationPackage.replace('.', '/') + '/' + entityName + 'ServiceImpl.java', serviceImplementationContent)
  }

  def String generateServiceInterfaceCode(Entity entity, String basePackage, String servicePackage) {
    val entityName = entity.name
       val exceptionPackage = basePackage + ".exceptions."
    val exceptionNameNOTFOUND = entityName + 'NotFoundException'
    val exceptionNameValidation = entityName + 'ValidationException'
  	val createMethodInterface = generateServiceCreateMethodSignature(entity)
    val readAllMethodInterface = generateServiceReadAllMethodSignature(entity)
    val readByIdMethodInterface = generateServiceReadByIdMethodSignature(entity)
    val updateMethodInterface = generateServiceUpdateMethodSignature(entity)
    val deleteMethodInterface = generateServiceDeleteMethodSignature(entity)
    '''
    package ''' + servicePackage + ''';
	import ''' + exceptionPackage + 'notfound.' + exceptionNameNOTFOUND + ''';
	import ''' + exceptionPackage + 'validation.' + exceptionNameValidation + ''';
    import java.util.List;

    public interface ''' + entityName + '''Service {

         ''' + createMethodInterface + '''
       
               ''' + readAllMethodInterface + '''
       
               ''' + readByIdMethodInterface + '''
       
               ''' + updateMethodInterface + '''
       
               ''' + deleteMethodInterface + '''
           }
           '''
         }

  def String generateServiceImplementationCode(Entity entity, String basePackage, String servicePackage, String serviceImplementationPackage) {
    val entityName = entity.name
    val exceptionPackage = basePackage + ".exceptions."
    val exceptionNameNOTFOUND = entityName + 'NotFoundException'
    val exceptionNameValidation = entityName + 'ValidationException'
    val repositoryPackage = basePackage + ".repositories"

    val repositoryName = entityName + 'Repository'
    val createMethod = generateServiceCreateMethod(entity)
    val readAllMethod = generateServiceReadAllMethod(entity)
    val readByIdMethod = generateServiceReadByIdMethod(entity)
    val updateMethod = generateServiceUpdateMethod(entity)
    val deleteMethod = generateServiceDeleteMethod(entity)

    '''
    package ''' + serviceImplementationPackage + ''';

    import org.springframework.stereotype.Service;
    import lombok.extern.slf4j.Slf4j;
    import lombok.RequiredArgsConstructor;
    import ''' + repositoryPackage + '.' + repositoryName + ''';
    import ''' + exceptionPackage + 'notfound.' + exceptionNameNOTFOUND + ''';
    import ''' + exceptionPackage + 'validation.' + exceptionNameValidation + ''';
    import org.springframework.transaction.annotation.Transactional;
    import java.util.List;

    @Service
    @RequiredArgsConstructor
    @Slf4j
    public class ''' + entityName + '''ServiceImpl implements ''' + entityName + '''Service {

        private final ''' + entityName + '''Repository ''' + entityName.toLowerCase + '''Repository;

        ''' + createMethod + '''

        ''' + readAllMethod + '''

        ''' + readByIdMethod + '''

        ''' + updateMethod + '''

        ''' + deleteMethod + '''
    }
    '''
  }

  def String generateServiceCreateMethodSignature(Entity entity) {
  	if (entity.feature.operation.operation.contains("c")) {
      val entityName = entity.name
      '''
    public ''' + entityName + ''' create''' + entityName + '''(''' + entityName + ''' ''' + entityName.toLowerCase + ''');
    '''
    } else {
      ''
    }
  }

  def String generateServiceReadAllMethodSignature(Entity entity) {
  	if (entity.feature.operation.operation.contains("r")) {
      val entityName = entity.name
       '''
    public List<''' + entityName + '''> getAll''' + entityName + '''s();
    '''
    } else {
      ''
    }
  }

  def String generateServiceReadByIdMethodSignature(Entity entity) {
  	if (entity.feature.operation.operation.contains("r")) {
      val entityName = entity.name
       '''
    public ''' + entityName + ''' get''' + entityName + '''ById(Long ''' + entityName.toLowerCase + '''Id);
    '''
    } else {
      ''
    }
  }

  def String generateServiceUpdateMethodSignature(Entity entity) {
  	if (entity.feature.operation.operation.contains("u")) {
      val entityName = entity.name
       '''
    public ''' + entityName + ''' update''' + entityName + '''(Long ''' + entityName.toLowerCase + '''Id, ''' + entityName + ''' updated''' + entityName + ''') throws ''' + entityName + '''ValidationException, ''' + entityName + '''NotFoundException;
    '''
    } else {
      ''
    }
  }

  def String generateServiceDeleteMethodSignature(Entity entity) {
  	if (entity.feature.operation.operation.contains("d")) {
      val entityName = entity.name
     '''
    public void delete''' + entityName + '''(Long ''' + entityName.toLowerCase + '''Id) throws ''' + entityName + '''NotFoundException;
    '''
    } else {
      ''
    }
   
  }








  def String generateServiceCreateMethod(Entity entity) {
    if (entity.feature.operation.operation.contains("c")) {
      val entityName = entity.name
      '''
      // Create
      @Transactional
      public ''' + entityName + ''' create''' + entityName + '''(''' + entityName + ''' ''' + entityName.toLowerCase + ''') {
      	  if (''' + entityName.toLowerCase + ''' == null ) {
      	        throw new ''' + entityName + '''ValidationException("Invalid ''' + entityName.toLowerCase + ''' data");
      	    }
          return ''' + entityName.toLowerCase + '''Repository.saveAndFlush(''' + entityName.toLowerCase + ''');
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
    public ''' + entityName + ''' update''' + entityName + '''(Long ''' + entityName.toLowerCase + '''Id, ''' + entityName + ''' updated''' + entityName + ''') throws ''' + entityName + '''ValidationException, ''' + entityName + '''NotFoundException {
        if (''' + entityName.toLowerCase + '''Repository.existsById(''' + entityName.toLowerCase + '''Id)) {
            ''' + entityName + ''' ''' + entityName.toLowerCase + ''' = ''' + entityName.toLowerCase + '''Repository.findById(''' + entityName.toLowerCase + '''Id).orElse(null);
            if (''' + entityName.toLowerCase + ''' != null) {
                // Perform validation checks on the updated''' + entityName + ''' object
                if (updated''' + entityName + ''' == null ) {
                    throw new ''' + entityName + '''ValidationException("Invalid updated ''' + entityName + ''' data");
                }

                ''' + attributes + '''
                return ''' + entityName.toLowerCase + '''Repository.saveAndFlush(''' + entityName.toLowerCase + ''');
            }
        }

        // Throw ''' + entityName + '''NotFoundException if the ''' + entityName.toLowerCase + ''' with the specified ID is not found
        throw new ''' + entityName + '''NotFoundException("''' + entityName + ''' not found with id: " + ''' + entityName.toLowerCase + '''Id);
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
    public void delete''' + entityName + '''(Long ''' + entityName.toLowerCase + '''Id) throws ''' + entityName + '''NotFoundException {
        Optional<''' + entityName + '''> optional''' + entityName + ''' = ''' + entityName.toLowerCase + '''Repository.findById(''' + entityName.toLowerCase + '''Id);
        if (optional''' + entityName + '''.isPresent()) {
            ''' + entityName.toLowerCase + '''Repository.deleteById(''' + entityName.toLowerCase + '''Id);
        } else {
            throw new ''' + entityName + '''NotFoundException("''' + entityName + ''' not found with id : " + ''' + entityName.toLowerCase + '''Id);
        }
    }
    '''
  } else {
    ''
  }
}


}