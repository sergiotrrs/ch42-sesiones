package org.generation;

public class DatosInmutables {

	public static void main(String[] args) {
		
		String nombre = "Mariana";
		nombre = "Audrey";
		nombre = "Diana";
		nombre = "Susy";
		nombre = "Dulce";
		nombre = null;
		nombre = "Mariana";
		nombre = new String("Audrey");
		
		nombre = "Diana";
		String participante = new String ("Diana");
	
		// if ( nombre == participante ) { Compara la referencia
		if( nombre.equals(participante) ) {
			System.out.println("El nombre es el mismo " + nombre);
		} else {
			System.out.println("Es diferente el nombre");
		}
		
		
		

	}

}
