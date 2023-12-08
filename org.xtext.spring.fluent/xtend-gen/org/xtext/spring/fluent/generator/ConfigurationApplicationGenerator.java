package org.xtext.spring.fluent.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;

@SuppressWarnings("all")
public class ConfigurationApplicationGenerator {
  public void generateApplicationProperties(final String applicationName, final IFileSystemAccess2 fsa) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# Spring application name");
    _builder.newLine();
    _builder.append("spring.application.name= ");
    String _plus = (_builder.toString() + applicationName);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.newLine();
    _builder_1.append("# Datasource configuration");
    _builder_1.newLine();
    _builder_1.append("spring.datasource.driver-class-name=org.h2.Driver");
    _builder_1.newLine();
    _builder_1.append("spring.datasource.url=jdbc:h2:mem:dbformation;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE");
    _builder_1.newLine();
    _builder_1.append("spring.datasource.username=sa");
    _builder_1.newLine();
    _builder_1.append("spring.datasource.password=");
    _builder_1.newLine();
    _builder_1.append("spring.h2.console.enabled=true");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("spring.application.admin.enabled=true");
    _builder_1.newLine();
    final String content = (_plus + _builder_1);
    fsa.generateFile("src/main/resources/application.properties", content);
  }
}
