package org.xtext.spring.fluent.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.xtext.spring.fluent.springFluentDSL.Entity;

@SuppressWarnings("all")
public class ServiceGenerator {
  public void generateService(final Entity entity, final IFileSystemAccess2 fsa, final String basePackage) {
    final String entityName = entity.getName();
    final String servicePackage = (basePackage + ".services");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _plus = (_builder.toString() + servicePackage);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("import org.springframework.stereotype.Service;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("@Service");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("public class ");
    String _plus_1 = (_plus + _builder_1);
    String _plus_2 = (_plus_1 + entityName);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("Service {");
    _builder_2.newLine();
    _builder_2.append("        ");
    _builder_2.append("// Add service methods based on the entity definition");
    _builder_2.newLine();
    _builder_2.append("      ");
    _builder_2.append("}");
    _builder_2.newLine();
    final String serviceContent = (_plus_2 + _builder_2);
    String _replace = servicePackage.replace(".", "/");
    String _plus_3 = ("src/main/java/" + _replace);
    String _plus_4 = (_plus_3 + "/");
    String _plus_5 = (_plus_4 + entityName);
    String _plus_6 = (_plus_5 + "Service.java");
    fsa.generateFile(_plus_6, serviceContent);
  }
}
