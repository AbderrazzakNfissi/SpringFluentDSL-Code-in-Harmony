package org.xtext.spring.fluent.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.xtext.spring.fluent.springFluentDSL.Attribute;
import org.xtext.spring.fluent.springFluentDSL.Entity;

@SuppressWarnings("all")
public class ServiceGenerator {
  public void generateService(final Entity entity, final IFileSystemAccess2 fsa, final String basePackage) {
    final String entityName = entity.getName();
    final String servicePackage = (basePackage + ".services");
    final String serviceImplementationPackage = (servicePackage + ".implementations");
    final String serviceInterfaceContent = this.generateServiceInterfaceCode(entity, basePackage, servicePackage);
    final String serviceImplementationContent = this.generateServiceImplementationCode(entity, basePackage, servicePackage, serviceImplementationPackage);
    String _replace = servicePackage.replace(".", "/");
    String _plus = ("src/main/java/" + _replace);
    String _plus_1 = (_plus + "/");
    String _plus_2 = (_plus_1 + entityName);
    String _plus_3 = (_plus_2 + "Service.java");
    fsa.generateFile(_plus_3, serviceInterfaceContent);
    String _replace_1 = serviceImplementationPackage.replace(".", "/");
    String _plus_4 = ("src/main/java/" + _replace_1);
    String _plus_5 = (_plus_4 + "/");
    String _plus_6 = (_plus_5 + entityName);
    String _plus_7 = (_plus_6 + "ServiceImpl.java");
    fsa.generateFile(_plus_7, serviceImplementationContent);
  }

  public String generateServiceInterfaceCode(final Entity entity, final String basePackage, final String servicePackage) {
    String _xblockexpression = null;
    {
      final String entityName = entity.getName();
      final String exceptionPackage = (basePackage + ".exceptions.");
      final String exceptionNameNOTFOUND = (entityName + "NotFoundException");
      final String exceptionNameValidation = (entityName + "ValidationException");
      final String createMethodInterface = this.generateServiceCreateMethodSignature(entity);
      final String readAllMethodInterface = this.generateServiceReadAllMethodSignature(entity);
      final String readByIdMethodInterface = this.generateServiceReadByIdMethodSignature(entity);
      final String updateMethodInterface = this.generateServiceUpdateMethodSignature(entity);
      final String deleteMethodInterface = this.generateServiceDeleteMethodSignature(entity);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package ");
      String _plus = (_builder.toString() + servicePackage);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(";");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("import ");
      String _plus_1 = (_plus + _builder_1);
      String _plus_2 = (_plus_1 + exceptionPackage);
      String _plus_3 = (_plus_2 + "notfound.");
      String _plus_4 = (_plus_3 + exceptionNameNOTFOUND);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append(";");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("import ");
      String _plus_5 = (_plus_4 + _builder_2);
      String _plus_6 = (_plus_5 + exceptionPackage);
      String _plus_7 = (_plus_6 + "validation.");
      String _plus_8 = (_plus_7 + exceptionNameValidation);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append(";");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("import java.util.List;");
      _builder_3.newLine();
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("public interface ");
      String _plus_9 = (_plus_8 + _builder_3);
      String _plus_10 = (_plus_9 + entityName);
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("Service {");
      _builder_4.newLine();
      _builder_4.newLine();
      String _plus_11 = (_plus_10 + _builder_4);
      String _plus_12 = (_plus_11 + createMethodInterface);
      StringConcatenation _builder_5 = new StringConcatenation();
      _builder_5.append("       ");
      _builder_5.newLine();
      String _plus_13 = (_plus_12 + _builder_5);
      String _plus_14 = (_plus_13 + readAllMethodInterface);
      StringConcatenation _builder_6 = new StringConcatenation();
      _builder_6.append("       ");
      _builder_6.newLine();
      String _plus_15 = (_plus_14 + _builder_6);
      String _plus_16 = (_plus_15 + readByIdMethodInterface);
      StringConcatenation _builder_7 = new StringConcatenation();
      _builder_7.append("       ");
      _builder_7.newLine();
      String _plus_17 = (_plus_16 + _builder_7);
      String _plus_18 = (_plus_17 + updateMethodInterface);
      StringConcatenation _builder_8 = new StringConcatenation();
      _builder_8.append("       ");
      _builder_8.newLine();
      String _plus_19 = (_plus_18 + _builder_8);
      String _plus_20 = (_plus_19 + deleteMethodInterface);
      StringConcatenation _builder_9 = new StringConcatenation();
      _builder_9.append("}");
      _builder_9.newLine();
      _xblockexpression = (_plus_20 + _builder_9);
    }
    return _xblockexpression;
  }

