package com.pakasio.app.security.jwt;

public class AuthCredentials {

	private String email;
	private String password;
	
	public AuthCredentials() {}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
