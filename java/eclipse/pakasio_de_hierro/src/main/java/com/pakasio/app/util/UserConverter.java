package com.pakasio.app.util;

import java.util.ArrayList;
import java.util.List;

import com.pakasio.app.dto.UserDto;
import com.pakasio.app.model.User;

public final class UserConverter {
	
	private UserConverter() { }
	
	public static UserDto userToUserDto( User user ) {
		UserDto userDto = new UserDto();
		
		userDto.setSerialNumber( user.getId());
		userDto.setFirstName( user.getFirstName());
		userDto.setLastName( user.getLastName());
		userDto.setEmail( user.getEmail());
		userDto.setBirthdate( user.getBirthdate());
		userDto.setAvatar( user.getAvatar());		
		
		return userDto;
	}
	
	public static Iterable<UserDto> userToUserDto( Iterable<User> users ) {
		List<UserDto> usersDto = new ArrayList<>();
		
		for (User user : users) {
			usersDto.add( userToUserDto(user) );
		}
		
		return usersDto;
	}

	

}
