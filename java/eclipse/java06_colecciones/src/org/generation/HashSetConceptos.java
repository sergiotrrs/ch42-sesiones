package org.generation;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetConceptos {

	public static void main(String[] args) {
		/*
		 * Una colección de tipo set es una colección NO ordenada.
		 *  - No se permiten elementos duplicados
		 *  - cualquier elemento duplicado no se insertará
		 *  
		 *  Sintaxis:
		 *    HashSet<Object> varName = new HashSet<>();
		 */
		// Definir una colección de nombre de paises con HashSet(String)
		HashSet <String> paises = new HashSet<>();
		
		// Agregamos valores con add()
		paises.add("Japón");
		paises.add("Colombia");
		paises.add("Suecia");
		paises.add("Canadá");
		paises.add("Alemania");
		paises.add("Reino Unido");
		paises.add("Genovia");
		paises.add("Narnia");
		paises.add("Wakanda");

		// Los elementos duplicados no se insertan
		paises.add("Colombia"); // Maricela
		paises.add("Japón"); // Arantxa
		
		System.out.println( paises );
		
		// Verificar si el elemento se insertó
		System.out.println("Es insertado: " + paises.add("Nueva Zelanda"));
		System.out.println("Es insertado: " + paises.add("Wakanda"));
		
		// Obtenemos el tamaño de la colección con size()
		System.out.println("Núm. paises: " + paises.size()); // 10
		
		// Verificar si existe un elemento con contains()
		System.out.println("Existe Narnia: " + paises.contains("Narnia"));
		
		// Remover un elemento con remove()
		System.out.println("Eliminado Wakanda? " + paises.remove("Wakanda"));
		System.out.println("Eliminado USA? " + paises.remove("USA"));
		
		// Iterar la colección
		for (String pais : paises) {
			System.out.println(pais);
		}
		
		// Crear una colección ArrayList de 15 elementos de String
		// duplica por lo menos 5 elementos
		//
		// Muestra solo los elementos únicos
		
		// Paso 1: Crear un Array List de String de Dulces
		ArrayList<String> dulces = new ArrayList<>();
		
		// Paso 2: Agregar nombres de dulces, repetir por lo menos 5
		dulces.add("Rockaleta");
		dulces.add("Chupirul");
		dulces.add("Picafresa");
		dulces.add("Larin");
		dulces.add("Aciduladito");
		dulces.add("Bombones");
		dulces.add("Skwinkles");
		dulces.add("Chocoretas");
		dulces.add("Rockaleta");
		dulces.add("Mazapán");
		dulces.add("Picafresa");
		dulces.add("Bombones");
		dulces.add("Manzana de caramelo");
		dulces.add("Manzana con chilito");
		dulces.add("Obleas");
		dulces.add("Obleas");
		
		System.out.println("Núm dulces: " + dulces.size() ); // 16
		
		// Paso 3: Crear una colección Hash Set
		HashSet<String> dulcesUnicos =  new HashSet<>();
		
		// Paso 4: Iterar los elementos del Array List
		        // Insertar los elementos del Array List en el Hash Set
		for (String dulce : dulces) {
			dulcesUnicos.add(dulce);
		}
		
		// PAso 5: Imprimir el núm de elementos del HashSet
		//         Imprimir los elementos del HashSet
		System.out.println("No repetidos: " + dulcesUnicos.size() );
		System.out.println( dulcesUnicos);
		
		
		

	}

}
