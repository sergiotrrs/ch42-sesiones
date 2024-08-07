package com.famsa.app.config;

import java.time.LocalDate;

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
				"https://randomuser.me/api/portraits/men/55.jpg", 
				LocalDate.of(1983, 12, 8), 
				true
				) );
	
		userService.createUser(new User("Mariana",
				"Alexa",
				"duendemalito@gmail.com",
				"999",
				"https://randomuser.me/api/portraits/women/70.jpg", 
				LocalDate.of(2004, 1, 1), 
				true
				));
		
		userService.createUser( new User(
				"Marbe", 
				"Cabrera", 
				"marbe@gmail.com",
				"123", 
				"https://randomuser.me/api/portraits/women/71.jpg", 
				LocalDate.of(2004, 1, 1), 
				true 
				) );
		
		userService.createUser( new User(
				"Diana", 
				"Gallegos", 
				"dianagp@gmail.com",
				"222", 
				"https://randomuser.me/api/portraits/women/72.jpg", 
				LocalDate.of(2004, 1, 1),  
				true 
				) );
	
		
	}



}
