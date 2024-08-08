package com.pakasio.app.util;

import org.mindrot.jbcrypt.BCrypt;

public final class PasswordUtils {

	private PasswordUtils(){}
	
    public static String encryptPassword(String plainPassword) {
        return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
    }
    
    public static boolean verifyPassword(String plainPassword, String hashedPassword) {
        return BCrypt.checkpw(plainPassword, hashedPassword);
    }
    
    public static void main(String[] args) {
		System.out.println( encryptPassword("123")  );
	}
   
}