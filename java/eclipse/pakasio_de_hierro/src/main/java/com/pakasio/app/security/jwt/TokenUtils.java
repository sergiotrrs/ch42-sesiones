package com.pakasio.app.security.jwt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

public class TokenUtils {
	
	@Value("${jwt.secret}")
	private static String ACCESS_TOKEN_SECRET;
	private static long ACCESS_TOKEN_VALID_SECONDS = 900L;
	
	// STEP 7.3 Creación del token JWT
	public static String createToken(
			String name, 
			String email, 
			Collection<? extends GrantedAuthority> authorities  ) {
				
		Date expirationDate = new Date( System.currentTimeMillis() + ACCESS_TOKEN_VALID_SECONDS * 1000 );
		SecretKey secretKey = Keys.hmacShaKeyFor( Decoders.BASE64.decode(ACCESS_TOKEN_SECRET ));
		
		// Datos extras en el payload
		Map<String , Object > extra = new HashMap<>();
		extra.put("name", name  );
		extra.put("authorities", authorities);
		
		// Generación del token JWT
		return Jwts
				.builder()
				.subject(email)
				.expiration(expirationDate)
				.claims(extra)
				.signWith(secretKey)
				.compact();			
	}
	
	// STEP 8.2 Verificar el token
	public static UsernamePasswordAuthenticationToken getAuthentication(String token) {
		
		UsernamePasswordAuthenticationToken userAuth;
		
		SecretKey secretKey = Keys.hmacShaKeyFor( Decoders.BASE64.decode(ACCESS_TOKEN_SECRET ));
		try {
			Claims claims = Jwts
					.parser()
					.verifyWith(secretKey)
					.build()
					.parseSignedClaims(token)
					.getPayload();
			
			String email = claims.getSubject();
			List< Map<String,String> > authoritiesList = null;
			if( claims.get("authorities") != null ) {
				authoritiesList = (List<Map<String, String>>) claims.get("authorities");				
			}
			List<GrantedAuthority> authorities = new ArrayList<>();
			
			for( Map<String, String> authorityMap : authoritiesList  ) {
				String authority = authorityMap.get("authority");
				authorities.add( new SimpleGrantedAuthority(authority)    );
			}

			userAuth = new UsernamePasswordAuthenticationToken(email, null, authorities);
			return userAuth;
		
			
		} catch (JwtException e) {
			throw new IllegalStateException("Problemas con el token");			
		}
		
		
	}
	
	

}
