package com.pakasio.app.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pakasio.app.model.User;
import com.pakasio.app.service.UserService;

@RestController
@RequestMapping("api/v1/users")
@CrossOrigin(origins = "*")
public class UserController {

	UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping
	ResponseEntity<User> createUser(@RequestBody User user) {
		User newUser = userService.createUser(user);
		return ResponseEntity.status(201).body(newUser);
		// return new ResponseEntity<User>(newUser, HttpStatus.CREATED);
	}

	@GetMapping("{id}")
	ResponseEntity<User> getUserById(@PathVariable Long id) {
		User existingUser = userService.getUserById(id);
		return ResponseEntity.ok(existingUser);
	}

	@GetMapping
	ResponseEntity<Iterable<User>> getAllUsers(
			@RequestParam(name = "active", required = false, defaultValue = "true") 
			boolean active
			) {
		Iterable<User> existingUsers = userService.getAllUser(active);
		return ResponseEntity.ok(existingUsers);
	}

	@PutMapping("{id}")
	ResponseEntity<User> updateUser(@RequestBody User newUserData, @PathVariable Long id) {
		User updatedUser = userService.updateUser(newUserData, id);
		return ResponseEntity.ok(updatedUser);
	}
	
	@DeleteMapping("{id}")
	ResponseEntity<String> deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
		return ResponseEntity.status(204).body("User id " + id + " successfully deleted");
	}

}
