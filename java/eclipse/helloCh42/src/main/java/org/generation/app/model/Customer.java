package org.generation.app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
 * La inyección de dependencias es un patrón de diseño que permite
 * la creación de objetos y la gestión de sus dependencias de manera
 * automática.
 * 
 * En lugar de crear los objetos directamente, la inyección de dependencias
 * se encarga de proporcionar las dependencias necesarias a través de un
 * contenedor de inversión de control.
 * 
 * La responsabilidad de crear y administrar los objetos se delega la contenedor
 * de Spring.
 */
@Component
@Qualifier("customer")
public class Customer extends User {
	
	public Customer(String email, String firstName, String lastName, String avatar) {
        super("", email, firstName, lastName, avatar  );
		UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();
        super.setId(uuidAsString);
	}
	
	public Customer() {
		
	}
	
	
	@Override
	public List<User> usersMock() {
		List<User> customers = new ArrayList<>();
		
		customers.add(new Customer("a@gmail.com", "Jaqui", "Meatballs", "https://randomuser.me/api/portraits/women/26.jpg" )  );
		customers.add(new Customer("b@gmail.com", "Rubi", "Meatballs", "https://randomuser.me/api/portraits/women/27.jpg" )  );
		customers.add(new Customer("c@gmail.com", "Diana", "Meatballs", "https://randomuser.me/api/portraits/women/28.jpg" )  );
		customers.add(new Customer("d@gmail.com", "Marbe", "Meatballs", "https://randomuser.me/api/portraits/women/29.jpg" )  );
		customers.add(new Customer("e@gmail.com", "Mariana", "Meatballs", "https://randomuser.me/api/portraits/women/30.jpg" )  );
		
		customers.add(new Customer("f@gmail.com", "Jaqui", "Meatballs", "https://randomuser.me/api/portraits/women/31.jpg" )  );
		customers.add(new Customer("g@gmail.com", "Rubi", "Meatballs", "https://randomuser.me/api/portraits/women/32.jpg" )  );
		customers.add(new Customer("h@gmail.com", "Diana", "Meatballs", "https://randomuser.me/api/portraits/women/33.jpg" )  );
		customers.add(new Customer("i@gmail.com", "Marbe", "Meatballs", "https://randomuser.me/api/portraits/women/34.jpg" )  );
		customers.add(new Customer("j@gmail.com", "Mariana", "Meatballs", "https://randomuser.me/api/portraits/women/35.jpg" )  );
		
		return customers;
	}
	

}
