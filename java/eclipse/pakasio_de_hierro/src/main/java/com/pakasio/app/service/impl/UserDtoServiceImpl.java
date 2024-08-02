package com.pakasio.app.service.impl;

import org.springframework.stereotype.Service;

import com.pakasio.app.dto.UserDto;
import com.pakasio.app.model.User;
import com.pakasio.app.service.UserDtoService;
import com.pakasio.app.service.UserService;
import com.pakasio.app.util.UserConverter;

@Service
public class UserDtoServiceImpl implements UserDtoService {

	UserService userService;
	
	public UserDtoServiceImpl(UserService userService) {
		this.userService = userService;
	}

	@Override
	public UserDto createUser(User user) {
		User newUser = userService.createUser(user);
		return UserConverter.userToUserDto(newUser);
	}

	@Override
	public UserDto getUserById(Long id) {		
		return UserConverter.userToUserDto( userService.getUserById(id));
	}

	@Override
	public UserDto getUserByEmail(String email) {
		return UserConverter.userToUserDto( userService.getUserByEmail(email));
	}

	@Override
	public Iterable<UserDto> getAllUser(boolean isActive) {
		return UserConverter.userToUserDto( userService.getAllUser(isActive) );
	}

	@Override
	public UserDto updateUser(User user, Long id) {
		return UserConverter.userToUserDto( userService.updateUser(user, id));
	}

	@Override
	public void deleteUser(Long id) {
		userService.deleteUser(id);		
	}

}
