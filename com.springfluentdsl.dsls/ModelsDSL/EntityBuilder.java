// DSL Classe 1, this will provide an interface for constructing models

public class EntityBuilder {
    private final Entity entity;


    //Using Factory Method design pattern: the private constructor will be called by the factory method below
    private EntityBuilder(String name) {
        entity = new Entity(name);
    }


    // The factory method
    public static EntityBuilder entity(String name) {
        return new EntityBuilder(name);
    }


    //Method to add attribute to the entity
    public EntityBuilder attribute(String name, String type, boolean primaryKey) {
        Attribute attribute = new Attribute(name, type, primaryKey);
        entity.getAttributes().add(attribute);
        return this;
    }


    //Method to add relationship the entity
    public EntityBuilder relationship(RelationshipType type, String name, String targetEntity, String mappedBy) {
        Relationship relationship = new Relationship(type, name, targetEntity, mappedBy);
        entity.getRelationships().add(relationship);
        return this;
    }

    //Method to retrieve the final Entity(our class like Customer) instance
    public Entity build() {
        return entity;
    }
}
