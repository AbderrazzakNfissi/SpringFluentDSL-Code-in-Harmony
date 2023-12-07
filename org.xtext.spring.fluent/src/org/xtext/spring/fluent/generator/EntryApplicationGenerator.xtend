package org.xtext.spring.fluent.generator

import org.eclipse.xtext.generator.IFileSystemAccess2

class EntryApplicationGenerator {

    def void generateEntryApplication(String appName, IFileSystemAccess2 fsa, String basePackage) {
        
        val entityPackage = basePackage

        // Generate Entry Application Class
        val entryApplicationContent = generateEntryApplicationCode(entityPackage, appName)
        
        fsa.generateFile('src/main/java/' + entityPackage.replace('.', '/') + '/' + appName.toFirstUpper + 'Application.java', entryApplicationContent)
    }

    def String generateEntryApplicationCode(String entityPackage, String entityName) {
        '''
        package ''' + entityPackage + ''';

        import org.springframework.boot.CommandLineRunner;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

        @SpringBootApplication
        public class ''' + entityName.toFirstUpper + '''Application implements CommandLineRunner {

            public static void main(String[] args) {
                SpringApplication.run(''' + entityName.toFirstUpper + '''Application.class, args);
            }

            @Override
            public void run(String... strings) throws Exception {
                // You can add any initialization logic here
            }
        }
        '''
    }
}
