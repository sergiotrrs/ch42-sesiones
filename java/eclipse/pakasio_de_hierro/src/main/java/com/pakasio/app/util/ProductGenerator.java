package com.pakasio.app.util;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.pakasio.app.model.Category;
import com.pakasio.app.model.Product;

public final class ProductGenerator {
	
	private ProductGenerator() {}
	
	
	public static List<Product> generateRandomProducts(int quantity, long categoryId) {
		List<Product> products = new ArrayList<>();

		for (int i = 0; i < quantity; i++) {
			products.add(generateRandomProduct(categoryId));
		}

		return products;
	}
	
	public static Product generateRandomProduct(long categoryId) {
		int number = RandomGenerator.randomNumber(1000);
		int photoNumber = RandomGenerator.randomNumber(8);
		Product randomProduct = new Product();
		randomProduct.setName("Lego " + number );		
		randomProduct.setImage("https://randomuser.me/api/portraits/lego/"+photoNumber+".jpg");
		randomProduct.setPrice(BigDecimal.valueOf(99.44) );
		randomProduct.setCategory( Category.setProductCategory(categoryId) );
				
		return randomProduct;
	}
	


}
