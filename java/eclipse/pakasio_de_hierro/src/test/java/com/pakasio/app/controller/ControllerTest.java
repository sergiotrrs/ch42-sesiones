package com.pakasio.app.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @SpringBootTest carga el contexto completo de la aplicación de Spring Boot,
 *                 lo que significa que todos los beans, configuraciones y
 *                 dependencias serán cargados. Esto es útil para realizar
 *                 pruebas de integración donde se necesita comprobar la
 *                 interacción entre varios componentes.
 */
@SpringBootTest
public class ControllerTest {

	@Autowired
	UserController userController;
	@Autowired
	UserDtoController userDtoController;
	@Autowired
	PurchaseHasProductsController purchaseHasProductController;

	/**
	 * 
	 */
	@Test // Indica que el método es un caso de prueba que JUnit debe ejecutar.
	@DisplayName("Verifica que los controladores no sean nulos y se carguen en en contexto de Spring")
	void contextLoads() {
		/*
		 * assertThat, método estático de la clase Assertions de la librería AssertJ,
		 * que proporciona una forma fluida de escribir aserciones.
		 */
		assertThat(userController).isNotNull();
		assertThat(userDtoController).isNotNull();
		assertThat(purchaseHasProductController).isNotNull();
	}

}
