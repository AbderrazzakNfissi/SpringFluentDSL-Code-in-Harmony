package org.xtext.spring.fluent.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.spring.fluent.springFluentDSL.Entity

class ServiceGenerator {

  def void generateService(Entity entity, IFileSystemAccess2 fsa, String basePackage) {
    val entityName = entity.name
    val servicePackage = basePackage + ".services"
    val serviceContent = '''
      package ''' + servicePackage + ''';

      import org.springframework.stereotype.Service;

      @Service
      public class ''' + entityName + '''Service {
        // Add service methods based on the entity definition
      }
    '''
    fsa.generateFile('src/main/java/' + servicePackage.replace('.', '/') + '/' + entityName + 'Service.java', serviceContent)
  }
}
