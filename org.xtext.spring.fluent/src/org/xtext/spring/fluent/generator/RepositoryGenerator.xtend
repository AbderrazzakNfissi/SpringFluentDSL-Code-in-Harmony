package org.xtext.spring.fluent.generator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.spring.fluent.springFluentDSL.Entity

class RepositoryGenerator {

  def void generateRepository(Entity entity, IFileSystemAccess2 fsa, String basePackage) {
    val entityName = entity.name
    val repositoryPackage = basePackage + ".repositories"
    val idType = entity.feature.id.type 
    
    val repositoryContent = '''
      package ''' + repositoryPackage + ''';

      import org.springframework.data.jpa.repository.JpaRepository;

      public interface ''' + entityName + '''Repository extends JpaRepository<''' + entityName + ''', '''+idType+'''> {
        // Add custom query methods if needed
      }
    '''
    fsa.generateFile('src/main/java/' + repositoryPackage.replace('.', '/') + '/' + entityName + 'Repository.java', repositoryContent)
  }
}
