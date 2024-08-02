package com.pakasio.app.dto;

import java.time.LocalDate;

public class UserDto {
	
	private Long serialNumber;
	// TODO agregar la dependencia 	implementation 'org.springframework.boot:spring-boot-starter-validation'
	//@NotEmpty(message = "Firstname should not be null or empty")
	//@Size(min= FIRSTNAME_MIN_LENGTH, max= FIRSTNAME_MAX_LENGTH, 
	//		message = "First name must be between " + FIRSTNAME_MIN_LENGTH + " and "+ FIRSTNAME_MAX_LENGTH + " characters")
	private String firstName;
	private String lastName;
	private String email;
	private String avatar;
	private LocalDate birthdate;
	
	public UserDto() {}
	
	public Long getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(Long serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}


}
