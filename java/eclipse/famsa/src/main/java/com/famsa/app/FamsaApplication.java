package com.famsa.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.famsa.app.repository.UserRepository;

@SpringBootApplication
public class FamsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FamsaApplication.class, args);
	}

	
}
