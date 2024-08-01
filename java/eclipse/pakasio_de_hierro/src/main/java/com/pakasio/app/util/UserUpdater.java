package com.pakasio.app.util;

import com.pakasio.app.model.User;

public final class UserUpdater {
	
	private UserUpdater() {}

	public static User updateUser(User existingUser, User newUserData) {
		if (existingUser == null || newUserData == null) {
			throw new IllegalArgumentException("User data cannot be null");
		}
		
		existingUser.setFirstName(newUserData.getFirstName());
		existingUser.setLastName(newUserData.getLastName());
		existingUser.setEmail(newUserData.getEmail());
		existingUser.setPassword(newUserData.getPassword());
		existingUser.setBirthdate(newUserData.getBirthdate());
		existingUser.setAvatar(newUserData.getAvatar());

		return existingUser;
	}
}