  public String generateServiceImplementationCode(final Entity entity, final String basePackage, final String servicePackage, final String serviceImplementationPackage) {
    String _xblockexpression = null;
    {
      final String entityName = entity.getName();
      final String exceptionPackage = (basePackage + ".exceptions.");
      final String exceptionNameNOTFOUND = (entityName + "NotFoundException");
      final String exceptionNameValidation = (entityName + "ValidationException");
      final String repositoryPackage = (basePackage + ".repositories");
      final String repositoryName = (entityName + "Repository");
      final String createMethod = this.generateServiceCreateMethod(entity);
      final String readAllMethod = this.generateServiceReadAllMethod(entity);
      final String readByIdMethod = this.generateServiceReadByIdMethod(entity);
      final String updateMethod = this.generateServiceUpdateMethod(entity);
      final String deleteMethod = this.generateServiceDeleteMethod(entity);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package ");
      String _plus = (_builder.toString() + serviceImplementationPackage);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(";");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("import org.springframework.stereotype.Service;");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("import lombok.extern.slf4j.Slf4j;");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("import lombok.RequiredArgsConstructor;");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("import ");
      String _plus_1 = (_plus + _builder_1);
      String _plus_2 = (_plus_1 + repositoryPackage);
      String _plus_3 = (_plus_2 + ".");
      String _plus_4 = (_plus_3 + repositoryName);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append(";");
      _builder_2.newLine();
      _builder_2.append("    ");
      _builder_2.append("import ");
      String _plus_5 = (_plus_4 + _builder_2);
      String _plus_6 = (_plus_5 + exceptionPackage);
      String _plus_7 = (_plus_6 + "notfound.");
      String _plus_8 = (_plus_7 + exceptionNameNOTFOUND);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append(";");
      _builder_3.newLine();
      _builder_3.append("    ");
      _builder_3.append("import ");
      String _plus_9 = (_plus_8 + _builder_3);
      String _plus_10 = (_plus_9 + exceptionPackage);
      String _plus_11 = (_plus_10 + "validation.");
      String _plus_12 = (_plus_11 + exceptionNameValidation);
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append(";");
      _builder_4.newLine();
      _builder_4.append("    ");
      _builder_4.append("import org.springframework.transaction.annotation.Transactional;");
      _builder_4.newLine();
      _builder_4.append("    ");
      _builder_4.append("import java.util.List;");
      _builder_4.newLine();
      _builder_4.newLine();
      _builder_4.append("    ");
      _builder_4.append("@Service");
      _builder_4.newLine();
      _builder_4.append("    ");
      _builder_4.append("@RequiredArgsConstructor");
      _builder_4.newLine();
      _builder_4.append("    ");
      _builder_4.append("@Slf4j");
      _builder_4.newLine();
      _builder_4.append("    ");
      _builder_4.append("public class ");
      String _plus_13 = (_plus_12 + _builder_4);
      String _plus_14 = (_plus_13 + entityName);
      StringConcatenation _builder_5 = new StringConcatenation();
      _builder_5.append("ServiceImpl implements ");
      String _plus_15 = (_plus_14 + _builder_5);
      String _plus_16 = (_plus_15 + entityName);
      StringConcatenation _builder_6 = new StringConcatenation();
      _builder_6.append("Service {");
      _builder_6.newLine();
      _builder_6.newLine();
      _builder_6.append("        ");
      _builder_6.append("private final ");
      String _plus_17 = (_plus_16 + _builder_6);
      String _plus_18 = (_plus_17 + entityName);
      StringConcatenation _builder_7 = new StringConcatenation();
      _builder_7.append("Repository ");
      String _plus_19 = (_plus_18 + _builder_7);
      String _lowerCase = entityName.toLowerCase();
      String _plus_20 = (_plus_19 + _lowerCase);
      StringConcatenation _builder_8 = new StringConcatenation();
      _builder_8.append("Repository;");
      _builder_8.newLine();
      _builder_8.newLine();
      String _plus_21 = (_plus_20 + _builder_8);
      String _plus_22 = (_plus_21 + createMethod);
      StringConcatenation _builder_9 = new StringConcatenation();
      _builder_9.newLine();
      String _plus_23 = (_plus_22 + _builder_9);
      String _plus_24 = (_plus_23 + readAllMethod);
      StringConcatenation _builder_10 = new StringConcatenation();
      _builder_10.newLine();
      String _plus_25 = (_plus_24 + _builder_10);
      String _plus_26 = (_plus_25 + readByIdMethod);
      StringConcatenation _builder_11 = new StringConcatenation();
      _builder_11.newLine();
      String _plus_27 = (_plus_26 + _builder_11);
      String _plus_28 = (_plus_27 + updateMethod);
      StringConcatenation _builder_12 = new StringConcatenation();
      _builder_12.newLine();
      String _plus_29 = (_plus_28 + _builder_12);
      String _plus_30 = (_plus_29 + deleteMethod);
      StringConcatenation _builder_13 = new StringConcatenation();
      _builder_13.append("}");
      _builder_13.newLine();
      _xblockexpression = (_plus_30 + _builder_13);
    }
    return _xblockexpression;
  }

