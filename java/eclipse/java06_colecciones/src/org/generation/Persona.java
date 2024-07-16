package org.generation;

public class Persona {

	// Atributos non-static (atributo de instancia)
	String nombre;
	// Artibutos static (atributos de clase)
	static String tipo;
	
	/*
	 * Regla de constructores:
	 *  - Debe tener el mismo nombre de la clase
	 *  - No debe tener nigún tipo de retorno
	 *  - Cuando no se agrega algún constructor Java agrega el default 
	 *  - Si agregas un constructor y requieres el default, debes agregarlo
	 */
	Persona(String nombrePersona ){
		nombre = nombrePersona;
		
	}
	
	Persona(){
		// Constructor Default
	}
	
	// Método sin retorno
	void saludar( String nombrePersonaASaludar ) {
		String nombreEnMayuscula = nombrePersonaASaludar.toUpperCase();
		System.out.println( nombre + " Hola " + nombrePersonaASaludar );		
	}
	
	@Override
	public String toString() {
		return "Soy " + nombre;
	}

}
