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
  
  val pomGenerator = new PomGenerator
        val dependenciesGenerator = new DependenciesGenerator

        // Generate Pom.xml
        pomGenerator.generatePom(appName, fsa)

        // Generate Dependencies
        dependenciesGenerator.generateDependencies(model.dependencies, fsa)
  
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

}
