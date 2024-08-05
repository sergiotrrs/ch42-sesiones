package com.pakasio.app.util;

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
		int number = RandomGenerator.randomNumber(1000);
		int photoNumber = RandomGenerator.randomNumber(50);
		User randomUser = new User();
		randomUser.setActive(true);
		randomUser.setFirstName("Arenita" + number );
		randomUser.setLastName("Mejillas" + number );
		randomUser.setEmail("arenita"+number+photoNumber+"@nickelodeon.com");
		randomUser.setPassword("texas"+ number);
		randomUser.setAvatar("https://randomuser.me/api/portraits/women/"+photoNumber+".jpg");
		randomUser.setBirthdate( RandomGenerator.randomBirthdate());
		randomUser.setRoles( List.of( Role.setUserRole(1) ) );
				
		return randomUser;
	}
	


	

}
