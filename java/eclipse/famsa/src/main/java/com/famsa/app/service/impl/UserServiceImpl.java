package com.famsa.app.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.famsa.app.model.User;
import com.famsa.app.repository.UserRepository;
import com.famsa.app.service.UserService;
// Las interfaces se implementan
// Es posible tener una herencia(extends) y varias implementaciones
@Service
public class UserServiceImpl implements UserService {
	
	// @Autowired
	UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public User createUser(User user) {
		User newUser = userRepository.save( user );		
		return newUser;
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<User> getAllActiveUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<User> getAllInactiveUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<User> getAllUser(boolean isActive) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		
	}

}
