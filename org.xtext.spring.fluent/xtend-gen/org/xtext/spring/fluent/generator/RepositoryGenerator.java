package org.xtext.spring.fluent.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.xtext.spring.fluent.springFluentDSL.Entity;
import org.xtext.spring.fluent.springFluentDSL.Type;

@SuppressWarnings("all")
public class RepositoryGenerator {
  public void generateRepository(final Entity entity, final IFileSystemAccess2 fsa, final String basePackage) {
    final String entityName = entity.getName();
    final String repositoryPackage = (basePackage + ".repositories");
    final Type idType = entity.getFeature().getId().getType();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _plus = (_builder.toString() + repositoryPackage);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(";");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("import org.springframework.data.jpa.repository.JpaRepository;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("public interface ");
    String _plus_1 = (_plus + _builder_1);
    String _plus_2 = (_plus_1 + entityName);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("Repository extends JpaRepository<");
    String _plus_3 = (_plus_2 + _builder_2);
    String _plus_4 = (_plus_3 + entityName);
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append(", ");
    String _plus_5 = (_plus_4 + _builder_3);
    String _plus_6 = (_plus_5 + idType);
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("> {");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("// Add custom query methods if needed");
    _builder_4.newLine();
    _builder_4.append("      ");
    _builder_4.append("}");
    _builder_4.newLine();
    final String repositoryContent = (_plus_6 + _builder_4);
    String _replace = repositoryPackage.replace(".", "/");
    String _plus_7 = ("src/main/java/" + _replace);
    String _plus_8 = (_plus_7 + "/");
    String _plus_9 = (_plus_8 + entityName);
    String _plus_10 = (_plus_9 + "Repository.java");
    fsa.generateFile(_plus_10, repositoryContent);
  }
}
