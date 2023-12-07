package org.xtext.spring.fluent.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.xtext.spring.fluent.springFluentDSL.Entity;

@SuppressWarnings("all")
public class ExceptionsGenerator {
  public void generateExceptions(final Entity entity, final IFileSystemAccess2 fsa, final String basePackage) {
    final String entityName = entity.getName();
    final String entityPackage = (basePackage + ".exceptions");
    final String notFoundExceptionsPackage = (entityPackage + ".notFound");
    final String validationExceptionPackage = (entityPackage + ".validation");
    final String notFoundExceptionContent = this.generateNotFoundExceptionCode(notFoundExceptionsPackage, entityName);
    final String validationExceptionContent = this.generateValidationExceptionClass(validationExceptionPackage, entityName);
    String _replace = notFoundExceptionsPackage.replace(".", "/");
    String _plus = ("src/main/java/" + _replace);
    String _plus_1 = (_plus + "/");
    String _plus_2 = (_plus_1 + entityName);
    String _plus_3 = (_plus_2 + "NotFoundException.java");
    fsa.generateFile(_plus_3, notFoundExceptionContent);
    String _replace_1 = validationExceptionPackage.replace(".", "/");
    String _plus_4 = ("src/main/java/" + _replace_1);
    String _plus_5 = (_plus_4 + "/");
    String _plus_6 = (_plus_5 + entityName);
    String _plus_7 = (_plus_6 + "ValidationException.java");
    fsa.generateFile(_plus_7, validationExceptionContent);
  }

  public String generateNotFoundExceptionCode(final String entityPackage, final String entityName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _plus = (_builder.toString() + entityPackage);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("import org.springframework.http.HttpStatus;");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("import org.springframework.web.bind.annotation.ResponseStatus;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("@ResponseStatus(HttpStatus.NOT_FOUND)");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("public class ");
    String _plus_1 = (_plus + _builder_1);
    String _plus_2 = (_plus_1 + entityName);
    String _plus_3 = (_plus_2 + "NotFoundException extends RuntimeException {");
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.newLine();
    _builder_2.append("private static final long serialVersionUID = 1L;");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("public ");
    String _plus_4 = (_plus_3 + _builder_2);
    String _plus_5 = (_plus_4 + entityName);
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("NotFoundException() {");
    _builder_3.newLine();
    _builder_3.append("            ");
    _builder_3.append("}");
    _builder_3.newLine();
    _builder_3.newLine();
    _builder_3.append("            ");
    _builder_3.append("public ");
    String _plus_6 = (_plus_5 + _builder_3);
    String _plus_7 = (_plus_6 + entityName);
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("NotFoundException(String message) {");
    _builder_4.newLine();
    _builder_4.append("                ");
    _builder_4.append("super(message);");
    _builder_4.newLine();
    _builder_4.append("            ");
    _builder_4.append("}");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("}");
    _builder_4.newLine();
    return (_plus_7 + _builder_4);
  }

  public String generateValidationExceptionClass(final String entityPackage, final String entityName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _plus = (_builder.toString() + entityPackage);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(";");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("import org.springframework.http.HttpStatus;");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("import org.springframework.web.bind.annotation.ResponseStatus;");
    _builder_1.newLine();
    _builder_1.append("     ");
    _builder_1.newLine();
    _builder_1.append("     ");
    _builder_1.append("@ResponseStatus(HttpStatus.BAD_REQUEST)");
    _builder_1.newLine();
    _builder_1.append("     ");
    _builder_1.append("public class ");
    String _plus_1 = (_plus + _builder_1);
    String _plus_2 = (_plus_1 + entityName);
    String _plus_3 = (_plus_2 + "ValidationException extends RuntimeException {");
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.newLine();
    _builder_2.append("private static final long serialVersionUID = 1L;");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("public ");
    String _plus_4 = (_plus_3 + _builder_2);
    String _plus_5 = (_plus_4 + entityName);
    String _plus_6 = (_plus_5 + "ValidationException() {");
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("}");
    _builder_3.newLine();
    _builder_3.newLine();
    _builder_3.append("public ");
    String _plus_7 = (_plus_6 + _builder_3);
    String _plus_8 = (_plus_7 + entityName);
    String _plus_9 = (_plus_8 + "ValidationException() {");
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("        ");
    _builder_4.append("super(message);");
    _builder_4.newLine();
    _builder_4.append("    ");
    _builder_4.append("}");
    _builder_4.newLine();
    _builder_4.append("}");
    _builder_4.newLine();
    return (_plus_9 + _builder_4);
  }
}
