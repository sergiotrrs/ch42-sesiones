package com.pakasio.app.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pakasio.app.model.User;
import com.pakasio.app.repository.UserRepository;
import com.pakasio.app.service.LoginUserService;
import com.pakasio.app.util.PasswordUtils;

@Service
public class LoginUserServiceImpl implements LoginUserService{
	
	UserRepository userRepository;
	
	public LoginUserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User loginUser(User user) {		
		Optional<User> optionalUser = userRepository.findByEmail(user.getEmail());		
		if( optionalUser.isEmpty() || incorrectPassword( user, optionalUser.get() ) ) {
			throw new IllegalStateException("Incorrect e-mail or password");
		}
		return optionalUser.get();
	}
	
	private boolean incorrectPassword(User user, User existingUser) {
		String plainPassword = user.getPassword();
		String hashedPassword= existingUser.getPassword();
				
		return !PasswordUtils.verifyPassword(plainPassword, hashedPassword);
	}

}
