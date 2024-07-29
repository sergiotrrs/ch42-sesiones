package org.generation.app.controller;


import java.util.List;

import org.generation.app.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *  Una API REST, o Interfaz de Programación de Aplicaciones Representacional 
 *  por sus siglas en inglés (Representational State Transfer), 
 *  es un conjunto de reglas y convenciones para construir 
 *  servicios web que permiten la comunicación entre sistemas 
 *  de software a través del protocolo HTTP de manera simple y eficiente.
 *  
 *  Beneficios: Permite que sistemas desarrollados en diferentes 
 *  lenguajes de programación y ejecutados en diferentes 
 *  plataformas puedan comunicarse entre sí.
 *  
 * @RestController indica que la clase será un controlador API REST
 * Esta anotación combina @Controller y @ResponseBody
 * 
 * @Controller Indica la clase como un controlador MVC (Model-View-Controller).
 *  Esta clase se encarga de manejar las solicitudes HTTP y devuelve una respuesta
 *  
 * @ResponseBody indica que los métodos devuelven la respuesta en el cuerpo de la
 *  respuesta HTTP. Los objetos devueltos por los métodos se serializan automáticamente
 *  en el formato deseado. Por default la respuesta es en JSON.
 *  
 * @RequestMapping mapea una solicitud HTTP en la URL indicada.
 *  Se puede aplicar a nivel de clase o método.
 *  A nivel de clase define el prefijo común de la URL para todas
 *  las rutas de los métodos.
 *  
 */
// @Controller
// @ResponseBody
@RestController
@CrossOrigin("*")
public class UserController {

	@GetMapping("api/v1/greeting")
	String saludoCh42ApiRest() {
		return "Qué transita por tus venas?";
	}
	
	@GetMapping("api/v1/users")
	List<User> getUsers(){
		return User.usersMock();
	}
	
}
