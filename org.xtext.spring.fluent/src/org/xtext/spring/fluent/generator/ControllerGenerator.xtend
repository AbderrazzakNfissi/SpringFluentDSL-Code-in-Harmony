package org.xtext.spring.fluent.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.spring.fluent.springFluentDSL.Entity

class ControllerGenerator {

  def void generateController(Entity entity, IFileSystemAccess2 fsa, String basePackage) {
    val entityName = entity.name
    val controllerPackage = basePackage + ".controllers"
    val controllerContent = '''
      package ''' + controllerPackage + ''';

      import org.springframework.web.bind.annotation.*;

      @RestController
      @RequestMapping("/''' + entityName.toLowerCase + '''")
      public class ''' + entityName + '''Controller {
        // Add controller methods based on the entity definition
      }
    '''
    fsa.generateFile('src/main/java/' + controllerPackage.replace('.', '/') + '/' + entityName + 'Controller.java', controllerContent)
  }
}
