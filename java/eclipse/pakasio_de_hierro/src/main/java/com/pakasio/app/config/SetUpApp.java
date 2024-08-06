package com.pakasio.app.config;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.pakasio.app.model.Category;
import com.pakasio.app.model.Product;
import com.pakasio.app.model.Purchase;
import com.pakasio.app.model.PurchaseHasProducts;
import com.pakasio.app.model.Role;
import com.pakasio.app.model.User;
import com.pakasio.app.model.composite_key.PurchaseProductKey;
import com.pakasio.app.repository.CategoryRepository;
import com.pakasio.app.repository.ProductRepository;
import com.pakasio.app.repository.PurchaseHasProductsRepository;
import com.pakasio.app.repository.PurchaseRepository;
import com.pakasio.app.repository.RoleRepository;
import com.pakasio.app.service.UserService;
import com.pakasio.app.util.ProductGenerator;
import com.pakasio.app.util.UserGenerator;

/**
 * CommandLineRunner es una interfaz en Spring Boot que se 
 * usa para ejecutar código específico una vez que la 
 * aplicación ha iniciado completamente. Es particularmente 
 * útil para ejecutar tareas de inicialización o configuración 
 * cuando se arranca la aplicación.
 */
// @Profile("devH2") // Para que se active cuando se use el perfil indicado
@Configuration
public class SetUpApp implements CommandLineRunner {

	CategoryRepository categoryRepository;
	ProductRepository productRepository;
	PurchaseRepository purchaseRepository;
	PurchaseHasProductsRepository puHasprRepository;
	RoleRepository roleRepository;
	UserService userService;
	
	public SetUpApp(CategoryRepository categoryRepository, ProductRepository productRepository,
			PurchaseRepository purchaseRepository, PurchaseHasProductsRepository puHasprRepository,
			RoleRepository roleRepository, UserService userService) {
		this.categoryRepository = categoryRepository;
		this.productRepository = productRepository;
		this.purchaseRepository = purchaseRepository;
		this.puHasprRepository = puHasprRepository;
		this.roleRepository = roleRepository;
		this.userService = userService;
	}

