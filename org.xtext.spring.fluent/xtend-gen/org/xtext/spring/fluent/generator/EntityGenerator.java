package org.xtext.spring.fluent.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.xtext.spring.fluent.springFluentDSL.Entity;

@SuppressWarnings("all")
public class EntityGenerator {
  public void generateEntity(final Entity entity, final IFileSystemAccess2 fsa, final String basePackage) {
    final String entityName = entity.getName();
    final String entityPackage = (basePackage + ".models");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _plus = (_builder.toString() + entityPackage);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("public class ");
    String _plus_1 = (_plus + _builder_1);
    String _plus_2 = (_plus_1 + entityName);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append(" ");
    _builder_2.append("{");
    _builder_2.newLine();
    _builder_2.append("        ");
    _builder_2.append("// Add fields, methods, and other members based on the entity definition");
    _builder_2.newLine();
    _builder_2.append("      ");
    _builder_2.append("}");
    _builder_2.newLine();
    final String entityContent = (_plus_2 + _builder_2);
    String _replace = entityPackage.replace(".", "/");
    String _plus_3 = ("src/main/java/" + _replace);
    String _plus_4 = (_plus_3 + "/");
    String _plus_5 = (_plus_4 + entityName);
    String _plus_6 = (_plus_5 + ".java");
    fsa.generateFile(_plus_6, entityContent);
  }
}
