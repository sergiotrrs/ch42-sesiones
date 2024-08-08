package com.pakasio.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pakasio.app.model.User;
import com.pakasio.app.service.LoginUserService;

@RestController
@RequestMapping("api/v1/login")
@CrossOrigin(origins = "*")
public class LoginUserController {

	LoginUserService loginUserService;

	public LoginUserController(LoginUserService loginUserService) {
		this.loginUserService = loginUserService;
	}
	
	@PostMapping
	ResponseEntity<User> loginUser(@RequestBody User user) {
		User existingUser = loginUserService.loginUser(user);
		return ResponseEntity.ok(existingUser);		
	}
	
}
