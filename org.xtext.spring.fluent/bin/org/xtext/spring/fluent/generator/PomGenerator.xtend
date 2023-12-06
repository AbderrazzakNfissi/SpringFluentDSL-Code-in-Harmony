package org.xtext.spring.fluent.generator

import org.eclipse.xtext.generator.IFileSystemAccess2

class PomGenerator {

    def void generatePom(String appName, IFileSystemAccess2 fsa) {
        val pomContent = '''
           <?xml version="1.0" encoding="UTF-8"?>
           <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
           	<modelVersion>4.0.0</modelVersion>
           	<parent>
           		<groupId>org.springframework.boot</groupId>
           		<artifactId>spring-boot-starter-parent</artifactId>
           		<version>3.1.3</version>
           		<relativePath/> <!-- lookup parent from repository -->
           	</parent>
           
           	<groupId>ma.'''+appName.toLowerCase+'''</groupId>
           	<artifactId>'''+appName+'''</artifactId>
           	<version>0.0.1-SNAPSHOT</version>
           	<name>'''+appName.toLowerCase+'''</name>
           	<description>'''+appName.toLowerCase+'''</description>
           
           	<properties>
           		<java.version>17</java.version>
           	</properties>
        '''
        fsa.generateFile('pom.xml', pomContent)
    }
}
