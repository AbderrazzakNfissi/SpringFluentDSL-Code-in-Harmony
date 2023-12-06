import java.util.ArrayList;
import java.util.List;

public class Entity {
    private String name;
    private final List<Attribute> attributes = new ArrayList<>();
    private final List<Relationship> relationships = new ArrayList<>();


    public Entity(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public List<Relationship> getRelationships() {
        return relationships;
    }
}
