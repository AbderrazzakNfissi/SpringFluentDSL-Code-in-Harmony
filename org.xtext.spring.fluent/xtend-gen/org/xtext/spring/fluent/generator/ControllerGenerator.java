package org.xtext.spring.fluent.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.xtext.spring.fluent.springFluentDSL.Entity;

@SuppressWarnings("all")
public class ControllerGenerator {
  public void generateController(final Entity entity, final IFileSystemAccess2 fsa, final String basePackage) {
    final String entityName = entity.getName();
    final String controllerPackage = (basePackage + ".controllers");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _plus = (_builder.toString() + controllerPackage);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("import org.springframework.web.bind.annotation.*;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("@RestController");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("@RequestMapping(\"/");
    String _plus_1 = (_plus + _builder_1);
    String _lowerCase = entityName.toLowerCase();
    String _plus_2 = (_plus_1 + _lowerCase);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("\")");
    _builder_2.newLine();
    _builder_2.append("      ");
    _builder_2.append("public class ");
    String _plus_3 = (_plus_2 + _builder_2);
    String _plus_4 = (_plus_3 + entityName);
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("Controller {");
    _builder_3.newLine();
    _builder_3.append("        ");
    _builder_3.append("// Add controller methods based on the entity definition");
    _builder_3.newLine();
    _builder_3.append("      ");
    _builder_3.append("}");
    _builder_3.newLine();
    final String controllerContent = (_plus_4 + _builder_3);
    String _replace = controllerPackage.replace(".", "/");
    String _plus_5 = ("src/main/java/" + _replace);
    String _plus_6 = (_plus_5 + "/");
    String _plus_7 = (_plus_6 + entityName);
    String _plus_8 = (_plus_7 + "Controller.java");
    fsa.generateFile(_plus_8, controllerContent);
  }
}
