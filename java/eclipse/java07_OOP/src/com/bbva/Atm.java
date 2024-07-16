package com.bbva;

/**
 *  La OOP es un forma de modelar la vida real. La OOP facilita
 *  la organización del código de manera modular y reutilizable.
 *  
 *  Ventajas:
 *  1.- Reusabilidad: se puede reutilizar la creación de clases 
 *   usando la herencia.
 *  2.- Modularidad: El código se organiza en módulos(clases)
 *   que son fáciles de mantener y entender. Se sugiere usar los
 *   principios SOLID.
 *  3.- Extensibilidad: Es fácil extender el código mediante la 
 *   herencia
 *  4.- Mantenimiento: El encapsulamiento mejora la mantenibilidad 
 *   del código al ocultar los detalles(abstracción) internos y exponer
 *   solo lo necesario
 *  
 *  Clase: Una clase es una componente fundamental de la programación
 *  orientada a objeto(OOP: Object oriented Programming). 
 *  Una clase es una plantilla que define el
 *  comportamiento(métodos) y las propiedades(atributos) de los objetos
 *  que se crean(instancian) a partir de ella. Una clase puede
 *  considerarse como un plano o un molde a partir del cual se crean
 *  los objetos( instanciar la clase).
 *  
 */
public class Atm {
	
	// atributos de instancia (non-static fields)
	int serialNumber;
	String model = "A";
	double balance;
	
	// Bloque de inicialización de atributos de instancia
	{
		this.serialNumber = 1_000;
		this.model = "B";
	}
	
	// atributos de clase (static fields)
	static String bankName;
	
	// métodos constructores
	Atm(String model, double balance){
		this.model = "C";
		this.balance = balance;
	}
	
	// métodos de instancia(non-static methods)
	
	// métodos de clase(static methods) 
	

}
