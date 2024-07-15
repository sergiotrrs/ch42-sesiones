package org.generation;

/**
 *  Las funciones(métodos) son fundamentales por:
 *  
 *  - Reutilización del código.
 *  - Organizar el código.
 *  - Facilidad de depuración.
 *  - Mejora la legibilidad.
 *  - Abstracción: encapsular la lógica de una tarea
 */
public class Persona {     

	/*
	 *  https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
	 *  Sintaxis de un método:
	 *  
	 *   <modificadores_de_acceso> <tipo_retorno> nombreMétodo( parámetros ) <lista_de_excepciones> {
	 *   
	 *      // cuerpo del método
	 *   }
	 *   
	 *   Modificadores de acceso: public, protected, default, private.
	 *   Tipo retorno: Especifica el tipo de valor que el método devolverá( return ).
	 *   		Si el método no devuelve ningún valor(String, int, etc), 
	 *   		se usa la palabra reservada "void".
	 *   Nombre del método: Se recomienda comenzar el nombre con un verbo, 
	 *   		seguido por un adjetivo, sustantivo, etc. Usar la convención camelCase.
	 *   Parámetros: Lista de parámetros separados por coma.
	 *   
	 *   La firma del método es como:
	 *   nombreMétodo( double, int, double, double  )
	 *   
	 *   
	 */
	
    /**
     * Saludo a una persona
     * @param nombrePersona a quien se va a saludar
     * @return saludo amistoso
     */
	String saludar(String nombrePersona ){
		return "¿Qué onda " + nombrePersona + " ?";
	}
	
}
