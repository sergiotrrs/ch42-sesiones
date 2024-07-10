package org.generation;

import java.util.Scanner;

public class ClaseScanner {

	public static void main(String[] args) {
		/*
		 * La clase Scanner en Java es una clase útil 
		 * que se encuentra en el paquete java.util 
		 * y se utiliza para leer la entrada de varios 
		 * orígenes, como la entrada estándar (teclado)
		 * , archivos, cadenas, etc
		 */
		Scanner sc;
		sc = new Scanner( System.in );
		
		System.out.print("Escribe tu nombre: ");
		/*
		 * lee una línea completa de entrada como cadena de texto.
		 * Devuelve todo el texto de la línea, excluyendo el
		 * carácter de salto de línea(\n).
		 * 
		 * Buffer: Memoria temporal donde se almacenan los datos
		 * de entrada antes de ser procesados.
		 */
		String name = sc.nextLine(); // "Sergio Torres \n"		
		
		// Preguntar nombre de mascota y mostrar con Syso
		System.out.print("¿Cómo se llama tu mascota? ");
		String pet = sc.nextLine();
		
		System.out.println("Mi nombre es " + name);
		System.out.println("Mi mascota es " + pet);
		
		// Preguntar el número de suerte entre 1 y 10
		System.out.print("Dime tu núm. de suerte entre 1 y 10: ");
		
		// Verificar que exista un valor entero en el buffer
		if( sc.hasNextInt() ) {
				
			int luckyNumber = sc.nextInt(); // lee un valor entero del buffer
			sc.nextLine(); // Consumir el salto de línea pendiente
			
			if( luckyNumber >= 1 && luckyNumber <= 10 ) {
				System.out.println("Felicidades, también me gusta el " + luckyNumber);
			} else {
				System.out.println("Cámarada, te pedí del 1 al 10");
			}
			
		} else {
			System.out.println("Lo siento, no introdujiste un número");
			sc.nextLine(); // consumir todo lo que esté en el buffer
		}
	
		System.out.print("¿Tu tamal favorito es?: ");
		String tamalName = sc.nextLine();
		System.out.println("También me gusta el tamal de " + tamalName);
		
		
		sc.close(); // liberar los recursos que se utilizaron.		
		

	}

}
