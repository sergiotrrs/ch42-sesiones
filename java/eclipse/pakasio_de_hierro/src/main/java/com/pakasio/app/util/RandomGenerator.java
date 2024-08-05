package com.pakasio.app.util;

import java.time.LocalDate;

public final class RandomGenerator {
	
	private RandomGenerator() {}
	
	/** Genera un número aleatorio entre 1 y MaxValue */
	public static int randomNumber(int maxValue) {
		return (int)Math.floor(Math.random() * (maxValue+1) + 1);
	}

	/** Genera una fecha aleatoria entre 1970 y 2000 */
	public static LocalDate randomBirthdate() {
		int year = (int)Math.floor(Math.random()* 30 + 1970);
		int month = (int)Math.floor(Math.random()* 12 + 1);
		int day = (int)Math.floor(Math.random() * 25 + 1 );
		
		return LocalDate.of(year, month, day);
	}
	
}
