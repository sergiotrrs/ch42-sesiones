package com.pakasio.app.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.RegexRequestMatcher;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.pakasio.app.security.jwt.JWTAuthenticationFilter;
import com.pakasio.app.security.jwt.JWTAuthorizationFilter;

import static org.springframework.security.config.Customizer.withDefaults;

import java.util.List;

/**
* @EnableWebSecurity: habilita la configuración de seguridad web 
*   en una aplicación Spring Boot.
* @Configuration: contiene configuraciones para la aplicación, 
*  como definiciones de beans y configuración de componentes, 
*  y que debe ser considerada durante la inicialización del 
*  contexto de la aplicación.
*
*/
@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

	
	/** STEP 1 Autenticación basada en usuarios en memoria **/
/*	@Bean
	UserDetailsService userDetailsService( PasswordEncoder passwordEncoder ) {
		UserDetails sergio = User.builder()
								.username("sergio")
								.password("$2a$10$Su5Y7B0V9ab24ZBUG6OsBOWyzXchSLp6AshwOq6mlDu8rA6zmt2oW") // 123
								.roles("ADMIN") // ROLE_ADMIN
								.build();
		UserDetails tania = User.builder()
								.username("tania")
								.password(passwordEncoder.encode("456"))
								.roles("CUSTOMER") // ROLE_CUSTOMER
								.build();
		UserDetails kristian = User.builder()
								.username("kristian")
								.password(passwordEncoder.encode("789"))// .password("{noop}789")
								.roles("WAREHOUSE") // ROLE_WAREHOUSE
								.build();
		
		return new InMemoryUserDetailsManager(sergio, tania, kristian);
	} */
	
	// STEP 1.1 Crear un bean de PassworsEncoder
	/**
	 *  Crear un bean de BCryptPasswordEncoder.
	 *  BCrypPasswordEncoder es una implementación de PasswordEncoder proporcionada
	 *  por Spring Security. Se utiliza para codificar y verificar contraseñas utilizando
	 *  el algoritmo de hashing bcrypt.
	 *  El algoritmo incorpora un sal aleatoria por cada contraseña, lo que agrega un capa
	 *  adicional de seguridad.
	 */	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	/**Ejecutar para tener una muestra de una contraseña encriptada */
	public static void main(String[] args) {
		System.out.println( new BCryptPasswordEncoder().encode("123")  );
	}
	
	
	/** STEP 2 Realizar configuraciones personalizadas del filter chain **/
	@Bean
	SecurityFilterChain filterChain( 
			HttpSecurity http,
			AuthenticationManager authManager,
			JWTAuthorizationFilter jwtAuthorizationFilter
			) throws Exception {
		
		// STEP 7.3 Crear el objeto y la configuración para jwtAuthenticationFilter
		JWTAuthenticationFilter jwtAuthenticationFilter = new JWTAuthenticationFilter();
		jwtAuthenticationFilter.setAuthenticationManager(  authManager );
		jwtAuthenticationFilter.setFilterProcessesUrl("/login");
		
		
		// STEP 2.1 Deshabilitar la seguridad
		/*return http
				.authorizeHttpRequests( authorize -> authorize.anyRequest().permitAll() )
				.csrf( csrf-> csrf.disable() )
				.httpBasic( withDefaults() ) 
				.build(); */
		
		// STEP 2.2 Personalizar la seguridad en los endpoints
		// TODO cambiar el nombre de los endposint y roles utilizados
		return http
				.authorizeHttpRequests( authorize -> authorize
						.requestMatchers("/", "index.html", "/assets/**","/img/**", "/src/**").permitAll()
						.requestMatchers(HttpMethod.POST, "/api/v1/users").permitAll()
						.requestMatchers(HttpMethod.GET, "/api/v3/products/**").permitAll()
						.requestMatchers(HttpMethod.PUT, "/api/v3/products","/api/v3/products/**","/api/v3/categories/**").hasRole("WAREHOUSE_MANAGER")
						.requestMatchers(HttpMethod.GET, "/api/v1/users").hasAnyRole("ADMIN")						
						.requestMatchers(HttpMethod.GET, "/api/v1/users/{id}").hasAnyRole("ADMIN","CUSTOMER")						
						.requestMatchers(HttpMethod.POST, "/api/v1/users/{id}").hasAnyRole("ADMIN","CUSTOMER")						
						.requestMatchers(HttpMethod.DELETE, "/api/v1/users/{id}").hasAnyRole("ADMIN","CUSTOMER")						
						.requestMatchers("/api/v3/roles/**", "/api/v3/products/**", "/api/v3/purchases/**", "/api/v1/order-has-products/**").hasRole("ADMIN")
						.anyRequest().denyAll()						
						)
				// STEP 7: Agregamos el filtro de autenticación del login
				// interceptar las solicitudes de autenticación 
				// y generamos el token en la respuesta
				.addFilter(jwtAuthenticationFilter)
				// STEP 8: Agregamos el filtro para las demas solicitudes verificando el token JWT
				// Interceptamos las solicitudes , extraemos y validamos el token
				// y autenticamos al usuario
				.addFilterBefore( jwtAuthorizationFilter  ,  UsernamePasswordAuthenticationFilter.class)				
			    // no es necesario almacenar información de sesión en el servidor, 
				// ya que toda la información necesaria para la autenticación 
				// se encuentra en el token, y cada solicitud es autónoma.				 
				.sessionManagement(managment -> managment.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.csrf( csrf-> csrf.disable() )
				.httpBasic( withDefaults() ) 
				.build();		
	}
	
	

	/** 
	 *  STEP 3 Autenticación basada en usuarios de la DB
	 *  AuthenticationManager: Gestiona las operaciones de autenticación.
	 *  getSharedObject: Obtiene una instancia compartida de AuthenticationManagerBuilder 
	 *  .userDetailsService: Configura el AuthenticationManagerBuilder 
	 *  	para utilizar un servicio de detalles de usuario personalizado.
	 *  userDetailsService: responsable de cargar detalles específicos 
	 *  	del usuario durante el proceso de autenticación.
	 */	
	@Bean
	AuthenticationManager authManager(
				HttpSecurity httpSecurity,
				PasswordEncoder passwordEncoder,
				UserDetailsService userDetailsService
			
			) throws Exception {
		
		AuthenticationManagerBuilder authManagerBuilder = httpSecurity
				.getSharedObject( AuthenticationManagerBuilder.class  );
		
		authManagerBuilder
		 .userDetailsService( userDetailsService ) 
		 .passwordEncoder( passwordEncoder );
		
		return authManagerBuilder.build();
	}
	
	/** STEP 6: opcional, configurar los CORS en caso de que no funcione 
	    Se evita tener que escribir @CrossOrigin(origins = "*") en los controladores **/
		// @Bean // Quitar comentario para habilitar
		CorsConfigurationSource corsConfigurationSource() {
			CorsConfiguration configuration = new CorsConfiguration();
			configuration.setAllowedOrigins( List.of("http://127.0.0.1:5500", "https://ecommer-generica.netlify.app") );
			configuration.setAllowedMethods( List.of("GET", "POST", "PUT", "DELETE") );
			configuration.setAllowedHeaders( List.of("Authorization","Content-Type") );
			
			// Para todas las rutas en la aplicación ("/**"), 
			// aplique la configuración CORS definida en el objeto configuration.
			UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
			source.registerCorsConfiguration("/**", configuration);
			return source;			
		}
	
	
}
