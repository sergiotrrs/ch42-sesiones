package com.pakasio.app.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pakasio.app.dto.UserDto;
import com.pakasio.app.model.User;
import com.pakasio.app.service.UserDtoService;

@RestController
@RequestMapping("api/v2/users")
@CrossOrigin(origins = "*")
public class UserDtoController {

	UserDtoService userDtoService;

	public UserDtoController(UserDtoService userDtoService) {
		this.userDtoService = userDtoService;
	}

	@PostMapping
	ResponseEntity<UserDto> createUser(@RequestBody User user) {
		UserDto newUser = userDtoService.createUser(user);
		return ResponseEntity.status(201).body(newUser);
	}

	@GetMapping("{id}")
	ResponseEntity<UserDto> getUserById(@PathVariable("id") Long id) {
		UserDto existingUser = userDtoService.getUserById(id);
		return ResponseEntity.ok(existingUser);
	}

	@GetMapping
	ResponseEntity<Iterable<UserDto>> getAllUsers(
			@RequestParam(name = "active", required = false, defaultValue = "true") 
			boolean active
			) {
		Iterable<UserDto> existingUsers = userDtoService.getAllUser(active);
		return ResponseEntity.ok(existingUsers);
	}

	@PutMapping("{id}")
	ResponseEntity<UserDto> updateUser(@RequestBody User newUserData, @PathVariable("id") Long id) {
		UserDto updatedUser = userDtoService.updateUser(newUserData, id);
		return ResponseEntity.ok(updatedUser);
	}
	
	@DeleteMapping("{id}")
	ResponseEntity<String> deleteUser(@PathVariable("id") Long id) {
		userDtoService.deleteUser(id);
		return ResponseEntity.status(204).body("User id " + id + " successfully deleted");
	}

}
