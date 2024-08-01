package com.pakasio.app.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pakasio.app.model.User;
import com.pakasio.app.service.UserService;

@RestController
@RequestMapping("api/v1/users")
@CrossOrigin(origins = "*")
public class UserController {

	UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	/**
	 * La anotación @RequestBody en Spring MVC se utiliza para 
	 * vincular automáticamente el cuerpo de una solicitud HTTP 
	 * a un objeto en un método de controlador. Esta anotación 
	 * permite que los datos JSON (o XML) enviados en el cuerpo 
	 * de la solicitud se deserialicen y se conviertan en una 
	 * instancia de una clase Java que se puede utilizar en el 
	 * método del controlador.
	 * 
	 */
	@PostMapping
	ResponseEntity<User> createUser(@RequestBody User user) {
		User newUser = userService.createUser(user);
		return ResponseEntity.status(201).body(newUser);
		// return new ResponseEntity<User>(newUser, HttpStatus.CREATED);
	}

	/**
	 * La anotación @PathVariable en Spring MVC se utiliza para 
	 * extraer valores de la URL de una solicitud HTTP y vincularlos 
	 * a los parámetros de un método de controlador. Esto permite que 
	 * los parámetros dinámicos en la URL se pasen a los métodos del 
	 * controlador, facilitando la creación de rutas RESTful y 
	 * permitiendo la captura de valores específicos directamente 
	 * desde la URL.
	 * 
	 * Los valores dinámicos se definen en la URL de la solicitud 
	 * utilizando llaves {}. Estos valores pueden ser extraídos y 
	 * utilizados en los métodos del controlador.
	 */
	@GetMapping("{id}") // api/v1/users/10
	ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
		User existingUser = userService.getUserById(id);
		return ResponseEntity.ok(existingUser);
	}

	/**
	 * La anotación @RequestParam en Spring MVC se utiliza para 
	 * extraer parámetros de consulta de una solicitud HTTP y 
	 * vincularlos a los parámetros de un método del controlador. 
	 * Los parámetros de consulta son aquellos que se encuentran 
	 * en la URL después del signo de interrogación ? y suelen 
	 * utilizarse para pasar datos adicionales en las solicitudes GET.
	 * 
	 * 
	 */
	@GetMapping // api/v1/users?active=false
	ResponseEntity<Iterable<User>> getAllUsers(
			@RequestParam(name = "active", required = false, defaultValue = "true") 
			boolean active
			) {
		Iterable<User> existingUsers = userService.getAllUser(active);
		return ResponseEntity.ok(existingUsers);
	}

	@PutMapping("{id}")
	ResponseEntity<User> updateUser(@RequestBody User newUserData, @PathVariable("id") Long id) {
		User updatedUser = userService.updateUser(newUserData, id);
		return ResponseEntity.ok(updatedUser);
	}
	
	@DeleteMapping("{id}")
	ResponseEntity<String> deleteUser(@PathVariable("id") Long id) {
		userService.deleteUser(id);
		return ResponseEntity.status(204).body("User id " + id + " successfully deleted");
	}

}