  public String generateServiceCreateMethodSignature(final Entity entity) {
    String _xifexpression = null;
    boolean _contains = entity.getFeature().getOperation().getOperation().contains("c");
    if (_contains) {
      String _xblockexpression = null;
      {
        final String entityName = entity.getName();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("public ");
        String _plus = (_builder.toString() + entityName);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(" ");
        _builder_1.append("create");
        String _plus_1 = (_plus + _builder_1);
        String _plus_2 = (_plus_1 + entityName);
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("(");
        String _plus_3 = (_plus_2 + _builder_2);
        String _plus_4 = (_plus_3 + entityName);
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append(" ");
        String _plus_5 = (_plus_4 + _builder_3);
        String _lowerCase = entityName.toLowerCase();
        String _plus_6 = (_plus_5 + _lowerCase);
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append(");");
        _builder_4.newLine();
        _xblockexpression = (_plus_6 + _builder_4);
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }

  public String generateServiceReadAllMethodSignature(final Entity entity) {
    String _xifexpression = null;
    boolean _contains = entity.getFeature().getOperation().getOperation().contains("r");
    if (_contains) {
      String _xblockexpression = null;
      {
        final String entityName = entity.getName();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("public List<");
        String _plus = (_builder.toString() + entityName);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("> getAll");
        String _plus_1 = (_plus + _builder_1);
        String _plus_2 = (_plus_1 + entityName);
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("s();");
        _builder_2.newLine();
        _xblockexpression = (_plus_2 + _builder_2);
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }

  public String generateServiceReadByIdMethodSignature(final Entity entity) {
    String _xifexpression = null;
    boolean _contains = entity.getFeature().getOperation().getOperation().contains("r");
    if (_contains) {
      String _xblockexpression = null;
      {
        final String entityName = entity.getName();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("public ");
        String _plus = (_builder.toString() + entityName);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(" ");
        _builder_1.append("get");
        String _plus_1 = (_plus + _builder_1);
        String _plus_2 = (_plus_1 + entityName);
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("ById(Long ");
        String _plus_3 = (_plus_2 + _builder_2);
        String _lowerCase = entityName.toLowerCase();
        String _plus_4 = (_plus_3 + _lowerCase);
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("Id);");
        _builder_3.newLine();
        _xblockexpression = (_plus_4 + _builder_3);
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }

  public String generateServiceUpdateMethodSignature(final Entity entity) {
    String _xifexpression = null;
    boolean _contains = entity.getFeature().getOperation().getOperation().contains("u");
    if (_contains) {
      String _xblockexpression = null;
      {
        final String entityName = entity.getName();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("public ");
        String _plus = (_builder.toString() + entityName);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(" ");
        _builder_1.append("update");
        String _plus_1 = (_plus + _builder_1);
        String _plus_2 = (_plus_1 + entityName);
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("(Long ");
        String _plus_3 = (_plus_2 + _builder_2);
        String _lowerCase = entityName.toLowerCase();
        String _plus_4 = (_plus_3 + _lowerCase);
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("Id, ");
        String _plus_5 = (_plus_4 + _builder_3);
        String _plus_6 = (_plus_5 + entityName);
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append(" ");
        _builder_4.append("updated");
        String _plus_7 = (_plus_6 + _builder_4);
        String _plus_8 = (_plus_7 + entityName);
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.append(") throws ");
        String _plus_9 = (_plus_8 + _builder_5);
        String _plus_10 = (_plus_9 + entityName);
        StringConcatenation _builder_6 = new StringConcatenation();
        _builder_6.append("ValidationException, ");
        String _plus_11 = (_plus_10 + _builder_6);
        String _plus_12 = (_plus_11 + entityName);
        StringConcatenation _builder_7 = new StringConcatenation();
        _builder_7.append("NotFoundException;");
        _builder_7.newLine();
        _xblockexpression = (_plus_12 + _builder_7);
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }

  public String generateServiceDeleteMethodSignature(final Entity entity) {
    String _xifexpression = null;
    boolean _contains = entity.getFeature().getOperation().getOperation().contains("d");
    if (_contains) {
      String _xblockexpression = null;
      {
        final String entityName = entity.getName();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("public void delete");
        String _plus = (_builder.toString() + entityName);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("(Long ");
        String _plus_1 = (_plus + _builder_1);
        String _lowerCase = entityName.toLowerCase();
        String _plus_2 = (_plus_1 + _lowerCase);
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("Id) throws ");
        String _plus_3 = (_plus_2 + _builder_2);
        String _plus_4 = (_plus_3 + entityName);
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("NotFoundException;");
        _builder_3.newLine();
        _xblockexpression = (_plus_4 + _builder_3);
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }

  public String generateServiceCreateMethod(final Entity entity) {
    String _xifexpression = null;
    boolean _contains = entity.getFeature().getOperation().getOperation().contains("c");
    if (_contains) {
      String _xblockexpression = null;
      {
        final String entityName = entity.getName();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("// Create");
        _builder.newLine();
        _builder.append("@Transactional");
        _builder.newLine();
        _builder.append("public ");
        String _plus = (_builder.toString() + entityName);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(" ");
        _builder_1.append("create");
        String _plus_1 = (_plus + _builder_1);
        String _plus_2 = (_plus_1 + entityName);
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("(");
        String _plus_3 = (_plus_2 + _builder_2);
        String _plus_4 = (_plus_3 + entityName);
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append(" ");
        String _plus_5 = (_plus_4 + _builder_3);
        String _lowerCase = entityName.toLowerCase();
        String _plus_6 = (_plus_5 + _lowerCase);
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append(") {");
        _builder_4.newLine();
        _builder_4.append("      \t  ");
        _builder_4.append("if (");
        String _plus_7 = (_plus_6 + _builder_4);
        String _lowerCase_1 = entityName.toLowerCase();
        String _plus_8 = (_plus_7 + _lowerCase_1);
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.append(" ");
        _builder_5.append("== null ) {");
        _builder_5.newLine();
        _builder_5.append("      \t        ");
        _builder_5.append("throw new ");
        String _plus_9 = (_plus_8 + _builder_5);
        String _plus_10 = (_plus_9 + entityName);
        StringConcatenation _builder_6 = new StringConcatenation();
        _builder_6.append("ValidationException(\"Invalid ");
        String _plus_11 = (_plus_10 + _builder_6);
        String _lowerCase_2 = entityName.toLowerCase();
        String _plus_12 = (_plus_11 + _lowerCase_2);
        StringConcatenation _builder_7 = new StringConcatenation();
        _builder_7.append(" ");
        _builder_7.append("data\");");
        _builder_7.newLine();
        _builder_7.append("      \t    ");
        _builder_7.append("}");
        _builder_7.newLine();
        _builder_7.append("          ");
        _builder_7.append("return ");
        String _plus_13 = (_plus_12 + _builder_7);
        String _lowerCase_3 = entityName.toLowerCase();
        String _plus_14 = (_plus_13 + _lowerCase_3);
        StringConcatenation _builder_8 = new StringConcatenation();
        _builder_8.append("Repository.saveAndFlush(");
        String _plus_15 = (_plus_14 + _builder_8);
        String _lowerCase_4 = entityName.toLowerCase();
        String _plus_16 = (_plus_15 + _lowerCase_4);
        StringConcatenation _builder_9 = new StringConcatenation();
        _builder_9.append(");");
        _builder_9.newLine();
        _builder_9.append("      ");
        _builder_9.append("}");
        _builder_9.newLine();
        _xblockexpression = (_plus_16 + _builder_9);
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }

  public String generateServiceReadAllMethod(final Entity entity) {
    String _xifexpression = null;
    boolean _contains = entity.getFeature().getOperation().getOperation().contains("r");
    if (_contains) {
      String _xblockexpression = null;
      {
        final String entityName = entity.getName();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("// Read");
        _builder.newLine();
        _builder.append("public List<");
        String _plus = (_builder.toString() + entityName);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("> getAll");
        String _plus_1 = (_plus + _builder_1);
        String _plus_2 = (_plus_1 + entityName);
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("s() {");
        _builder_2.newLine();
        _builder_2.append("          ");
        _builder_2.append("return ");
        String _plus_3 = (_plus_2 + _builder_2);
        String _lowerCase = entityName.toLowerCase();
        String _plus_4 = (_plus_3 + _lowerCase);
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("Repository.findAll();");
        _builder_3.newLine();
        _builder_3.append("      ");
        _builder_3.append("}");
        _builder_3.newLine();
        _xblockexpression = (_plus_4 + _builder_3);
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }

  public String generateServiceReadByIdMethod(final Entity entity) {
    String _xifexpression = null;
    boolean _contains = entity.getFeature().getOperation().getOperation().contains("r");
    if (_contains) {
      String _xblockexpression = null;
      {
        final String entityName = entity.getName();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("public ");
        String _plus = (_builder.toString() + entityName);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(" ");
        _builder_1.append("get");
        String _plus_1 = (_plus + _builder_1);
        String _plus_2 = (_plus_1 + entityName);
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("ById(Long ");
        String _plus_3 = (_plus_2 + _builder_2);
        String _lowerCase = entityName.toLowerCase();
        String _plus_4 = (_plus_3 + _lowerCase);
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("Id) {");
        _builder_3.newLine();
        _builder_3.append("          ");
        _builder_3.append("return ");
        String _plus_5 = (_plus_4 + _builder_3);
        String _lowerCase_1 = entityName.toLowerCase();
        String _plus_6 = (_plus_5 + _lowerCase_1);
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append("Repository.findById(");
        String _plus_7 = (_plus_6 + _builder_4);
        String _lowerCase_2 = entityName.toLowerCase();
        String _plus_8 = (_plus_7 + _lowerCase_2);
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.append("Id).orElse(null);");
        _builder_5.newLine();
        _builder_5.append("      ");
        _builder_5.append("}");
        _builder_5.newLine();
        _xblockexpression = (_plus_8 + _builder_5);
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }

  public String generateServiceUpdateMethod(final Entity entity) {
    String _xifexpression = null;
    boolean _contains = entity.getFeature().getOperation().getOperation().contains("u");
    if (_contains) {
      String _xblockexpression = null;
      {
        final String entityName = entity.getName();
        final Function1<Attribute, String> _function = (Attribute attribute) -> {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("updated");
          String _plus = (_builder.toString() + entityName);
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(".");
          String _plus_1 = (_plus + _builder_1);
          String _name = attribute.getName();
          String _plus_2 = (_plus_1 + _name);
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append(" ");
          _builder_2.append("= ");
          String _plus_3 = (_plus_2 + _builder_2);
          String _lowerCase = entityName.toLowerCase();
          String _plus_4 = (_plus_3 + _lowerCase);
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append(".");
          String _plus_5 = (_plus_4 + _builder_3);
          String _name_1 = attribute.getName();
          String _plus_6 = (_plus_5 + _name_1);
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append(";");
          _builder_4.newLine();
          return (_plus_6 + _builder_4);
        };
        final String attributes = IterableExtensions.join(ListExtensions.<Attribute, String>map(entity.getFeature().getAttributes(), _function));
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("// Update");
        _builder.newLine();
        _builder.append(" ");
        _builder.append("@Transactional");
        _builder.newLine();
        _builder.append("public ");
        String _plus = (_builder.toString() + entityName);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(" ");
        _builder_1.append("update");
        String _plus_1 = (_plus + _builder_1);
        String _plus_2 = (_plus_1 + entityName);
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("(Long ");
        String _plus_3 = (_plus_2 + _builder_2);
        String _lowerCase = entityName.toLowerCase();
        String _plus_4 = (_plus_3 + _lowerCase);
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("Id, ");
        String _plus_5 = (_plus_4 + _builder_3);
        String _plus_6 = (_plus_5 + entityName);
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append(" ");
        _builder_4.append("updated");
        String _plus_7 = (_plus_6 + _builder_4);
        String _plus_8 = (_plus_7 + entityName);
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.append(") throws ");
        String _plus_9 = (_plus_8 + _builder_5);
        String _plus_10 = (_plus_9 + entityName);
        StringConcatenation _builder_6 = new StringConcatenation();
        _builder_6.append("ValidationException, ");
        String _plus_11 = (_plus_10 + _builder_6);
        String _plus_12 = (_plus_11 + entityName);
        StringConcatenation _builder_7 = new StringConcatenation();
        _builder_7.append("NotFoundException {");
        _builder_7.newLine();
        _builder_7.append("        ");
        _builder_7.append("if (");
        String _plus_13 = (_plus_12 + _builder_7);
        String _lowerCase_1 = entityName.toLowerCase();
        String _plus_14 = (_plus_13 + _lowerCase_1);
        StringConcatenation _builder_8 = new StringConcatenation();
        _builder_8.append("Repository.existsById(");
        String _plus_15 = (_plus_14 + _builder_8);
        String _lowerCase_2 = entityName.toLowerCase();
        String _plus_16 = (_plus_15 + _lowerCase_2);
        StringConcatenation _builder_9 = new StringConcatenation();
        _builder_9.append("Id)) {");
        _builder_9.newLine();
        String _plus_17 = (_plus_16 + _builder_9);
        String _plus_18 = (_plus_17 + entityName);
        StringConcatenation _builder_10 = new StringConcatenation();
        _builder_10.append(" ");
        String _plus_19 = (_plus_18 + _builder_10);
        String _lowerCase_3 = entityName.toLowerCase();
        String _plus_20 = (_plus_19 + _lowerCase_3);
        StringConcatenation _builder_11 = new StringConcatenation();
        _builder_11.append(" ");
        _builder_11.append("= ");
        String _plus_21 = (_plus_20 + _builder_11);
        String _lowerCase_4 = entityName.toLowerCase();
        String _plus_22 = (_plus_21 + _lowerCase_4);
        StringConcatenation _builder_12 = new StringConcatenation();
        _builder_12.append("Repository.findById(");
        String _plus_23 = (_plus_22 + _builder_12);
        String _lowerCase_5 = entityName.toLowerCase();
        String _plus_24 = (_plus_23 + _lowerCase_5);
        StringConcatenation _builder_13 = new StringConcatenation();
        _builder_13.append("Id).orElse(null);");
        _builder_13.newLine();
        _builder_13.append("            ");
        _builder_13.append("if (");
        String _plus_25 = (_plus_24 + _builder_13);
        String _lowerCase_6 = entityName.toLowerCase();
        String _plus_26 = (_plus_25 + _lowerCase_6);
        StringConcatenation _builder_14 = new StringConcatenation();
        _builder_14.append(" ");
        _builder_14.append("!= null) {");
        _builder_14.newLine();
        _builder_14.append("                ");
        _builder_14.append("// Perform validation checks on the updated");
        String _plus_27 = (_plus_26 + _builder_14);
        String _plus_28 = (_plus_27 + entityName);
        StringConcatenation _builder_15 = new StringConcatenation();
        _builder_15.append(" ");
        _builder_15.append("object");
        _builder_15.newLine();
        _builder_15.append("                ");
        _builder_15.append("if (updated");
        String _plus_29 = (_plus_28 + _builder_15);
        String _plus_30 = (_plus_29 + entityName);
        StringConcatenation _builder_16 = new StringConcatenation();
        _builder_16.append(" ");
        _builder_16.append("== null ) {");
        _builder_16.newLine();
        _builder_16.append("                    ");
        _builder_16.append("throw new ");
        String _plus_31 = (_plus_30 + _builder_16);
        String _plus_32 = (_plus_31 + entityName);
        StringConcatenation _builder_17 = new StringConcatenation();
        _builder_17.append("ValidationException(\"Invalid updated ");
        String _plus_33 = (_plus_32 + _builder_17);
        String _plus_34 = (_plus_33 + entityName);
        StringConcatenation _builder_18 = new StringConcatenation();
        _builder_18.append(" ");
        _builder_18.append("data\");");
        _builder_18.newLine();
        _builder_18.append("                ");
        _builder_18.append("}");
        _builder_18.newLine();
        _builder_18.newLine();
        String _plus_35 = (_plus_34 + _builder_18);
        String _plus_36 = (_plus_35 + attributes);
        StringConcatenation _builder_19 = new StringConcatenation();
        _builder_19.append("return ");
        String _plus_37 = (_plus_36 + _builder_19);
        String _lowerCase_7 = entityName.toLowerCase();
        String _plus_38 = (_plus_37 + _lowerCase_7);
        StringConcatenation _builder_20 = new StringConcatenation();
        _builder_20.append("Repository.saveAndFlush(");
        String _plus_39 = (_plus_38 + _builder_20);
        String _lowerCase_8 = entityName.toLowerCase();
        String _plus_40 = (_plus_39 + _lowerCase_8);
        StringConcatenation _builder_21 = new StringConcatenation();
        _builder_21.append(");");
        _builder_21.newLine();
        _builder_21.append("            ");
        _builder_21.append("}");
        _builder_21.newLine();
        _builder_21.append("        ");
        _builder_21.append("}");
        _builder_21.newLine();
        _builder_21.newLine();
        _builder_21.append("        ");
        _builder_21.append("// Throw ");
        String _plus_41 = (_plus_40 + _builder_21);
        String _plus_42 = (_plus_41 + entityName);
        StringConcatenation _builder_22 = new StringConcatenation();
        _builder_22.append("NotFoundException if the ");
        String _plus_43 = (_plus_42 + _builder_22);
        String _lowerCase_9 = entityName.toLowerCase();
        String _plus_44 = (_plus_43 + _lowerCase_9);
        StringConcatenation _builder_23 = new StringConcatenation();
        _builder_23.append(" ");
        _builder_23.append("with the specified ID is not found");
        _builder_23.newLine();
        _builder_23.append("        ");
        _builder_23.append("throw new ");
        String _plus_45 = (_plus_44 + _builder_23);
        String _plus_46 = (_plus_45 + entityName);
        StringConcatenation _builder_24 = new StringConcatenation();
        _builder_24.append("NotFoundException(\"");
        String _plus_47 = (_plus_46 + _builder_24);
        String _plus_48 = (_plus_47 + entityName);
        StringConcatenation _builder_25 = new StringConcatenation();
        _builder_25.append(" ");
        _builder_25.append("not found with id: \" + ");
        String _plus_49 = (_plus_48 + _builder_25);
        String _lowerCase_10 = entityName.toLowerCase();
        String _plus_50 = (_plus_49 + _lowerCase_10);
        StringConcatenation _builder_26 = new StringConcatenation();
        _builder_26.append("Id);");
        _builder_26.newLine();
        _builder_26.append("    ");
        _builder_26.append("}");
        _builder_26.newLine();
        _xblockexpression = (_plus_50 + _builder_26);
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }

  public String generateServiceDeleteMethod(final Entity entity) {
    String _xifexpression = null;
    boolean _contains = entity.getFeature().getOperation().getOperation().contains("d");
    if (_contains) {
      String _xblockexpression = null;
      {
        final String entityName = entity.getName();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("// Delete");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("@Transactional");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("public void delete");
        String _plus = (_builder.toString() + entityName);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("(Long ");
        String _plus_1 = (_plus + _builder_1);
        String _lowerCase = entityName.toLowerCase();
        String _plus_2 = (_plus_1 + _lowerCase);
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("Id) throws ");
        String _plus_3 = (_plus_2 + _builder_2);
        String _plus_4 = (_plus_3 + entityName);
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("NotFoundException {");
        _builder_3.newLine();
        _builder_3.append("        ");
        _builder_3.append("Optional<");
        String _plus_5 = (_plus_4 + _builder_3);
        String _plus_6 = (_plus_5 + entityName);
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append("> optional");
        String _plus_7 = (_plus_6 + _builder_4);
        String _plus_8 = (_plus_7 + entityName);
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.append(" ");
        _builder_5.append("= ");
        String _plus_9 = (_plus_8 + _builder_5);
        String _lowerCase_1 = entityName.toLowerCase();
        String _plus_10 = (_plus_9 + _lowerCase_1);
        StringConcatenation _builder_6 = new StringConcatenation();
        _builder_6.append("Repository.findById(");
        String _plus_11 = (_plus_10 + _builder_6);
        String _lowerCase_2 = entityName.toLowerCase();
        String _plus_12 = (_plus_11 + _lowerCase_2);
        StringConcatenation _builder_7 = new StringConcatenation();
        _builder_7.append("Id);");
        _builder_7.newLine();
        _builder_7.append("        ");
        _builder_7.append("if (optional");
        String _plus_13 = (_plus_12 + _builder_7);
        String _plus_14 = (_plus_13 + entityName);
        StringConcatenation _builder_8 = new StringConcatenation();
        _builder_8.append(".isPresent()) {");
        _builder_8.newLine();
        String _plus_15 = (_plus_14 + _builder_8);
        String _lowerCase_3 = entityName.toLowerCase();
        String _plus_16 = (_plus_15 + _lowerCase_3);
        StringConcatenation _builder_9 = new StringConcatenation();
        _builder_9.append("Repository.deleteById(");
        String _plus_17 = (_plus_16 + _builder_9);
        String _lowerCase_4 = entityName.toLowerCase();
        String _plus_18 = (_plus_17 + _lowerCase_4);
        StringConcatenation _builder_10 = new StringConcatenation();
        _builder_10.append("Id);");
        _builder_10.newLine();
        _builder_10.append("        ");
        _builder_10.append("} else {");
        _builder_10.newLine();
        _builder_10.append("            ");
        _builder_10.append("throw new ");
        String _plus_19 = (_plus_18 + _builder_10);
        String _plus_20 = (_plus_19 + entityName);
        StringConcatenation _builder_11 = new StringConcatenation();
        _builder_11.append("NotFoundException(\"");
        String _plus_21 = (_plus_20 + _builder_11);
        String _plus_22 = (_plus_21 + entityName);
        StringConcatenation _builder_12 = new StringConcatenation();
        _builder_12.append(" ");
        _builder_12.append("not found with id : \" + ");
        String _plus_23 = (_plus_22 + _builder_12);
        String _lowerCase_5 = entityName.toLowerCase();
        String _plus_24 = (_plus_23 + _lowerCase_5);
        StringConcatenation _builder_13 = new StringConcatenation();
        _builder_13.append("Id);");
        _builder_13.newLine();
        _builder_13.append("        ");
        _builder_13.append("}");
        _builder_13.newLine();
        _builder_13.append("    ");
        _builder_13.append("}");
        _builder_13.newLine();
        _xblockexpression = (_plus_24 + _builder_13);
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
}
