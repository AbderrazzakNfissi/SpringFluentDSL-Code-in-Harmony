package org.xtext.spring.fluent.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.spring.fluent.springFluentDSL.Entity;
import org.xtext.spring.fluent.springFluentDSL.Model;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class SpringFluentDSLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final Model model = ((Model) _head);
    final String prefix = model.getPrefix().getPrefix();
    final String appName = model.getAppName().getAppName();
    final PomGenerator pomGenerator = new PomGenerator();
    final DependenciesGenerator dependenciesGenerator = new DependenciesGenerator();
    pomGenerator.generatePom(appName, fsa);
    dependenciesGenerator.generateDependencies(model.getDependencies(), fsa);
    String _lowerCase = appName.toLowerCase();
    final String basePackage = ("com." + _lowerCase);
    final EntityGenerator entityGenerator = new EntityGenerator();
    final ControllerGenerator controllerGenerator = new ControllerGenerator();
    final RepositoryGenerator repositoryGenerator = new RepositoryGenerator();
    final ServiceGenerator serviceGenerator = new ServiceGenerator();
    final EntryApplicationGenerator entryApplicationGenerator = new EntryApplicationGenerator();
    entryApplicationGenerator.generateEntryApplication(appName, fsa, basePackage);
    Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
    for (final Entity entity : _filter) {
      {
        entityGenerator.generateEntity(entity, fsa, basePackage);
        controllerGenerator.generateController(entity, fsa, basePackage, prefix);
        repositoryGenerator.generateRepository(entity, fsa, basePackage);
        serviceGenerator.generateService(entity, fsa, basePackage);
      }
    }
  }
}
