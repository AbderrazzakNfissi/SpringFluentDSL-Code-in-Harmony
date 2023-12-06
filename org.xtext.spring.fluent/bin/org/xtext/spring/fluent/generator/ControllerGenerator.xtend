package org.xtext.spring.fluent.generator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.xtext.spring.fluent.springFluentDSL.Entity

class ControllerGenerator{
	
	def void generateController(Entity entity, IFileSystemAccess2 fsa, String basePackage,String prefix) {
        val entityName = entity.name
        val controllerPackage = basePackage + ".controllers"
        val controllerContent = generateControllerCode(entity, prefix)

        fsa.generateFile('src/main/java/' + controllerPackage.replace('.', '/') + '/' + entityName + 'Controller.java', controllerContent)
    }
    

    def String generateControllerCode(Entity entity, String prefix) {
        val entityName = entity.name
        val saveMethod = generateControllerSaveMethod(entity)
        val findByIdMethod = generateControllerFindByIdMethod(entity)
        val findAllMethod = generateControllerFindAllMethod(entity)
        val updateMethod = generateControllerUpdateMethod(entity)
        val deleteByIdMethod = generateControllerDeleteByIdMethod(entity)
        
        '''
        import lombok.RequiredArgsConstructor;
        import lombok.extern.slf4j.Slf4j;
        import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

        @RestController
        @RequestMapping("'''+prefix+"/"+ entityName.toLowerCase + '''")
        @RequiredArgsConstructor
        @Slf4j
        public class ''' + entityName + '''Controller {

            private final ''' + entityName + '''Service ''' + entityName.toLowerCase + '''Service; // Assurez-vous d'avoir le service approprié injecté.

            ''' + saveMethod + '''

            ''' + findByIdMethod + '''

            ''' + findAllMethod + '''

            ''' + updateMethod + '''

            ''' + deleteByIdMethod + '''
        }
        '''
    }
    

	def String generateControllerSaveMethod(Entity entity) {
	    if (entity.feature.operation.operation.contains("c")) {
	        val entityName = entity.name
	        '''
	        @PostMapping("/save")
	        public ResponseEntity<''' + entityName + '''> save''' + entityName + '''(@RequestBody ''' + entityName + ' ' + entityName.toLowerCase + ''') {
	            ''' + entityName + ''' saved''' + entityName + ''' = ''' + entityName.toLowerCase + '''Service.save(''' + entityName.toLowerCase + ''');
	            return new ResponseEntity<>(saved''' + entityName + ''', HttpStatus.CREATED);
	        }
	        '''
	    } else {
	        ''
	    }
	}

	def String generateControllerFindByIdMethod(Entity entity) {
	    if (entity.feature.operation.operation.contains("r")) {
	        val entityName = entity.name
	        '''
	        @GetMapping("/{id}")
	        public ResponseEntity<''' + entityName + '''> find''' + entityName + '''ById(@PathVariable Long id) {
	            ''' + entityName + ''' ''' + entityName.toLowerCase + ''' = ''' + entityName.toLowerCase + '''Service.findById(id);
	            return new ResponseEntity<>(''' + entityName.toLowerCase + ''', HttpStatus.OK);
	        }
	        '''
	    } else {
	        ''
	    }
	}

	def String generateControllerFindAllMethod(Entity entity) {
	    if (entity.feature.operation.operation.contains("r")) {
	        val entityName = entity.name
	        '''
	        @GetMapping("/all")
	        public ResponseEntity<List<''' + entityName + '''>> findAll''' + entityName + '''s() {
	            List<''' + entityName + '''> ''' + entityName.toLowerCase + '''s = ''' + entityName.toLowerCase + '''Service.findAll();
	            return new ResponseEntity<>(''' + entityName.toLowerCase + '''s, HttpStatus.OK);
	        }
	        '''
	    } else {
	        ''
	    }
	}

	def String generateControllerUpdateMethod(Entity entity) {
	    if (entity.feature.operation.operation.contains("u")) {
	        val entityName = entity.name
	        '''
	        @PutMapping("/update/{id}")
	        public ResponseEntity<''' + entityName + '''> update''' + entityName + '''(@PathVariable Long id, @RequestBody ''' + entityName + ' updated' + entityName + ''') {
	            ''' + entityName + ''' ''' + entityName.toLowerCase + ''' = ''' + entityName.toLowerCase + '''Service.update(id, updated''' + entityName + ''');
	            return new ResponseEntity<>(''' + entityName.toLowerCase + ''', HttpStatus.OK);
	        }
	        '''
	    } else {
	        ''
	    }
	}

   def String generateControllerDeleteByIdMethod(Entity entity) {
	    if (entity.feature.operation.operation.contains("d")) {
	        val entityName = entity.name
	        '''
	        @DeleteMapping("/delete/{id}")
	        public ResponseEntity<Void> delete''' + entityName + '''ById(@PathVariable Long id) {
	            ''' + entityName.toLowerCase + '''Service.deleteById(id);
	            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	        }
	        '''
	    } else {
	        ''
	    }

}

}
