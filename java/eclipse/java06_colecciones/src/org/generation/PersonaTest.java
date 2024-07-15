package org.generation;

import java.util.ArrayList;

public class PersonaTest {

	public static void main(String[] args) {
		// Crear un array list de Persona
		ArrayList<Persona> chicasCh42 = new ArrayList<>();
		
		Persona desire = new Persona();
		desire.nombre = "Desire";
		desire.saludar("Serch");
		
		Persona amay = new Persona();
		amay.nombre = "Amay";
		amay.saludar("Diana");
		
		Persona arlette = new Persona();
		arlette.nombre = "Arlette";
		arlette.saludar("Tan");
		
		chicasCh42.add( desire ); // 0
		chicasCh42.add( amay ); // 1
		chicasCh42.add( arlette ); // 2
		
		System.out.println("Num. Personas: " + chicasCh42.size());
				
		System.out.println( chicasCh42 );
		// Cambiar el nombre de Amay a Amayrani
		// amay.nombre = "Amayrani";
		chicasCh42.get(1).nombre = "AmaYrani";
		System.out.println( chicasCh42 );
		
		for( Persona chica  : chicasCh42 ) {
			System.out.println("Ch42: " + chica.nombre );			
		}
		
		

	}

}
