package org.generation;

public class CicloFor {

	public static void main(String[] args) {
		/*
		 * Sintaxis:
		 * 
		 * for( expresion_inicial ; comparacion; expresion_final) 
		 * 	instrucción;
		 * 
		 * for( expresion_inicial ; comparacion; expresion_final){ 
		 *      instrucciones; 
		 *   }
		 * 
		 */
		
		for(int iteracion=1; iteracion < 6; iteracion++ ) {
			System.out.println("Núm. Iteración: " + iteracion);
		}
		
		
		
		int iteracion = 1;
		for(  ;  ;  ) {
			if( iteracion > 5 ) break;
			System.out.println("Núm. Iteración: " + iteracion++);
		}
		
		System.out.println("Valor final de iteracion: " + iteracion );

		// Cuántas veces se ejecuta la línea 19? 1,2,3,4,5
		// Valor final de línea 23? 6
		
		ciclo:
		for (int i = 0; i < 5; i++) { // i = i + 1
			System.out.println("Valor de i: " + i);
			if( i > 3 ) break ciclo;
		}
		// Qué imprime la línea 37 ? 0,1,2,3,4
		
		// Tabla de multiplicación del 1 al 10
		principal:
		for (int i = 1; i <= 5; i++) {
			
			secundario:
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j) );
				if ( j >= 7 ) break principal;
			}				
			
		}	
		// Qué tablas de multiplicar se imprime? 1*1, 1*2 ... 1*7
				
		// Uso de continue
		// Se usa para saltar la iteración actual del bucle y
		// continuar a la siguiente iteración.
		
		// Imprimir los números impares del 1 al 20(incluyendo)
		for (int i = 1; i <= 20; i++) {
			if( i % 2 == 0 ) continue;
			System.out.println("Valor impar: " + i);
		}
		
		
		/*
		 * Escribir un programa que muestre en pantalla los números del 1 al 20,
		 * sustituyendo los múltiplos de 3 por la palabra “fizz”, 
		 * los múltiplos de 5 por la palabra "buzz"
		 * los múltiplos de ambos por la palabra "fizzbuzz", es decir, 
		 * los múltiplos de 3 y 5,
		 * 
		 * 
		 * 1
		 * 2 
		 * fizz 
		 * 4 
		 * buzz
		 * fizz 
		 * 7
		 * 8
		 * fizz
		 * buzz
		 * 11
		 * fizz
		 * 13
		 * 14
		 * fizzbuzz
		 * 16
		 * 17
		 * fizz
		 * 19
		 * buzz
		 *  
		 */
		
		int fin = 20;
		String message;
		for (int i = 1; i <= fin; i++ ) {								
			if ( i % 3 == 0 && i % 5 == 0 ) {
				System.out.println("fizzbuz");
			} else if ( i % 3 == 0 ) {
				System.out.println("fizz");
			} else if ( i % 5 == 0 ) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
		}
		
		
	}

}
