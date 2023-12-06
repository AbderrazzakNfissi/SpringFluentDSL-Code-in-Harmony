package org.xtext.spring.fluent.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.spring.fluent.springFluentDSL.Dependencies
import org.xtext.spring.fluent.springFluentDSL.Dependency
import java.util.HashMap
import java.util.Map

class DependenciesGenerator {
	
	
    def void generateDependencies(Dependencies dependencies, IFileSystemAccess2 fsa) {
        val existingContent = fsa.readTextFile('pom.xml')
        val dependenciesContent = '''
            <dependencies>
                '''+dependencies.dependencies.map[this.generateDependency(it)].join('\n')+'''
            </dependencies>
            </project>
        '''
        fsa.generateFile('pom.xml', existingContent + '\n' + dependenciesContent)
    }

    def String generateDependency(Dependency dependency) {
    	val dependenciesMap = new HashMap<String, String>()
	dependenciesMap.put("SpringDataJpa", '''
    	<dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
	''');
        switch (dependency.dependency.toString) {
            case "SpringDataJpa" : return dependenciesMap.get("SpringDataJpa")
            case "DevTools": return '''
                <dependency>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-devtools</artifactId>
                    <scope>runtime</scope>
                </dependency>
            '''
            // Add other dependencies as needed
            default: return '''
                <!-- Unsupported dependency type: ${dependency.dependency} -->
            '''
        }
    }
}
