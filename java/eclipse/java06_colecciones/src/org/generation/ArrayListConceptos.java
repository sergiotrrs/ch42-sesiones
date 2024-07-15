package org.generation;

import java.util.ArrayList;

/*
 * Array List.
 * https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
 * 
 * Una colección List es una colección ...?
 *  - Es una colección ordenada (respeta el orden en que se agregan)
 *  - Se permite elementos duplicados
 *  - Se basa en un array redimensionable que crece su tamaño,
 *   según crece la colección de elementos.
 *  - Esta colección es la mejor rendimiento tiene.
 *  
 *  Sintaxis:
 *  ArrayList<object> varName = new ArrayList<>();
 *  
 *  <> Angle brackets
 *  
 * 
 */
public class ArrayListConceptos {

	public static void main(String[] args) {
		
		int age = 17;
		Integer edad = 18;
		
		// Definir una colección de datos numéricos
		// ArrayList<Integer> calificaciones =  new ArrayList< Integer >();
		ArrayList<Integer> calificaciones =  new ArrayList<>();
		
		// Crear un array list de Persona
		ArrayList<Persona> personas = new ArrayList<>();
		
		// Crear un array list de nombre de libros (String)
		ArrayList<String> libros = new ArrayList<>();
		
		// Agregar elementos con método add()
		// Los array list son de índice cero(primer elemento index 0)
		libros.add("El Conde de Monte Cristo"); // 0
		libros.add("El miedo me pela los dientes"); // 1
		libros.add("Cazadores de microbios"); // 2
		libros.add("1984"); // 3 Maricela
		libros.add("Blade Runner"); // 4
		
		System.out.println( libros );
		
		// Leer un elemento con método get()
		System.out.println("El libro de Maricela es " + libros.get(3) );
		
		// Obtener el tamaño de la colección usando size()
		System.out.println("Num. libros:  " + libros.size() );
		
		// Agregar elementos duplicados
		libros.add("1984"); // Mariana
		System.out.println( libros );

		// Remover un elemento usando remove()
		System.out.println("Eliminado: " + libros.remove(1));
		
		// Verificar si un elemento existe usando contains()
		System.out.println("Existe 1984? " + libros.contains("1984"));
		
		// Iterar usando for loop
		for(int i = 0; i < libros.size(); i++ ) {
			System.out.println(  libros.get(i) );
		}
		
		// Iterar usando for enhanced
		for( String libro : libros  ) {
			System.out.println("a Ch42 le gusta " + libro);
		}
		
		// Reemplazar un elemento usando set()
		libros.set( 2 , "El principito" );
		System.out.println( libros );
		
		
	}

}
