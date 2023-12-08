package org.xtext.spring.fluent.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.spring.fluent.springFluentDSL.Entity

class ExceptionsGenerator {
    
    def void generateExceptions(Entity entity, IFileSystemAccess2 fsa, String basePackage) {
        val entityName = entity.name
        val entityPackage = basePackage + ".exceptions"
        val notFoundExceptionsPackage = entityPackage+ ".notFound"
        val validationExceptionPackage = entityPackage+ ".validation"
        // Generate Exception Class
        val notFoundExceptionContent = generateNotFoundExceptionCode(notFoundExceptionsPackage, entityName)
        val validationExceptionContent = generateValidationExceptionClass(validationExceptionPackage, entityName)
        fsa.generateFile('src/main/java/' + notFoundExceptionsPackage.replace('.', '/') + '/' + entityName + 'NotFoundException.java', notFoundExceptionContent)
        fsa.generateFile('src/main/java/' + validationExceptionPackage.replace('.', '/') + '/' + entityName + 'ValidationException.java', validationExceptionContent)
    }

    def String generateNotFoundExceptionCode(String entityPackage, String entityName) {
        '''
        package ''' + entityPackage + ''';

        import org.springframework.http.HttpStatus;
        import org.springframework.web.bind.annotation.ResponseStatus;

        @ResponseStatus(HttpStatus.NOT_FOUND)
        public class ''' + entityName + 'NotFoundException extends RuntimeException {' + '''

            private static final long serialVersionUID = 1L;

            public ''' + entityName + '''NotFoundException() {
            }

            public ''' + entityName + '''NotFoundException(String message) {
                super(message);
            }
        }
        '''
    }
    
    def String generateValidationExceptionClass(String entityPackage, String entityName) {
    '''
    package ''' + entityPackage + ''';
    import org.springframework.http.HttpStatus;
    import org.springframework.web.bind.annotation.ResponseStatus;
     
     @ResponseStatus(HttpStatus.BAD_REQUEST)
     public class ''' + entityName + 'ValidationException extends RuntimeException {' + '''

        private static final long serialVersionUID = 1L;

        public ''' + entityName + 'ValidationException() {' + '''
        }

        public ''' + entityName + 'ValidationException() {' + '''
            super(message);
        }
    }
    '''
}
    
}
