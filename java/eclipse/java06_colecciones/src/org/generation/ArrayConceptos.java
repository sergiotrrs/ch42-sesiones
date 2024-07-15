package org.generation;

public class ArrayConceptos {

	public static void main(String[] args) {
		/*
		 *  Las variables de tipo array se definen con corchetes []
		 *  Los corchetes pueden ir antes o después de la variable
		 *  ej. int[] myArray;
		 *      int myArray[]
		 *  
		 *  Para los array se debe asignar la cantidad de elementos
		 *  que contendrá.
		 *  Una vez definido, el arreglo no púede cambiar su tamaño
		 *      
		 *      
		 */
		// Definir un arreglo de 4 elementos de tipo int
		int[] colores = new int[4]; // instanciar un array de 4 elementos de tipo int
		
		// Agregar array con 6 elementos de tipo Persona
		Persona[] personas = new Persona[6];
		
		// Agregando un color en el índice 0 (primer elemento)
		colores[0] = 0x00_00_FF; // azul
		colores[2] = 0xFF_00_00; // rojo
		colores[1] = 0xFF_FF_00; // amarillo
		colores[3] = 0x00_00_00; // negro
		
		System.out.println("Valor color amarillo : " + colores[1]);
		
		/*
		 *  Si se intenta acceder a un elemento que no exista
		 *  se genera una excepción en tiempo de ejecución.
		 *  
		 * Index 10 out of bounds for length
		 */
		// System.out.println("Leer color que no existe: " + colores[10]);
		
		// Iterar un array usando for loop
		for(int i=0; i < colores.length; i++) {
			//System.out.println("índice " + i + " color " + colores[i]);
			String text = String.format( "Índice %d color %06X" ,i, colores[i] );
			System.out.println( text );
			
		}
		
		// for loop enhanced
		for(int color : colores ) {
			// System.out.println("Color: " + color );
			System.out.printf("color: %06X %n", color );
		}
		
		double myNumber = 123.34738;
		double myNumber2 = 3.2;
		System.out.printf("Mi PC cuesta $%5.2f %n", myNumber );
		System.out.printf("Mi PC cuesta $%5.2f %n", myNumber2 );
		
		/// Inicializar arreglos
		String[] frutas = {"Uva", "Fresa", "Manzana" };
		
		// Generar un arreglo de 2 dimensiones
		String[][] participantes = new String[3][2]; // 3 filas y 2 columnas
				
		/*  [ [], [ ,f1c1], [] ]
		 *  
		 *  [ 
		 *     [ f0c0 , f0c1 ] ,  
		 *     [ f1c0 , f1c1 ] ,  
		 *     [ f2c0 , f2c1 ]  
		 *  ]	
		 */
		participantes[1][1] = "Rubí";
				
				
				
		
	}

}
