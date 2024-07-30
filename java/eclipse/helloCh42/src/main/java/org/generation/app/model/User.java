package org.generation.app.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
*  @Component es una anotación genérica que se utiliza
*  para indicar que la clase es componente de Spring
*  y debe ser gestionada por el contenedor
*  de inversión de control (IoC).
*  
*  @Component se aplica a una clase para que Spring
*  la detecte automáticamente y la registre como un bean
*  en el contexto de la aplicación.
*  
*  @Qualifer se usa para resolver ambiguedades cuando
*  hay varios objetos(beans) del mismo tipo en
*  el contexto de la aplicación y se necesita especificar
*  el bean que se debe inyectar.
*  
*  Bean: Es un objeto administrado por el contenedor de Spring.
* 
*/
@Component
@Qualifier("user")
public class User {
	
	private String id;
	private String email;
	private String firstName;
	private String lastName;
	private String avatar;
	
	{
		System.out.println("Tengo vida");
	}
	
	public User() {
		
	}
	
	public User(String id, String email, String firstName, String lastName, String avatar) {		
		this.id = id;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.avatar = avatar;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
	
	
	
	public List<User> usersMock() {
		List<User> users = new ArrayList<>();
		
		users.add(new User("1", "jaqui@gmail.com", "Jaqui", "Meatballs", "https://randomuser.me/api/portraits/women/26.jpg" )  );
		users.add(new User("2", "rubi@gmail.com", "Rubi", "Meatballs", "https://randomuser.me/api/portraits/women/27.jpg" )  );
		users.add(new User("3", "diana@gmail.com", "Diana", "Meatballs", "https://randomuser.me/api/portraits/women/28.jpg" )  );
		users.add(new User("4", "marbe@gmail.com", "Marbe", "Meatballs", "https://randomuser.me/api/portraits/women/29.jpg" )  );
		users.add(new User("5", "mariana@gmail.com", "Mariana", "Meatballs", "https://randomuser.me/api/portraits/women/30.jpg" )  );
		
		return users;
	}
	
	
	
}
