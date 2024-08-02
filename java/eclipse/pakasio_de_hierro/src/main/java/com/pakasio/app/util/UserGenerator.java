package com.pakasio.app.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.pakasio.app.model.Role;
import com.pakasio.app.model.User;

public final class UserGenerator {
	
	private UserGenerator() {}
	
	
	public static List<User> generateRandomUsers(int quantity) {
		List<User> users = new ArrayList<>();

		for (int i = 0; i < quantity; i++) {
			users.add(generateRandomUser());
		}

		return users;
	}
	
	public static User generateRandomUser() {
		int number = randomNumber(1000);
		int photoNumber = randomNumber(50);
		User randomUser = new User();
		randomUser.setActive(true);
		randomUser.setFirstName("Arenita" + number );
		randomUser.setLastName("Mejillas" + number );
		randomUser.setEmail("arenita"+number+photoNumber+"@nickelodeon.com");
		randomUser.setPassword("texas"+ number);
		randomUser.setAvatar("https://randomuser.me/api/portraits/women/"+photoNumber+".jpg");
		randomUser.setBirthdate( randomBirthdate());
		randomUser.setRoles( List.of( Role.setUserRole(1) ) );
				
		return randomUser;
	}
	
	/** Genera un número aleatorio entre 1 y MaxValue */
	private static int randomNumber(int maxValue) {
		return (int)Math.floor(Math.random() * (maxValue+1) + 1);
	}
	
	/** Genera una fecha aleatoria entre 1970 y 2000 */
	private static LocalDate randomBirthdate() {
		int year = (int)Math.floor(Math.random()* 30 + 1970);
		int month = (int)Math.floor(Math.random()* 12 + 1);
		int day = (int)Math.floor(Math.random() * 25 + 1 );
		
		return LocalDate.of(year, month, day);
	}
	

}
