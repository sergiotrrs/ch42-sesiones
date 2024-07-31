package com.famsa.app.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.famsa.app.model.User;
import com.famsa.app.service.UserService;

/**
 * CommandLineRunner es una interfaz en Spring Boot que se 
 * usa para ejecutar código específico una vez que la 
 * aplicación ha iniciado completamente. Es particularmente 
 * útil para ejecutar tareas de inicialización o configuración 
 * cuando se arranca la aplicación.
 */
@Configuration
public class SetUpApp implements CommandLineRunner {

	UserService userService;
	
	public SetUpApp(UserService userService) {
		this.userService = userService;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		userService.createUser( new User(
				"Serch", 
				"Torres", 
				"serch@gmail.com",
				"888", 
				null, 
				null, 
				true
				) );
	
		userService.createUser(new User("Mariana",
				"Alexa",
				"duendemalito@gmail.com",
				"999",
				null,
				null,
				true
				));
		
		userService.createUser( new User(
				"Marbe", 
				"Cabrera", 
				"marbe@gmail.com",
				"123", 
				null, 
				null, 
				true 
				) );
		
		userService.createUser( new User(
				"Diana", 
				"Gallegos", 
				"dianagp@gmail.com",
				"222", 
				null, 
				null, 
				true 
				) );
	
		
	}



}
