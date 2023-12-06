package org.xtext.spring.fluent.generator;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.spring.fluent.springFluentDSL.Attribute;
import org.xtext.spring.fluent.springFluentDSL.Entity;
import org.xtext.spring.fluent.springFluentDSL.Operation;
import org.xtext.spring.fluent.springFluentDSL.Relation;
import org.xtext.spring.fluent.springFluentDSL.Type;

@SuppressWarnings("all")
public class EntityGenerator {
  public void generateEntity(final Entity entity, final IFileSystemAccess2 fsa, final String basePackage) {
    final String entityName = entity.getName();
    final String entityPackage = (basePackage + ".entities");
    final EList<Attribute> attributes = entity.getFeature().getAttributes();
    final EList<Relation> relations = entity.getFeature().getRelations();
    final Operation operations = entity.getFeature().getOperation();
    final String entityContent = this.generateEntityCode(entity, entityName, attributes, relations, operations);
    String _replace = entityPackage.replace(".", "/");
    String _plus = ("src/main/java/" + _replace);
    String _plus_1 = (_plus + "/");
    String _plus_2 = (_plus_1 + entityName);
    String _plus_3 = (_plus_2 + ".java");
    fsa.generateFile(_plus_3, entityContent);
  }

  public String generateEntityCode(final Entity entity, final String entityName, final Iterable<Attribute> attributes, final Iterable<Relation> relations, final Operation operations) {
    String _xblockexpression = null;
    {
      final Function1<Attribute, Boolean> _function = (Attribute a) -> {
        String _name = a.getName();
        return Boolean.valueOf(Objects.equal(_name, "id"));
      };
      final Attribute idAttribute = IterableExtensions.<Attribute>findFirst(attributes, _function);
      final Entity superType = entity.getSuperType();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package ma.nemo.assignment.entities;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import jakarta.persistence.*;");
      _builder.newLine();
      _builder.append("import lombok.AllArgsConstructor;");
      _builder.newLine();
      _builder.append("import lombok.Data;");
      _builder.newLine();
      _builder.append("import lombok.NoArgsConstructor;");
      _builder.newLine();
      _builder.append("import org.hibernate.annotations.CreationTimestamp;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import java.util.Date;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("@Entity");
      _builder.newLine();
      _builder.append("@Table(name = \"");
      String _plus = (_builder.toString() + entityName);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("\")");
      _builder_1.newLine();
      _builder_1.append("      ");
      _builder_1.append("@Data");
      _builder_1.newLine();
      _builder_1.append("      ");
      _builder_1.append("@AllArgsConstructor");
      _builder_1.newLine();
      _builder_1.append("      ");
      _builder_1.append("@NoArgsConstructor");
      _builder_1.newLine();
      _builder_1.append("      ");
      _builder_1.append("public class ");
      String _plus_1 = (_plus + _builder_1);
      String _plus_2 = (_plus_1 + entityName);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append(" ");
      String _plus_3 = (_plus_2 + _builder_2);
      String _xifexpression = null;
      if ((superType != null)) {
        String _firstUpper = StringExtensions.toFirstUpper(superType.getName());
        String _plus_4 = ("extends " + _firstUpper);
        _xifexpression = (_plus_4 + " ");
      } else {
        _xifexpression = "";
      }
      String _plus_5 = (_plus_3 + _xifexpression);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("{");
      _builder_3.newLine();
      String _plus_6 = (_plus_5 + _builder_3);
      String _generateIdCode = this.generateIdCode(entity.getFeature().getId().getType());
      String _plus_7 = (_plus_6 + _generateIdCode);
      String _generateAttributesCode = this.generateAttributesCode(attributes);
      String _plus_8 = (_plus_7 + _generateAttributesCode);
      String _generateRelationsCode = this.generateRelationsCode(entityName, relations);
      String _plus_9 = (_plus_8 + _generateRelationsCode);
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("}");
      _builder_4.newLine();
      _xblockexpression = (_plus_9 + _builder_4);
    }
    return _xblockexpression;
  }

  public String generateIdCode(final Type type) {
    String _xifexpression = null;
    if ((type != null)) {
      String _xblockexpression = null;
      {
        final String name = "id";
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("@Id");
        _builder.newLine();
        _builder.append("@GeneratedValue(strategy = GenerationType.IDENTITY)");
        _builder.newLine();
        _builder.append("private ");
        String _string = type.toString();
        String _plus = (_builder.toString() + _string);
        String _plus_1 = (_plus + " ");
        String _plus_2 = (_plus_1 + name);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(";");
        _builder_1.newLine();
        _xblockexpression = (_plus_2 + _builder_1);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }

  public String generateAttributesCode(final Iterable<Attribute> attributes) {
    final Function1<Attribute, String> _function = (Attribute a) -> {
      String _xblockexpression = null;
      {
        final String attributeName = a.getName();
        final String attributeType = this.mapAttributeType(a.getType());
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("private ");
        String _plus = (_builder.toString() + attributeType);
        String _plus_1 = (_plus + " ");
        String _lowerCase = attributeName.toLowerCase();
        String _plus_2 = (_plus_1 + _lowerCase);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(";");
        _builder_1.newLine();
        _xblockexpression = (_plus_2 + _builder_1);
      }
      return _xblockexpression;
    };
    return IterableExtensions.join(IterableExtensions.<Attribute, String>map(attributes, _function), "\n");
  }

  public String generateRelationsCode(final String entityName, final Iterable<Relation> relations) {
    final Function1<Relation, String> _function = (Relation r) -> {
      final String targetEntityName = r.getTarget().getName();
      final String relationType = r.getType();
      if (relationType != null) {
        switch (relationType) {
          case "mto":
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("@ManyToOne");
            _builder.newLine();
            _builder.append("@JoinColumn(name = \"");
            String _name = r.getName();
            String _plus = (_builder.toString() + _name);
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("_id\")");
            _builder_1.newLine();
            _builder_1.append("                    ");
            _builder_1.append("private ");
            String _plus_1 = (_plus + _builder_1);
            String _plus_2 = (_plus_1 + targetEntityName);
            String _plus_3 = (_plus_2 + " ");
            String _name_1 = r.getName();
            String _plus_4 = (_plus_3 + _name_1);
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append(";");
            _builder_2.newLine();
            return (_plus_4 + _builder_2);
          case "otm":
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("@OneToMany(mappedBy = \"");
            String _plus_5 = (_builder_3.toString() + entityName);
            StringConcatenation _builder_4 = new StringConcatenation();
            _builder_4.append("\")");
            _builder_4.newLine();
            _builder_4.append("                    ");
            _builder_4.append("private List<");
            String _plus_6 = (_plus_5 + _builder_4);
            String _plus_7 = (_plus_6 + targetEntityName);
            StringConcatenation _builder_5 = new StringConcatenation();
            _builder_5.append("> ");
            String _plus_8 = (_plus_7 + _builder_5);
            String _name_2 = r.getName();
            String _plus_9 = (_plus_8 + _name_2);
            StringConcatenation _builder_6 = new StringConcatenation();
            _builder_6.append(";");
            _builder_6.newLine();
            return (_plus_9 + _builder_6);
          case "oto":
            StringConcatenation _builder_7 = new StringConcatenation();
            _builder_7.append("@OneToOne");
            _builder_7.newLine();
            _builder_7.append("private ");
            String _plus_10 = (_builder_7.toString() + targetEntityName);
            String _plus_11 = (_plus_10 + " ");
            String _name_3 = r.getName();
            String _plus_12 = (_plus_11 + _name_3);
            StringConcatenation _builder_8 = new StringConcatenation();
            _builder_8.append(";");
            _builder_8.newLine();
            return (_plus_12 + _builder_8);
          case "mtm":
            StringConcatenation _builder_9 = new StringConcatenation();
            _builder_9.append("@ManyToMany");
            _builder_9.newLine();
            _builder_9.append("private List<");
            String _plus_13 = (_builder_9.toString() + targetEntityName);
            StringConcatenation _builder_10 = new StringConcatenation();
            _builder_10.append("> ");
            String _plus_14 = (_plus_13 + _builder_10);
            String _name_4 = r.getName();
            String _plus_15 = (_plus_14 + _name_4);
            String _plus_16 = (_plus_15 + "s");
            StringConcatenation _builder_11 = new StringConcatenation();
            _builder_11.append(";");
            _builder_11.newLine();
            return (_plus_16 + _builder_11);
          default:
            return "";
        }
      } else {
        return "";
      }
    };
    return IterableExtensions.join(IterableExtensions.<Relation, String>map(relations, _function), "\n");
  }

  public String mapAttributeType(final Type attributeType) {
    String _string = attributeType.toString();
    if (_string != null) {
      switch (_string) {
        case "Long":
          return "Long";
        case "Integer":
          return "Integer";
        case "Double":
          return "Double";
        case "String":
          return "String";
        case "Date":
          return "Date";
        case "Time":
          return "Time";
        case "Boolean":
          return "Boolean";
        default:
          return "Object";
      }
    } else {
      return "Object";
    }
  }
}
