package com.famsa.app.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;

/**
 *  @Entity se usa para marcar una clase como una entidad
 *  que se puede persistir en una base de datos relacional.
 *  
 *  Se indica a JPA que la clase representa una tabla
 *  en la base de datos y que los objetos de esta clase
 *  puedan ser almacenados, actualizados o eliminados en 
 *  dicha tabla. Además, cada instancia se la clase se considera
 *  una fila en la tabla.
 */
@Entity
public class User {
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String avatar;
	private LocalDate  birthdate;
	private boolean active;
	
	

}
