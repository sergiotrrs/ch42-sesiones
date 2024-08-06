package com.pakasio.app.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.pakasio.app.model.User;
import com.pakasio.app.service.UserService;


/** STEP 4 Leer el usuario de la DB */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	private UserService userService;
	
	public UserDetailsServiceImpl( UserService userService ) {
		this.userService = userService;
	}
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		User existingUser = userService.getUserByEmail(email);
				
		return new UserDetailsImpl( existingUser );
	}

}
