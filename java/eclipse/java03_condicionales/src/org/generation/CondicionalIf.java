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
	 
	 // Modificar lo anterior con un operador ternario
	 // condición ? sentencia_condicion_verdadera : sentencia_condicion_falsa
	 String mensaje = edad >= 21 ? "Mayor de edad en USA" : "Miércoles de plaza en Soriana";
	 System.out.println(mensaje);
	 
	 
	 
	 // --------------Ejercicio mental -----------------
	 edad = 20;
	 message = "";
	 
	 if( edad >=21 ) /* cuerpo del if */ ;{
		 System.out.println("Mensaje 1: Mayor de edad en USA");
	 }
	 System.out.println("Mensaje 2: Miércoles de plaza en Soriana");
	 
	 // ¿Que mensajes se imprime en consola? 
	 // R: mensaje 1 y mensaje 2 por el punto y coma que tiene if
	 
	 
	 // -------------If else-if --------------------
		edad = 15;
		message = "";

		if (edad <= 5)
			message = "Bebé";
		else if (edad >= 6 && edad <= 12)
			message = "niño o niña";
		else if (edad >= 13 && edad <= 17)
			message = "adolecente";
		else
			message = "persona adulta";

		System.out.println(message);
		
		
		
	}

}
