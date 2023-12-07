package org.xtext.spring.fluent.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class EntryApplicationGenerator {
  public void generateEntryApplication(final String appName, final IFileSystemAccess2 fsa, final String basePackage) {
    final String entityPackage = basePackage;
    final String entryApplicationContent = this.generateEntryApplicationCode(entityPackage, appName);
    String _replace = entityPackage.replace(".", "/");
    String _plus = ("src/main/java/" + _replace);
    String _plus_1 = (_plus + "/");
    String _firstUpper = StringExtensions.toFirstUpper(appName);
    String _plus_2 = (_plus_1 + _firstUpper);
    String _plus_3 = (_plus_2 + "Application.java");
    fsa.generateFile(_plus_3, entryApplicationContent);
  }

  public String generateEntryApplicationCode(final String entityPackage, final String entityName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _plus = (_builder.toString() + entityPackage);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("import org.springframework.boot.CommandLineRunner;");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("import org.springframework.boot.SpringApplication;");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("import org.springframework.boot.autoconfigure.SpringBootApplication;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("@SpringBootApplication");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("public class ");
    String _plus_1 = (_plus + _builder_1);
    String _firstUpper = StringExtensions.toFirstUpper(entityName);
    String _plus_2 = (_plus_1 + _firstUpper);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("Application implements CommandLineRunner {");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("            ");
    _builder_2.append("public static void main(String[] args) {");
    _builder_2.newLine();
    _builder_2.append("                ");
    _builder_2.append("SpringApplication.run(");
    String _plus_3 = (_plus_2 + _builder_2);
    String _firstUpper_1 = StringExtensions.toFirstUpper(entityName);
    String _plus_4 = (_plus_3 + _firstUpper_1);
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("Application.class, args);");
    _builder_3.newLine();
    _builder_3.append("            ");
    _builder_3.append("}");
    _builder_3.newLine();
    _builder_3.newLine();
    _builder_3.append("            ");
    _builder_3.append("@Override");
    _builder_3.newLine();
    _builder_3.append("            ");
    _builder_3.append("public void run(String... strings) throws Exception {");
    _builder_3.newLine();
    _builder_3.append("                ");
    _builder_3.append("// You can add any initialization logic here");
    _builder_3.newLine();
    _builder_3.append("            ");
    _builder_3.append("}");
    _builder_3.newLine();
    _builder_3.append("        ");
    _builder_3.append("}");
    _builder_3.newLine();
    return (_plus_4 + _builder_3);
  }
}
