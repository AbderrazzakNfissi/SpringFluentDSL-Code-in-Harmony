package org.xtext.spring.fluent.generator;

import java.util.HashMap;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.xtext.spring.fluent.springFluentDSL.Dependencies;
import org.xtext.spring.fluent.springFluentDSL.Dependency;

@SuppressWarnings("all")
public class DependenciesGenerator {
  public void generateDependencies(final Dependencies dependencies, final IFileSystemAccess2 fsa) {
    final CharSequence existingContent = fsa.readTextFile("pom.xml");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<dependencies>");
    _builder.newLine();
    final Function1<Dependency, String> _function = (Dependency it) -> {
      return this.generateDependency(it);
    };
    String _join = IterableExtensions.join(ListExtensions.<Dependency, String>map(dependencies.getDependencies(), _function), "\n");
    String _plus = (_builder.toString() + _join);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("</dependencies>");
    _builder_1.newLine();
    _builder_1.append("</project>");
    _builder_1.newLine();
    final String dependenciesContent = (_plus + _builder_1);
    String _plus_1 = (existingContent + "\n");
    String _plus_2 = (_plus_1 + dependenciesContent);
    fsa.generateFile("pom.xml", _plus_2);
  }

  public String generateDependency(final Dependency dependency) {
    final HashMap<String, String> dependenciesMap = new HashMap<String, String>();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<groupId>org.springframework.boot</groupId>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<artifactId>spring-boot-starter-data-jpa</artifactId>");
    _builder.newLine();
    _builder.append("</dependency>");
    _builder.newLine();
    dependenciesMap.put("SpringDataJpa", _builder.toString());
    String _string = dependency.getDependency().toString();
    if (_string != null) {
      switch (_string) {
        case "SpringDataJpa":
          return dependenciesMap.get("SpringDataJpa");
        case "DevTools":
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("<dependency>");
          _builder_1.newLine();
          _builder_1.append("    ");
          _builder_1.append("<groupId>org.springframework.boot</groupId>");
          _builder_1.newLine();
          _builder_1.append("    ");
          _builder_1.append("<artifactId>spring-boot-devtools</artifactId>");
          _builder_1.newLine();
          _builder_1.append("    ");
          _builder_1.append("<scope>runtime</scope>");
          _builder_1.newLine();
          _builder_1.append("</dependency>");
          _builder_1.newLine();
          return _builder_1.toString();
        default:
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("<!-- Unsupported dependency type: ${dependency.dependency} -->");
          _builder_2.newLine();
          return _builder_2.toString();
      }
    } else {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("<!-- Unsupported dependency type: ${dependency.dependency} -->");
      _builder_2.newLine();
      return _builder_2.toString();
    }
  }
}
