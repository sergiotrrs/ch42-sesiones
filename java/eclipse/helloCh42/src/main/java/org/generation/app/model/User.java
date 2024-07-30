package org.generation.app.model;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private long id;
	private String email;
	private String firstName;
	private String lastName;
	private String avatar;
	
	public User(long id, String email, String firstName, String lastName, String avatar) {		
		this.id = id;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.avatar = avatar;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", avatar=" + avatar + "]";
	}
	
	
	public static List<User> usersMock() {
		List<User> users = new ArrayList<>();
		
		users.add(new User(1, "jaqui@gmail.com", "Jaqui", "Meatballs", "https://randomuser.me/api/portraits/women/26.jpg" )  );
		users.add(new User(2, "rubi@gmail.com", "Rubi", "Meatballs", "https://randomuser.me/api/portraits/women/27.jpg" )  );
		users.add(new User(3, "diana@gmail.com", "Diana", "Meatballs", "https://randomuser.me/api/portraits/women/28.jpg" )  );
		users.add(new User(4, "marbe@gmail.com", "Marbe", "Meatballs", "https://randomuser.me/api/portraits/women/29.jpg" )  );
		users.add(new User(5, "mariana@gmail.com", "Mariana", "Meatballs", "https://randomuser.me/api/portraits/women/30.jpg" )  );
		
		return users;
	}
	
	
	
}
