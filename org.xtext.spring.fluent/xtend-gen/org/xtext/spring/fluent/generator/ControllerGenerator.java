package org.xtext.spring.fluent.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.xtext.spring.fluent.springFluentDSL.Entity;

@SuppressWarnings("all")
public class ControllerGenerator {
  public void generateController(final Entity entity, final IFileSystemAccess2 fsa, final String basePackage, final String prefix) {
    final String entityName = entity.getName();
    final String controllerPackage = (basePackage + ".controllers");
    final String controllerContent = this.generateControllerCode(entity, prefix);
    String _replace = controllerPackage.replace(".", "/");
    String _plus = ("src/main/java/" + _replace);
    String _plus_1 = (_plus + "/");
    String _plus_2 = (_plus_1 + entityName);
    String _plus_3 = (_plus_2 + "Controller.java");
    fsa.generateFile(_plus_3, controllerContent);
  }

  public String generateControllerCode(final Entity entity, final String prefix) {
    String _xblockexpression = null;
    {
      final String entityName = entity.getName();
      final String saveMethod = this.generateControllerSaveMethod(entity);
      final String findByIdMethod = this.generateControllerFindByIdMethod(entity);
      final String findAllMethod = this.generateControllerFindAllMethod(entity);
      final String updateMethod = this.generateControllerUpdateMethod(entity);
      final String deleteByIdMethod = this.generateControllerDeleteByIdMethod(entity);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import lombok.RequiredArgsConstructor;");
      _builder.newLine();
      _builder.append("import lombok.extern.slf4j.Slf4j;");
      _builder.newLine();
      _builder.append("import org.springframework.http.HttpStatus;");
      _builder.newLine();
      _builder.append("import org.springframework.http.ResponseEntity;");
      _builder.newLine();
      _builder.append("import org.springframework.web.bind.annotation.*;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import java.util.List;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("@RestController");
      _builder.newLine();
      _builder.append("@RequestMapping(\"");
      String _plus = (_builder.toString() + prefix);
      String _plus_1 = (_plus + "/");
      String _lowerCase = entityName.toLowerCase();
      String _plus_2 = (_plus_1 + _lowerCase);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("\")");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("@RequiredArgsConstructor");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("@Slf4j");
      _builder_1.newLine();
      _builder_1.append("        ");
      _builder_1.append("public class ");
      String _plus_3 = (_plus_2 + _builder_1);
      String _plus_4 = (_plus_3 + entityName);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("Controller {");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("            ");
      _builder_2.append("private final ");
      String _plus_5 = (_plus_4 + _builder_2);
      String _plus_6 = (_plus_5 + entityName);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("Service ");
      String _plus_7 = (_plus_6 + _builder_3);
      String _lowerCase_1 = entityName.toLowerCase();
      String _plus_8 = (_plus_7 + _lowerCase_1);
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("Service; // Assurez-vous d\'avoir le service approprié injecté.");
      _builder_4.newLine();
      _builder_4.newLine();
      String _plus_9 = (_plus_8 + _builder_4);
      String _plus_10 = (_plus_9 + saveMethod);
      StringConcatenation _builder_5 = new StringConcatenation();
      _builder_5.newLine();
      String _plus_11 = (_plus_10 + _builder_5);
      String _plus_12 = (_plus_11 + findByIdMethod);
      StringConcatenation _builder_6 = new StringConcatenation();
      _builder_6.newLine();
      String _plus_13 = (_plus_12 + _builder_6);
      String _plus_14 = (_plus_13 + findAllMethod);
      StringConcatenation _builder_7 = new StringConcatenation();
      _builder_7.newLine();
      String _plus_15 = (_plus_14 + _builder_7);
      String _plus_16 = (_plus_15 + updateMethod);
      StringConcatenation _builder_8 = new StringConcatenation();
      _builder_8.newLine();
      String _plus_17 = (_plus_16 + _builder_8);
      String _plus_18 = (_plus_17 + deleteByIdMethod);
      StringConcatenation _builder_9 = new StringConcatenation();
      _builder_9.append("}");
      _builder_9.newLine();
      _xblockexpression = (_plus_18 + _builder_9);
    }
    return _xblockexpression;
  }

  public String generateControllerSaveMethod(final Entity entity) {
    String _xifexpression = null;
    boolean _contains = entity.getFeature().getOperation().getOperation().contains("c");
    if (_contains) {
      String _xblockexpression = null;
      {
        final String entityName = entity.getName();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("@PostMapping(\"/save\")");
        _builder.newLine();
        _builder.append("public ResponseEntity<");
        String _plus = (_builder.toString() + entityName);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("> save");
        String _plus_1 = (_plus + _builder_1);
        String _plus_2 = (_plus_1 + entityName);
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("(@RequestBody ");
        String _plus_3 = (_plus_2 + _builder_2);
        String _plus_4 = (_plus_3 + entityName);
        String _plus_5 = (_plus_4 + " ");
        String _lowerCase = entityName.toLowerCase();
        String _plus_6 = (_plus_5 + _lowerCase);
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append(") {");
        _builder_3.newLine();
        String _plus_7 = (_plus_6 + _builder_3);
        String _plus_8 = (_plus_7 + entityName);
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append(" ");
        _builder_4.append("saved");
        String _plus_9 = (_plus_8 + _builder_4);
        String _plus_10 = (_plus_9 + entityName);
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.append(" ");
        _builder_5.append("= ");
        String _plus_11 = (_plus_10 + _builder_5);
        String _lowerCase_1 = entityName.toLowerCase();
        String _plus_12 = (_plus_11 + _lowerCase_1);
        StringConcatenation _builder_6 = new StringConcatenation();
        _builder_6.append("Service.save(");
        String _plus_13 = (_plus_12 + _builder_6);
        String _lowerCase_2 = entityName.toLowerCase();
        String _plus_14 = (_plus_13 + _lowerCase_2);
        StringConcatenation _builder_7 = new StringConcatenation();
        _builder_7.append(");");
        _builder_7.newLine();
        _builder_7.append("\t            ");
        _builder_7.append("return new ResponseEntity<>(saved");
        String _plus_15 = (_plus_14 + _builder_7);
        String _plus_16 = (_plus_15 + entityName);
        StringConcatenation _builder_8 = new StringConcatenation();
        _builder_8.append(", HttpStatus.CREATED);");
        _builder_8.newLine();
        _builder_8.append("\t        ");
        _builder_8.append("}");
        _builder_8.newLine();
        _xblockexpression = (_plus_16 + _builder_8);
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }

  public String generateControllerFindByIdMethod(final Entity entity) {
    String _xifexpression = null;
    boolean _contains = entity.getFeature().getOperation().getOperation().contains("r");
    if (_contains) {
      String _xblockexpression = null;
      {
        final String entityName = entity.getName();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("@GetMapping(\"/{id}\")");
        _builder.newLine();
        _builder.append("public ResponseEntity<");
        String _plus = (_builder.toString() + entityName);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("> find");
        String _plus_1 = (_plus + _builder_1);
        String _plus_2 = (_plus_1 + entityName);
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("ById(@PathVariable Long id) {");
        _builder_2.newLine();
        String _plus_3 = (_plus_2 + _builder_2);
        String _plus_4 = (_plus_3 + entityName);
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append(" ");
        String _plus_5 = (_plus_4 + _builder_3);
        String _lowerCase = entityName.toLowerCase();
        String _plus_6 = (_plus_5 + _lowerCase);
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append(" ");
        _builder_4.append("= ");
        String _plus_7 = (_plus_6 + _builder_4);
        String _lowerCase_1 = entityName.toLowerCase();
        String _plus_8 = (_plus_7 + _lowerCase_1);
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.append("Service.findById(id);");
        _builder_5.newLine();
        _builder_5.append("\t            ");
        _builder_5.append("return new ResponseEntity<>(");
        String _plus_9 = (_plus_8 + _builder_5);
        String _lowerCase_2 = entityName.toLowerCase();
        String _plus_10 = (_plus_9 + _lowerCase_2);
        StringConcatenation _builder_6 = new StringConcatenation();
        _builder_6.append(", HttpStatus.OK);");
        _builder_6.newLine();
        _builder_6.append("\t        ");
        _builder_6.append("}");
        _builder_6.newLine();
        _xblockexpression = (_plus_10 + _builder_6);
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }

  public String generateControllerFindAllMethod(final Entity entity) {
    String _xifexpression = null;
    boolean _contains = entity.getFeature().getOperation().getOperation().contains("r");
    if (_contains) {
      String _xblockexpression = null;
      {
        final String entityName = entity.getName();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("@GetMapping(\"/all\")");
        _builder.newLine();
        _builder.append("public ResponseEntity<List<");
        String _plus = (_builder.toString() + entityName);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(">> findAll");
        String _plus_1 = (_plus + _builder_1);
        String _plus_2 = (_plus_1 + entityName);
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("s() {");
        _builder_2.newLine();
        _builder_2.append("\t            ");
        _builder_2.append("List<");
        String _plus_3 = (_plus_2 + _builder_2);
        String _plus_4 = (_plus_3 + entityName);
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("> ");
        String _plus_5 = (_plus_4 + _builder_3);
        String _lowerCase = entityName.toLowerCase();
        String _plus_6 = (_plus_5 + _lowerCase);
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append("s = ");
        String _plus_7 = (_plus_6 + _builder_4);
        String _lowerCase_1 = entityName.toLowerCase();
        String _plus_8 = (_plus_7 + _lowerCase_1);
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.append("Service.findAll();");
        _builder_5.newLine();
        _builder_5.append("\t            ");
        _builder_5.append("return new ResponseEntity<>(");
        String _plus_9 = (_plus_8 + _builder_5);
        String _lowerCase_2 = entityName.toLowerCase();
        String _plus_10 = (_plus_9 + _lowerCase_2);
        StringConcatenation _builder_6 = new StringConcatenation();
        _builder_6.append("s, HttpStatus.OK);");
        _builder_6.newLine();
        _builder_6.append("\t        ");
        _builder_6.append("}");
        _builder_6.newLine();
        _xblockexpression = (_plus_10 + _builder_6);
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }

  public String generateControllerUpdateMethod(final Entity entity) {
    String _xifexpression = null;
    boolean _contains = entity.getFeature().getOperation().getOperation().contains("u");
    if (_contains) {
      String _xblockexpression = null;
      {
        final String entityName = entity.getName();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("@PutMapping(\"/update/{id}\")");
        _builder.newLine();
        _builder.append("public ResponseEntity<");
        String _plus = (_builder.toString() + entityName);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("> update");
        String _plus_1 = (_plus + _builder_1);
        String _plus_2 = (_plus_1 + entityName);
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("(@PathVariable Long id, @RequestBody ");
        String _plus_3 = (_plus_2 + _builder_2);
        String _plus_4 = (_plus_3 + entityName);
        String _plus_5 = (_plus_4 + " updated");
        String _plus_6 = (_plus_5 + entityName);
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append(") {");
        _builder_3.newLine();
        String _plus_7 = (_plus_6 + _builder_3);
        String _plus_8 = (_plus_7 + entityName);
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append(" ");
        String _plus_9 = (_plus_8 + _builder_4);
        String _lowerCase = entityName.toLowerCase();
        String _plus_10 = (_plus_9 + _lowerCase);
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.append(" ");
        _builder_5.append("= ");
        String _plus_11 = (_plus_10 + _builder_5);
        String _lowerCase_1 = entityName.toLowerCase();
        String _plus_12 = (_plus_11 + _lowerCase_1);
        StringConcatenation _builder_6 = new StringConcatenation();
        _builder_6.append("Service.update(id, updated");
        String _plus_13 = (_plus_12 + _builder_6);
        String _plus_14 = (_plus_13 + entityName);
        StringConcatenation _builder_7 = new StringConcatenation();
        _builder_7.append(");");
        _builder_7.newLine();
        _builder_7.append("\t            ");
        _builder_7.append("return new ResponseEntity<>(");
        String _plus_15 = (_plus_14 + _builder_7);
        String _lowerCase_2 = entityName.toLowerCase();
        String _plus_16 = (_plus_15 + _lowerCase_2);
        StringConcatenation _builder_8 = new StringConcatenation();
        _builder_8.append(", HttpStatus.OK);");
        _builder_8.newLine();
        _builder_8.append("\t        ");
        _builder_8.append("}");
        _builder_8.newLine();
        _xblockexpression = (_plus_16 + _builder_8);
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }

  public String generateControllerDeleteByIdMethod(final Entity entity) {
    String _xifexpression = null;
    boolean _contains = entity.getFeature().getOperation().getOperation().contains("d");
    if (_contains) {
      String _xblockexpression = null;
      {
        final String entityName = entity.getName();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("@DeleteMapping(\"/delete/{id}\")");
        _builder.newLine();
        _builder.append("public ResponseEntity<Void> delete");
        String _plus = (_builder.toString() + entityName);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("ById(@PathVariable Long id) {");
        _builder_1.newLine();
        String _plus_1 = (_plus + _builder_1);
        String _lowerCase = entityName.toLowerCase();
        String _plus_2 = (_plus_1 + _lowerCase);
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("Service.deleteById(id);");
        _builder_2.newLine();
        _builder_2.append("\t            ");
        _builder_2.append("return new ResponseEntity<>(HttpStatus.NO_CONTENT);");
        _builder_2.newLine();
        _builder_2.append("\t        ");
        _builder_2.append("}");
        _builder_2.newLine();
        _xblockexpression = (_plus_2 + _builder_2);
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
}
