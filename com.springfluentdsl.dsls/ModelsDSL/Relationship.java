public class Relationship {
    private RelationshipType type;
    private String name;
    private String targetEntity;
    private String mappedBy;

    public Relationship(RelationshipType type, String name, String targetEntity, String mappedBy) {
        this.type = type;
        this.name = name;
        this.targetEntity = targetEntity;
        this.mappedBy = mappedBy;
    }
}
