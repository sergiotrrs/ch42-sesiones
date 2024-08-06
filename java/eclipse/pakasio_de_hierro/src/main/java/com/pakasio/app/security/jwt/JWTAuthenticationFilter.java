package com.pakasio.app.security.jwt;

import org.json.JSONObject;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pakasio.app.security.UserDetailsImpl;

import io.jsonwebtoken.io.IOException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
	
	/** STEP 7.1 recuperar el email y password del body de la solicitud 
	   que vendría en localhost:8080/login */
	@Override
	public Authentication attemptAuthentication(
			HttpServletRequest request, 
			HttpServletResponse response
			)
			throws AuthenticationException {
		
		AuthCredentials authCredentials = new AuthCredentials();
		
		// asumimos que en el body de la petición viene en el formato JSON como { email, password}
		try {
			authCredentials = new ObjectMapper().readValue(  request.getReader(), AuthCredentials.class  );
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (StreamReadException e) {
			e.printStackTrace();
		} catch (DatabindException e) {
			e.printStackTrace();
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	
		UsernamePasswordAuthenticationToken usernamePAT = new UsernamePasswordAuthenticationToken(
				authCredentials.getEmail(),
				authCredentials.getPassword()
				);
		
		// Autenticar el usuario con authManager
		return getAuthenticationManager().authenticate(usernamePAT);
		
	}
	
	/** STEP 7.2 Si la autenticación fue correcta agregamos el token a la respuesta */
		@Override
		protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
				Authentication authResult) throws IOException, ServletException, java.io.IOException {
		
			UserDetailsImpl userDetails = (UserDetailsImpl) authResult.getPrincipal();
			
			String token = TokenUtils.createToken(userDetails.getUsername(), userDetails.getUsername(), userDetails.getAuthorities() );
			
			
			// Configuración de la respuesta http en el Header.
			// Existen complicaciones de la lectura en el cliente cuando están
			// en diferentes servidores el cliente y servidor.
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			response.addHeader("Authorization", "Bearer " + token);
			
			// Opcional: crear un objeto JSON para la respuesta
			JSONObject jsonResponse = new JSONObject();
			jsonResponse.put("token", token);
			// Establecer el objeto JSON en el body de la respuesta
			response.getWriter().write( jsonResponse.toString() );
			response.getWriter().close();
			
			super.successfulAuthentication(request, response, chain, authResult);
			
			
		}
	
	
	
}