	@Override
	public void run(String... args) throws Exception {
	
		// Roles para los usuarios ************************************
		// Si se tiene la capa service, se deben agregar los clientes con esa capa
		Role customer = roleRepository.save( new Role(1L, "CUSTOMER", "Cliente"));
		Role admin = roleRepository.save( new Role(2L, "ADMIN", "Administrador"));
		Role warehouseManager = roleRepository.save( new Role(3L, "WAREHOUSE_MANAGER", "Almacenista"));
		
		// Categorías para los productos ******************************
		Category juguete = categoryRepository.save( new Category("Juguetes", "Juguetes para infantes"));
		Category deportes = categoryRepository.save( new Category("Deportes", "Deportes extremos"));
		categoryRepository.save( new Category("Hogar", "Productos para el hogar"));
		categoryRepository.save( new Category("Línea Blanca", "Lavadoras, Refrigeradores"));
		
		// Generación de productos
		List<Product> products = ProductGenerator.generateRandomProducts(30, juguete.getId());
		for (Product product : products) {
			productRepository.save(product);
		}
		
		Product legoChef = productRepository.save( new Product(
				"Lego Chef", 
				"https://randomuser.me/api/portraits/lego/8.jpg", 
				new BigDecimal("100.23") , // Precio BigDecimal( ver clase Product)
				juguete // Categoría
				));
		
		Product legoCharro = productRepository.save( new Product(
				"Lego Charro", 
				"https://randomuser.me/api/portraits/lego/6.jpg", 
				new BigDecimal("150.04") , 
				juguete 
				));
		
		Product sombrero = productRepository.save( new Product(
				"Sombrero para lluvia", 
				"https://randomuser.me/api/portraits/lego/4.jpg", 
				new BigDecimal("100.23") ,
				deportes 
				));
						
		// Generación de usuarios **************************************
		List<User> users = UserGenerator.generateRandomUsers(50);
		for (User user : users) {
			userService.createUser(user);
		}
		
		User serch = userService.createUser( new User(
				"Serch", 
				"Torres", 
				"serch@gmail.com",
				"888", 
				"https://randomuser.me/api/portraits/men/55.jpg", 
				LocalDate.of(1983, 12, 8), 
				true,
				// Se agregan objetos de tipo Customer
				List.of( customer ) 
				) );
	
		User mariana = userService.createUser(new User("Mariana",
				"Alexa",
				"duendemalito@gmail.com",
				"999",
				"https://randomuser.me/api/portraits/women/70.jpg", 
				LocalDate.of(2004, 1, 1), 
				true,
				// Un usuario puede tener varios roles
				// Se asigna el role 1(CUSTOMER) y 2(ADMIN) 
				List.of( Role.setUserRole(1), Role.setUserRole(2) )
				));
		
		User marbe = userService.createUser( new User(
				"Marbe", 
				"Cabrera", 
				"marbe@gmail.com",
				"123", 
				"https://randomuser.me/api/portraits/women/71.jpg", 
				LocalDate.of(2004, 1, 1), 
				true ,
				// Se puede indicar usando los objetos creados anteriormente
				List.of( customer , admin )
				) );
		
		User diana = userService.createUser( new User(
				"Diana", 
				"Gallegos", 
				"dianagp@gmail.com",
				"222", 
				"https://randomuser.me/api/portraits/women/72.jpg", 
				LocalDate.of(2004, 1, 1),  
				true ,
				List.of( customer, warehouseManager )
				) );
	
		// Generación de compras **************************************
		Purchase compra01 = purchaseRepository.save( new Purchase( serch, LocalDateTime.of(2024, 3, 4, 8, 12, 30) ) );
		Purchase compra02 = purchaseRepository.save( new Purchase( marbe, LocalDateTime.of(2024, 4, 10, 15, 10, 55) ) );
		Purchase compra03 = purchaseRepository.save( new Purchase( marbe, LocalDateTime.of(2024, 5, 9, 10, 5, 22) ) );

		
		// Asignación de los productos en compras **************************************

		// Se debe crear la llave compuesta
		PurchaseProductKey ppkey01Sombrero = new PurchaseProductKey(compra01.getId(), sombrero.getId());
		puHasprRepository.save( new PurchaseHasProducts(
				ppkey01Sombrero,
				compra01, 
				sombrero, 
				2,
				sombrero.getPrice().multiply( BigDecimal.TWO ) // precio * 2
				) );
		
		PurchaseProductKey ppkey01Chef = new PurchaseProductKey(compra01.getId(), legoChef.getId());
		puHasprRepository.save( new PurchaseHasProducts(
				ppkey01Chef,
				compra01, 
				legoChef, 
				2,
				legoChef.getPrice().multiply( BigDecimal.TWO ) // precio * 2
				) );
		
		PurchaseProductKey ppkey01Charro = new PurchaseProductKey(compra01.getId(), legoCharro.getId());
		puHasprRepository.save( new PurchaseHasProducts(
				ppkey01Charro,
				compra01, 
				legoCharro, 
				1,
				legoCharro.getPrice()
				) );
		
		PurchaseProductKey ppkey02Sombrero = new PurchaseProductKey(compra02.getId(), sombrero.getId());		
		puHasprRepository.save( new PurchaseHasProducts(
				ppkey02Sombrero,
				compra02, 
				sombrero, 
				2,
				sombrero.getPrice().multiply( BigDecimal.TWO ) 
				) );
		
		PurchaseProductKey ppkey02Charro = new PurchaseProductKey(compra02.getId(), legoCharro.getId());
		puHasprRepository.save( new PurchaseHasProducts(
				ppkey02Charro,
				compra02, 
				legoCharro, 
				5,
				legoCharro.getPrice().multiply( BigDecimal.valueOf(5) ) 
				) );

		
	}



}
