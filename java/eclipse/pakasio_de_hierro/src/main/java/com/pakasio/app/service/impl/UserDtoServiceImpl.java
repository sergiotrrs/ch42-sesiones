package com.pakasio.app.service.impl;

import org.springframework.stereotype.Service;

import com.pakasio.app.dto.UserDto;
import com.pakasio.app.model.User;
import com.pakasio.app.service.UserDtoService;
import com.pakasio.app.service.UserService;

@Service
public class UserDtoServiceImpl implements UserDtoService {

	UserService userService;
	
	public UserDtoServiceImpl(UserService userService) {
		this.userService = userService;
	}

	@Override
	public UserDto createUser(User user) {
		User newUser = userService.createUser(user);
		UserDto newUserDto = new UserDto();
		newUserDto.setSerialNumber( newUser.getId() );
		newUserDto.setFirstName( newUser.getFirstName() );
		newUserDto.setLastName( newUser.getLastName() );
		newUserDto.setEmail( newUser.getEmail() );
		return newUserDto;
	}

	@Override
	public UserDto getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<UserDto> getAllActiveUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<UserDto> getAllInactiveUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<UserDto> getAllUser(boolean isActive) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto updateUser(User user, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		
	}

}
