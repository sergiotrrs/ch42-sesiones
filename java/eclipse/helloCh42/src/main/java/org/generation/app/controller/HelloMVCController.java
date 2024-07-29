package org.generation.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*
 *  @Controller indica que la clase será un controlador MVC
 *  (Model-View-Controller). Esta clase se encarga de manejar
 *  las solicitudes HTTP y devuelve una respuesta(Vista).
 *  
 * 
 */

@Controller
public class HelloMVCController {

	/**
	 * @GetMaping mapea las solicitud http GET
	 * Entre paréntesis se indica la ruta donde se
	 * mapeará.
	 * 
	 */
	@GetMapping("/greetingCh42") // localhost:8080/greetingCh42
	public String greetingCh42() {
		// Comunicar con la lógica de negocio (model)
		// Dependiendo de la respuesta, se da la vista correspondiente
		return "saludo-pa-la-banda";
	}
	
	
}
