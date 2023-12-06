package org.xtext.spring.fluent.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.spring.fluent.springFluentDSL.Entity
import org.xtext.spring.fluent.springFluentDSL.Model

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SpringFluentDSLGenerator extends AbstractGenerator {

   override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
    val model = resource.contents.head as Model;
    val appName = model.appName.appName;
    val basePackage = "com." + appName.toLowerCase()

    val entityGenerator = new EntityGenerator
    val controllerGenerator = new ControllerGenerator
    val repositoryGenerator = new RepositoryGenerator
    val serviceGenerator = new ServiceGenerator

    for (entity : resource.allContents.toIterable.filter(Entity)) {
      entityGenerator.generateEntity(entity, fsa, basePackage)
      controllerGenerator.generateController(entity, fsa, basePackage)
      repositoryGenerator.generateRepository(entity, fsa, basePackage)
      serviceGenerator.generateService(entity, fsa, basePackage)
    }
  }
//  override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//    val model = resource.contents.head as Model;
//    val appName = model.appName.appName;
//    for (entity : resource.allContents.toIterable.filter(Entity)) {
//      generateEntityFiles(entity, fsa, appName)
//    }
//    
//  }
//
//  def void generateEntityFiles(Entity entity, IFileSystemAccess2 fsa, String appName) {
//    val entityName = entity.name
//    val basePackage = "com." + appName.toLowerCase()
//
//    // Generate Entity Class
//    val entityPackage = basePackage + ".models"
//    val entityContent = '''
//      package ''' + entityPackage + ''';
//
//      public class ''' + entityName + ''' {
//        // Add fields, methods, and other members based on the entity definition
//      }
//    '''
//    fsa.generateFile('src/main/java/' + entityPackage.replace('.', '/') + '/' + entityName + '.java', entityContent)
//
//    // Generate Controller Class
//    val controllerPackage = basePackage + ".controllers"
//    val controllerContent = '''
//      package ''' + controllerPackage + ''';
//
//      import org.springframework.web.bind.annotation.*;
//
//      @RestController
//      @RequestMapping("/''' + entityName.toLowerCase + '''")
//      public class ''' + entityName + '''Controller {
//        // Add controller methods based on the entity definition
//      }
//    '''
//    fsa.generateFile('src/main/java/' + controllerPackage.replace('.', '/') + '/' + entityName + 'Controller.java', controllerContent)
//
//    // Generate Repository Interface
//    val repositoryPackage = basePackage + ".repositories"
//    val repositoryContent = '''
//      package ''' + repositoryPackage + ''';
//
//      import org.springframework.data.jpa.repository.JpaRepository;
//
//      public interface ''' + entityName + '''Repository extends JpaRepository<''' + entityName + ''', Long> {
//        // Add custom query methods if needed
//      }
//    '''
//    fsa.generateFile('src/main/java/' + repositoryPackage.replace('.', '/') + '/' + entityName + 'Repository.java', repositoryContent)
//
//    // Generate Service Class
//    val servicePackage = basePackage + ".services"
//    val serviceContent = '''
//      package ''' + servicePackage + ''';
//
//      import org.springframework.stereotype.Service;
//
//      @Service
//      public class ''' + entityName + '''Service {
//        // Add service methods based on the entity definition
//      }
//    '''
//    fsa.generateFile('src/main/java/' + servicePackage.replace('.', '/') + '/' + entityName + 'Service.java', serviceContent)
//  }
}
