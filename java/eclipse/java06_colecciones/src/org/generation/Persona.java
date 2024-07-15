package org.generation;

public class Persona {

	// Atributos non-static (atributo de instancia)
	String nombre;
	// Artibutos static (atributos de clase)
	static String tipo;
	
	
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
