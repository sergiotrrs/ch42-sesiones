package com.pakasio.app.util;

import java.security.SecureRandom;
import java.util.Base64;

public class SecretBase64KeyGenerator {
	 public static void main(String[] args) {
	        byte[] key = new byte[32]; // 256 bits
	        new SecureRandom().nextBytes(key);
	        String base64Key = Base64.getEncoder().encodeToString(key);
	        System.out.println("Generated ACCESS_TOKEN_SECRET: " + base64Key);
	    }
}
