package org.xtext.spring.fluent.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.spring.fluent.springFluentDSL.Entity

class EntityGenerator {

  def void generateEntity(Entity entity, IFileSystemAccess2 fsa, String basePackage) {
    val entityName = entity.name
    val entityPackage = basePackage + ".models"
    val entityContent = '''
      package ''' + entityPackage + ''';

      public class ''' + entityName + ''' {
        // Add fields, methods, and other members based on the entity definition
      }
    '''
    fsa.generateFile('src/main/java/' + entityPackage.replace('.', '/') + '/' + entityName + '.java', entityContent)
  }
}
