package com.bbva.encapsulado;


/**
 *  Los pilares de OOP: encapsulación, herencia, polimorfismo, abstracción.
 *  
 *  Encapsulación: Principio de consiste en ocultar los detalles de como 
 *  funciona un objeto. Un aspecto importante de la encapsulación es el
 *  concepto de acceso controlado. Se puede establecer diferentes
 *  niveles de acceso para los atributos y métodos de un objeto.
 *  
 *  La encapsulación ofrece beneficios como:
 *  - Seguridad de datos: Ocultar los detalles internos o que los datos
 *  	sean modificados de manera incorrecta o no autorizada.
 *  - Modularidad: Se facilita la creacíón de componentes independientes
 *  	que pueden ser reutilizados.
 *  - Abstracción: Permite que los usuarios de un objeto se centren en
 *  	lo que hace el objeto en lugar de cómo lo hace.
 *  
 *  Niveles de acceso para la encapsulación:
 *  1.- Public: Son accesibles desde cualquier parte del código.
 *  2.- Protected: Son accesibles desde la misma clase, paquete y clases derivadas.
 *  3.- Default: Son accesibles dentro de la misma clase y del mismo paquete.
 *  4.- Private: Son accesibles dentro de la misma clase.
 * 
 */
public class Atm {
	
	private int serialNumber;
	private String model;
	private double amount;
	private static int counter;
	
	public Atm(String model, double amount){
		this.model = model.toUpperCase();
		this.amount = amount;
		this.serialNumber = ++counter;
	}
	
	/**
	 *  Sobre carga de métodos.
	 *  
	 *  La sobre carga de métodos( o constructores) se refiere
	 *  a la capacidad de una clase de tener múltiples métodos
	 *  con la misma firma, pero diferente lista de parámetros.
	 *  
	 *  Esto permite que los objetos de la clase, en el caso
	 *  de los costructores, sean inicializados de diferentes
	 *  maneras, proporcionando flexibilidad al programador
	 *  para instanciar la clase con diferentes conjuntos de
	 *  datos.
	 *  
	 *  La sobrecarga de métodos en Java es una 
	 *  característica que permite definir múltiples 
	 *  métodos con el mismo nombre pero con diferentes 
	 *  listas de parámetros (tipo y/o número de parámetros) 
	 *  dentro de una misma clase. Esto facilita la 
	 *  creación de tareas similares 
	 *  pero con diferentes tipos de datos o diferentes 
	 *  cantidades de información. 
	 *  
	 *  Reglas para la Sobrecarga de Métodos 
	 *  - Diferente número de parámetros: 
	 *  Puedes tener métodos con el mismo nombre pero con 
	 *  diferente cantidad de parámetros. 
	 *  - Diferente tipo de parámetros: Puedes tener métodos 
	 *  con el mismo nombre pero con diferentes tipos 
	 *  de parámetros. 
	 *  - Orden de los parámetros: Puedes cambiar el orden 
	 *  de los parámetros si tienen diferentes tipos.
	 */
	public Atm() {
		// ATM por defaul, Modelo: T-800, Amount: $1_000_000
        /*
         * Un constructor puede llamar a otro constructor
         * de la misma clase usando la palabra reservada
         * this. Esta llamada debe ser la primera instrucción
         * del constructor en uso.
         */
		this("t-800", 1_000_00);
		// más línea de código
	}
	
	/*
	 * Los métodos setters y getters son utilizados
	 * para acceder y modificar los
	 * valores de las propiedades privadas.
	 * 
	 * Ventajas:
	 *  - Encapsulamiento: protegen las propiedades privadas
	 *   de accesos no autorizados y modificaciones directas.
	 *  - Control: permite agregar lógica adicional en los métodos
	 *   como validaciones o transformaciones antes de obtener
	 *   o establacer un valor.
	 *  - Flexibilidad: Proporcionan una interfaz pública para 
	 *   acceder a las propiedades, lo que facilita el cambio
	 *   de la implementación interna sin afectar a los usuarios
	 *   de la clase. 
	 * 
	 */
	public void setModel(String newModel) {
		this.model = newModel;
	}
	
	public String getModel(){
		return this.model;
	}
	
	// realizar set ang get de amount
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	/**
	 * Sobre carga de setAmoun recibiendo
	 * un string
	 * 
	 */
	public void setAmount(String amount ) {
		setAmount(  Double.parseDouble(amount) );
	}
	
	public double getAmount(){
		return this.amount;
	}

	// realizar el get de serialNumber
	public int getSerialNumber() {
		return this.serialNumber;
	}
	
	// Método para saber el número total de cajeros creados
	/**
	 * Obtener el núm de cajeros creados
	 * @return núm de cajeros
	 */
	public static int getCounter(){
		return counter;
	}
	
	
	
	
}
