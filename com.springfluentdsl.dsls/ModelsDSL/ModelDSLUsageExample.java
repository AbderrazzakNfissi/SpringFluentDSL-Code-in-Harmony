
/* Example:

User(
id => long, primary_key
username => String, not_primary_key

//You can whatever attributes you want
)

Role(
id => long, primary_key
name => String, not_primary_key
//You can whatever attributes you want
)


Relationship:

User:

Type : User : Many ------ One : Role
name: role
target: Role
mappedBy: users


Role:

Type : Role : One ------ Many : User
name: users
target: User
mappedBy: role




 */

public class ModelDSLUsageExample {
    public static void main(String[] args) {
        Entity userEntity = EntityBuilder.entity("User")
                .attribute("id", "Long", true)
                .attribute("username", "String", false)
                .relationship(RelationshipType.MANY_TO_ONE, "role", "Role", "users")
                .build();

        Entity roleEntity = EntityBuilder.entity("Role")
                .attribute("id", "Long", true)
                .attribute("name", "String", false)
                .relationship(RelationshipType.ONE_TO_MANY, "users", "User", "role")
                .build();

        // Now you can use userEntity and roleEntity to generate Spring Boot code or perform other actions.
    }
}
