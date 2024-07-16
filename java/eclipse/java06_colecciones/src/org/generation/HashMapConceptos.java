package org.generation;

import java.util.*;

public class HashMapConceptos {

	public static void main(String[] args) {
		/*
		 * Una colección Map, es una ralación clave(key): valor (value)
		 * que forma una tabla de datos
		 * 
		 *  - Nos funciona mejor para encontrar elementos
		 *  
		 *  Sintaxis:
		 *  HashMap< key, value > varName = new HashMap<>();
		 */
		
		// Realizar un directorio telefónico de personas
		HashMap< String , Persona > directorio  = new HashMap<>();
		
		// Agregar valores a la colección usando put()
		Persona amay = new Persona("Amay Sosa");
		directorio.put("4523659871", amay );
		
		directorio.put("5896321456", new Persona("Diana López"));
		directorio.put("9352687458", new Persona("Linda Olmedo"));
		directorio.put("1254712569", new Persona("Marbe Cabrera"));
		directorio.put("1258963147", new Persona("Rubi Medina"));
		
		// Reemplazar un elemento
		directorio.put("1258963147", new Persona("Abigail Ramírez") );
		
		// Obtener el valor usando get( key )
		System.out.println("Nombre de 9352687458 " + 
				directorio.get( "9352687458" ));
		// Remover un elemento usando remove( key )
		System.out.println("Elemento borrado " + 
				directorio.remove("1254712569" ));
		
		// Iterar la colección usando keys
		for(String numTelefonico  : directorio.keySet() ) {
			System.out.println(numTelefonico + 
					" " + directorio.get( numTelefonico ) );
		}
		
		// Iterar la colección usando los valores
		for( Persona  persona  : directorio.values() ) {
			System.out.println( persona );
		}
		
		directorio.put("5559999111", amay );
		System.out.println( directorio );
		
		
		// Quiero obtener el nombre de las personas en mi directorio
		// Sin repetir el nombre
		HashSet<Persona> personas = new HashSet<>(  directorio.values() );
		for (Persona persona : personas) {
			System.out.println("> " + persona.nombre );			
		}
		
	}

}
