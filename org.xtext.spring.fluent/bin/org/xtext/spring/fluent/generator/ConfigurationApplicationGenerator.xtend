package org.xtext.spring.fluent.generator

import org.eclipse.xtext.generator.IFileSystemAccess2

class ConfigurationApplicationGenerator {

  def void generateApplicationProperties(String applicationName, IFileSystemAccess2 fsa) {
    val content = '''
      # Spring application name
      spring.application.name= ''' + applicationName + '''

      # Datasource configuration
      spring.datasource.driver-class-name=org.h2.Driver
      spring.datasource.url=jdbc:h2:mem:dbformation;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE
      spring.datasource.username=sa
      spring.datasource.password=
      spring.h2.console.enabled=true

      spring.application.admin.enabled=true
    '''
    fsa.generateFile('src/main/resources/application.properties', content)
  }
}
