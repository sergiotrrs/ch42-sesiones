package org.generation;

public class CondicionalIf {

	public static void main(String[] args) {
		/*
		 * Sintaxis de la condicional if Si la condicional es verdadera, se ejecuta la
		 * instrucción de if
		 * 
		 * if ( condicional ) sentencia;
		 * 
		 * if ( condicional ) { 
		 *   sentencias; 
		 *   }
		 * 
		 * if ( condicional ) 
		 * 		sentencia; 
		 * else 
		 * 		sentencia_Si_condicional_es_falsa;
		 * ------------------------------------------------------ 
		 * if ( condicional )
		 *   sentencia; 
		 * else if ( nueva_condicional) 
		 *   sentencia; 
		 * else if ( n_condición ) 
		 *   sentencia; 
		 * else 
		 *   sentencia;
		 * 
		 */

		
	/*
	 * Verificar la edad de una persona, 
	 *   Si es mayor o igual a 18 años	imprimir: "Puede votar"
	 *   En caso contrario: "No puede votar"
	 */
	 int edad = 20;
	 String message;
	 
	 if( edad >= 18 ) message = "Puede votar";
	 else message = "No puede votar";
	 
	 System.out.println(message);
		
		
	}

}
