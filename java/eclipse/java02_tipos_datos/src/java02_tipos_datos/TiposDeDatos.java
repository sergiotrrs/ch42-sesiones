package java02_tipos_datos;

public class TiposDeDatos {

	public static void main(String[] args) {
	// Comentario de Línea
	     /*
         * Este es un comentario de bloque
         * 
         * Reglas para el nombre de las variables:
		 *  - Se distingue entre minúsculas y mayúsculas
		 *  - La longitud del nombre es ilimitada
		 *  - Puedes utilizar cualquier caracter Unicode
		 *  - La variable puede comenzar:
		 *    > una letra ej. miVariable
		 *    > signo de dolar $miVariable
		 *    > caracter de subrayado(underscore) _miVariable
		 *  - No se permiten espacios en el nombre
		 *  - El nombre de la variable debe tener un contexto, ser claro
		 *   			      			https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html
         */	
		
		// Para declarar una variable, 
		// se indica el tipo de dato y el nombre de la variable
		int $miVar; // es válida, pero no se recomienda
		int _numEngranes; // es válida, pero no se recomienda
		// int #numPersonas; // no es válida
		// int 5comentarios; // no es válida
		int sinC0m3nt4r10s; // es válida, no es clara el nombre
		
		/*
		 * En Java tendremos  los siguientes tipo de variables:
		 *  Variables de instancia (Non static fields): atributos de los objetos.
		 *  Variables de clase (Static Fields): atributos de la clase.
		 *  Variables locales (local variables): variable dentro de las funciones(métodos)
		 *  Parámetros (parameters): Entrada de las funciones
		 * 
		 */
		
		/*
		 *  https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		 *  Tipos de datos en Java
		 *  - Objetos
		 *  - Datos primitivos
		 *  	8 datos primitivos
		 *   > byte
		 *   > short
		 *   > int
		 *   > long
		 *   > float
		 *   > double
		 *   > boolean
		 *   > char
		 *      
		 */	
		
		// El tipo byte es de 8 bits, almacena datos numéricos enteros
		byte myVarByte; // declarando la variable
		myVarByte = 12; // asignando el valor de 12 a la variable
		/*
		 *  Cuántos valores podemos representar? 2^n, 2^8 = 256 dígitos
		 *  Rango de valores positivos: 0 al 127
		 *  Rango de valores negativos: -1 al -128
		 * 
		 */
		
		/*
		 * Para obtener los rangos del tipo byte
		 * Podemos usar su clase Wrapper(clase envolvente): Byte		 * 
		 */
		// Usamos el atributo estático(static field) MAX_VALUE
		System.out.println("Max value byte: " + Byte.MAX_VALUE  ); // 127
		System.out.println("Min value byte: " + Byte.MIN_VALUE  ); // -128
		
		/*
		 * Tipo de dato short
		 * Dato de 16 bits, almacena enteros.
		 * Valor máximo y mínimo que puede representar:  
		 */
		System.out.println("Max value short: " + Short.MAX_VALUE); // 32767 
		System.out.println("Mix value short: " + Short.MIN_VALUE); // -32768
		
		/*
		 * Tipo de dato int (integer)
		 * Dato de 32 bits, almacena enteros.
		 * Valor máximo y mínimo que puede representar(Wrapper Integer):
		 */
		System.out.println("Max value int: " + Integer.MAX_VALUE); // 2147483647
		System.out.println("Min value int: " + Integer.MIN_VALUE); // -2147483648
		
		/*
		 * Tipo de dato long
		 * Dato de 64 bits, almacena enteros.
		 * Valor máximo y mínimo que puede representar(Wrapper Long):
		 */
		System.out.println("Max value long: " + Long.MAX_VALUE); // 9223372036854775807
		System.out.println("Min value long: " + Long.MIN_VALUE); // -9223372036854775808

		/*
		 * Las literales numéricas enteras en java son de tipo int
		 * ej. 12, -456, 0
		 * Para idicar una literal numética de tipo long
		 * hay que indicar la literal con la letra l o L.
		 * Se recomienda usar la L para no confundir con el 1
		 * 
		 * Los valores numéricos se pueden separar por guiones bajos
		 */
		long numPersonas = 2_147_483_648L;
		// No existe el NaN, +Infinity, -Infinity, undefined
		
		// ==================================================================
		/*
		 * Dato de tipo float
		 * Dato de 32 bits, almacena valos numéricos de punto flotante.
		 * 
		 * El wrapper de float es Float.
		 * 
		 */
		System.out.println("Max value float: " + Float.MAX_VALUE); // 3.4028235E38
		System.out.println("Min value float: " + Float.MIN_VALUE); // 1.4E-45
		
		/*
		 * Dato de tipo double
		 * Dato de 64 bits, almacena valos numéricos de punto flotante.
		 * 
		 * El wrapper de double es Double.
		 * 
		 */
		System.out.println("Max value doble: " + Double.MAX_VALUE); // 1.7976931348623157E308
		System.out.println("Min value doble: " + Double.MIN_VALUE); // 4.9E-324
		

		/*
		 *  Las literales de punto flotante son por default double
		 *  ej. 123.567, 0.012, -0.989, 0.0
		 */
		float myVarFloat = 1.0F;
		
		/*
		 * Dato char
		 * Almacena un solo caracter.
		 * Se debe definir la literal con apóstrofe ej. 'a', 'C', ' '
		 * Solo almacena caracteres de la tabla unicode(16 bits).
		 * puede almacenar del 0 al 65535
		 */
		char primeraLetradeAlejandra = 'A';
		// Se puede asignar con el valor unicode '\u0041'
		char letraA = '\u0041';
		// Se puede asignar con el valor numérico
		char letraAMayuscula = 65;
		System.out.println(primeraLetradeAlejandra);
		System.out.println(letraA);
		System.out.println(letraAMayuscula);
		
		/*
		 * Dato Boolean
		 * Almacena valores true o false
		 */
		boolean myVarBoolean = true;
		
		// ********** Conversiones implícitas *******
		byte coquita350ml = 60;
		short cocaJumbo2l = coquita350ml;
		
		// ********** Conversiones explícitas *******
		short pozoleGrande1l = 258;
		byte pozoleBurbuja = (byte)pozoleGrande1l;
		System.out.println("Valor de pozole Burbuja: " + pozoleBurbuja);
		
		// ********** overflow **********************
		/*
		 * Situación donde un valor calculados durante
		 * una operación aritmética excede el rango
		 * máximo que puede ser representado por el 
		 * el tipo de dato utilizado.
		 * 
		 */
		byte i = 0;
		for(     ; i < 10; i-- ) {
			System.out.println( i );
		}
		System.out.println("final de i: " + i);
		
		
		//====================================================
		// String es un tipo non-primitive
		/*
		 * Tipo de dato String
		 * Es un objeto que se define con comillas dobles.
		 * 
		 * Si deseas imprimir comillas dobles,se usa el 
		 * caracter de escape \
		 *   \b backspace
		 *   \t tab
		 *   \n line feed
		 *   \r carriage return
		 *   \" double quote
		 *   \' single quote
		 *   \\ backslash
		 */
		String name = "\n D \n\t u \n\t l \n\t c \n\t e";
		System.out.println("Hola" + name); // Hola Dulce
		
		// Imprimir en consola:     En 15 minutos comeremos "Albóndigas"
		System.out.println("En 15 minutos comeremos \"Albóndigas\"");
		
		// Conversión de String a números
		// ¿Cuántas albóndigas?
		String numAlbondigasAComer = "3";
		
		// Conversión explícita
		int numAlbondigas =Integer.parseInt(numAlbondigasAComer);  
		int albondigasRestantes = numAlbondigas - 2; // 1
		
		// Conversión de números a String
		int numSuerte = 1258;
		
		// Obtener el dígito (8)
		String numSuerteStr = String.valueOf( numSuerte ); // "1258"
		int posicionUltimoDigito =  numSuerteStr.length() - 1;
		char ultimoDigito = numSuerteStr.charAt( posicionUltimoDigito );
		System.out.println("Mi último dígito es: " +  ultimoDigito );
		
		System.out.println("Mi último dígito usando residuo: " + (numSuerte % 10) );
		
		
	}

}
