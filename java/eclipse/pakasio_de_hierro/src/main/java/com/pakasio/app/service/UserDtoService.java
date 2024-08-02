package com.pakasio.app.service;

import com.pakasio.app.dto.UserDto;
import com.pakasio.app.model.User;

public interface UserDtoService {
	
	UserDto createUser(User user);
	UserDto getUserById(Long id);
	UserDto getUserByEmail(String email);
	Iterable<UserDto> getAllUser(boolean isActive);
	UserDto updateUser(User user, Long id);
	void deleteUser(Long id);
}
