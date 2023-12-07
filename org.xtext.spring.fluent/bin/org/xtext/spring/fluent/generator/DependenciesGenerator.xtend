package org.xtext.spring.fluent.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.spring.fluent.springFluentDSL.Dependencies
import org.xtext.spring.fluent.springFluentDSL.Dependency
import java.util.HashMap
import java.util.Map

class DependenciesGenerator {

    static val dependenciesMap = newHashMap(
        "SpringActuator" -> '''
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-actuator</artifactId>
            </dependency>
        ''',
        "SpringAMQP" -> '''
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-amqp</artifactId>
            </dependency>
        ''',
        "SpringBatch" -> '''
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-batch</artifactId>
            </dependency>
        ''',
        "SpringDataElasticsearch" -> '''
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-data-elasticsearch</artifactId>
            </dependency>
        ''',
        "SpringDataJDBC" -> '''
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-data-jdbc</artifactId>
            </dependency>
        ''',
        "SpringDataJPA" -> '''
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-data-jpa</artifactId>
            </dependency>
        ''',
        "SpringDataMongoDB" -> '''
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-data-mongodb</artifactId>
            </dependency>
        ''',
        "SpringDataRedis" -> '''
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-data-redis</artifactId>
            </dependency>
        ''',
        "SpringDataRest" -> '''
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-data-rest</artifactId>
            </dependency>
        ''',
        "SpringGraphQL" -> '''
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-graphql</artifactId>
            </dependency>
        ''',
        "SpringIntegration" -> '''
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-integration</artifactId>
            </dependency>
        ''',
        "SpringJDBC" -> '''
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-jdbc</artifactId>
            </dependency>
        ''',
        "SpringJersey" -> '''
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-jersey</artifactId>
            </dependency>
        ''',
        "SpringOAuth2Client" -> '''
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-oauth2-client</artifactId>
            </dependency>
        ''',
        "SpringSecurity" -> '''
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-security</artifactId>
            </dependency>
        ''',
        "SpringThymeleaf" -> '''
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-thymeleaf</artifactId>
            </dependency>
        ''',
        "SpringValidation" -> '''
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-validation</artifactId>
            </dependency>
        ''',
        "SpringWeb" -> '''
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-web</artifactId>
            </dependency>
        ''',
        "SpringWebServices" -> '''
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-web-services</artifactId>
            </dependency>
        ''',
        "SpringWebFlux" -> '''
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-webflux</artifactId>
            </dependency>
        ''',
        "SpringIntegrationAMQP" -> '''
            <dependency>
                <groupId>org.springframework.integration</groupId>
                <artifactId>spring-integration-amqp</artifactId>
            </dependency>
        ''',
        "SpringIntegrationHTTP" -> '''
            <dependency>
                <groupId>org.springframework.integration</groupId>
                <artifactId>spring-integration-http</artifactId>
            </dependency>
        ''',
        "SpringIntegrationJDBC" -> '''
            <dependency>
                <groupId>org.springframework.integration</groupId>
                <artifactId>spring-integration-jdbc</artifactId>
            </dependency>
        ''',
        "SpringIntegrationJPA" -> '''
            <dependency>
                <groupId>org.springframework.integration</groupId>
                <artifactId>spring-integration-jpa</artifactId>
            </dependency>
        ''',
        "SpringIntegrationKafka" -> '''
            <dependency>
                <groupId>org.springframework.integration</groupId>
                <artifactId>spring-integration-kafka</artifactId>
            </dependency>
        ''',
        "SpringIntegrationMongoDB" -> '''
            <dependency>
                <groupId>org.springframework.integration</groupId>
                <artifactId>spring-integration-mongodb</artifactId>
            </dependency>
        ''',
        "SpringIntegrationRedis" -> '''
            <dependency>
                <groupId>org.springframework.integration</groupId>
                <artifactId>spring-integration-redis</artifactId>
            </dependency>
        ''',
        "SpringIntegrationSecurity" -> '''
            <dependency>
                <groupId>org.springframework.integration</groupId>
                <artifactId>spring-integration-security</artifactId>
            </dependency>
        ''',
        "SpringIntegrationWebFlux" -> '''
            <dependency>
                <groupId>org.springframework.integration</groupId>
                <artifactId>spring-integration-webflux</artifactId>
            </dependency>
        ''',
        "DevTools" -> '''
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-devtools</artifactId>
                <version>3.2.0</version>
            </dependency>
        '''
       ,
        "Swagger" -> '''
        dependency>
        			<groupId>org.springdoc</groupId>
        			<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
        			<version>2.2.0</version>
        		</dependency>
        '''
       ,
        "SpringIntegrationWS" -> '''
            <dependency>
                <groupId>org.springframework.integration</groupId>
                <artifactId>spring-integration-ws</artifactId>
            </dependency>
        ''',
        "SpringKafka" -> '''
            <dependency>
                <groupId>org.springframework.kafka</groupId>
                <artifactId>spring-kafka</artifactId>
            </dependency>
        ''',
        "ThymeleafExtras" -> '''
            <dependency>
                <groupId>org.thymeleaf.extras</groupId>
                <artifactId>thymeleaf-extras-springsecurity6</artifactId>
            </dependency>
        ''',
        "SpringDevTools" -> '''
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-devtools</artifactId>
                <scope>runtime</scope>
                <optional>true</optional>
            </dependency>
        ''',
        "H2Database" -> '''
            <dependency>
                <groupId>com.h2database</groupId>
                <artifactId>h2</artifactId>
                <scope>runtime</scope>
            </dependency>
        ''',
        "MySQLConnector" -> '''
            <dependency>
                <groupId>com.mysql</groupId>
                <artifactId>mysql-connector-j</artifactId>
                <scope>runtime</scope>
            </dependency>
        ''',
        "OracleJDBC" -> '''
            <dependency>
                <groupId>com.oracle.database.jdbc</groupId>
                <artifactId>ojdbc11</artifactId>
                <scope>runtime</scope>
            </dependency>
        ''',
        "MariaDBConnector" -> '''
            <dependency>
                <groupId>org.mariadb.jdbc</groupId>
                <artifactId>mariadb-java-client</artifactId>
                <scope>runtime</scope>
            </dependency>
        ''',
        "PostgreSQL" -> '''
            <dependency>
                <groupId>org.postgresql</groupId>
                <artifactId>postgresql</artifactId>
                <scope>runtime</scope>
            </dependency>
        ''',
        "Lombok" -> '''
            <dependency>
                <groupId>org.projectlombok</groupId>
                <artifactId>lombok</artifactId>
                <optional>true</optional>
            </dependency>
        ''',
        "SpringBootTest" -> '''
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-test</artifactId>
                <scope>test</scope>
            </dependency>
        ''',
        "ReactorTest" -> '''
            <dependency>
                <groupId>io.projectreactor</groupId>
                <artifactId>reactor-test</artifactId>
                <scope>test</scope>
            </dependency>
        ''',
        "SpringRabbitTest" -> '''
            <dependency>
                <groupId>org.springframework.amqp</groupId>
                <artifactId>spring-rabbit-test</artifactId>
                <scope>test</scope>
            </dependency>
        ''',
        "SpringBatchTest" -> '''
            <dependency>
                <groupId>org.springframework.batch</groupId>
                <artifactId>spring-batch-test</artifactId>
                <scope>test</scope>
            </dependency>
        ''',
        "SpringGraphQLTest" -> '''
            <dependency>
                <groupId>org.springframework.graphql</groupId>
                <artifactId>spring-graphql-test</artifactId>
                <scope>test</scope>
            </dependency>
        ''',
        "SpringIntegrationTest" -> '''
            <dependency>
                <groupId>org.springframework.integration</groupId>
                <artifactId>spring-integration-test</artifactId>
                <scope>test</scope>
            </dependency>
        ''',
        "SpringKafkaTest" -> '''
            <dependency>
                <groupId>org.springframework.kafka</groupId>
                <artifactId>spring-kafka-test</artifactId>
                <scope>test</scope>
            </dependency>
        ''',
        "SpringSecurityTest" -> '''
            <dependency>
                <groupId>org.springframework.security</groupId>
                <artifactId>spring-security-test</artifactId>
                <scope>test</scope>
            </dependency>
        '''
    )

    def void generateDependencies(Dependencies dependencies, IFileSystemAccess2 fsa) {
        val existingContent = fsa.readTextFile('pom.xml')
        val dependenciesContent = '''
            <dependencies>
                '''+ dependencies.dependencies.map[generateDependency(it)].join('\n')+'''
            </dependencies>
            <build>
            		<plugins>
            			<plugin>
            				<groupId>org.springframework.boot</groupId>
            				<artifactId>spring-boot-maven-plugin</artifactId>
            			</plugin>
            		</plugins>
            	</build>
            </project>
        '''
        fsa.generateFile('pom.xml', existingContent + '\n' + dependenciesContent)
    }

    def String generateDependency(Dependency dependency) {
        val content = dependenciesMap.get(dependency.dependency.toString)
        return if (content != null) content else '''
            <!-- Unsupported dependency type: ${dependency.dependency} -->
        '''
    }
}
