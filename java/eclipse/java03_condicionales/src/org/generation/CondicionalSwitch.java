package org.generation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {
		/*
		 * Sintaxis:
		 * 
		 * switch( expresión ){ case valor1 : expresión; break; case valor2 : expresión;
		 * break; case valor3, valor4 : expresión break; default: expresión; break; }
		 * 
		 * La expresión a evaluar debe ser un tipo entero, string o enum. La condicional
		 * Switch usa el método equals para comparar los Strings.
		 */

		int number = 1;
		String message;

		switch (number) {
		case 1:
			message = "Número uno";
			break;
		case 2:
			message = "Número dos";
			break;
		case 3, 4, 5, 6:
			message = "Número 3, 4 5 o 6";
			break;
		default:
			message = "Número diferente de 1 al 6";

		}
		System.out.println(message);

		/*
		 * Leer usando la clase Scanner un mes (1 - 12) e indicar el mes en texto. ej:
		 * entrada-> "Escribe tu mes de nacimiento: " 12 salida-> Naciste en diciembre.
		 * 
		 */
		File archivo = new File("src/org/generation/misDatos.txt");

		Scanner sc;
		try {
			sc = new Scanner(archivo);

			System.out.print("Escribe tu mes de nacimiento: ");
			if (sc.hasNextInt()) {

				int month = sc.nextInt();
				sc.nextLine();

				String monthName;
				switch (month) {
				case 1:
					monthName = "enero";
					break;
				case 2:
					monthName = "febrero";
					break;
				case 3:
					monthName = "marzo";
					break;
				case 4:
					monthName = "abril";
					break;
				case 5:
					monthName = "mayo";
					break;
				case 6:
					monthName = "junio";
					break;
				case 7:
					monthName = "julio";
					break;
				case 8:
					monthName = "agosto";
					break;
				case 9:
					monthName = "septiembre";
					break;
				case 10:
					monthName = "octubre";
					break;
				case 11:
					monthName = "noviembre";
					break;
				case 12:
					monthName = "diciembre";
					break;
				default:
					monthName = "**mes inválido**";
					break;
				} // case

				System.out.println("Naciste en " + monthName);
			} else {
				sc.nextLine();
				System.out.println("No introdujiste un número, vuelve a intentarlo");
			}

			sc.close();
		} // try
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
