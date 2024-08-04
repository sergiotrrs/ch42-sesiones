package com.pakasio.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pakasio.app.model.PurchaseHasProducts;
import com.pakasio.app.service.PurchaseHasProductsService;

@RestController
@RequestMapping("api/v1/purchase-has-products")
@CrossOrigin(origins = "*")
public class PurchaseHasProductsController {

	PurchaseHasProductsService puHprService;

	public PurchaseHasProductsController(PurchaseHasProductsService puHprService) {
		this.puHprService = puHprService;
	}
	
	
	@PostMapping
	public ResponseEntity<PurchaseHasProducts> createOrderHasProduct(@RequestBody PurchaseHasProducts purchaseHasProducts) {
		PurchaseHasProducts savedOrderHasProduct = puHprService.createOrderHasProduct(purchaseHasProducts);
		return ResponseEntity.status(201).body(savedOrderHasProduct);
	}
		
	@GetMapping
	public ResponseEntity< Iterable<PurchaseHasProducts>> getAllPurchaseHasProducts() {
		Iterable<PurchaseHasProducts> orderHasProducts = puHprService.getPurchaseHasProducts();
		return ResponseEntity.ok(orderHasProducts);
	}
	
	@GetMapping("/query") // localhost:8080/api/v1/purchase-has-products/query?purchaseId=1&productId=3 
	public ResponseEntity< PurchaseHasProducts> getPurchaseHasProductByCompositeId(
			@RequestParam(name = "purchaseId") Long purchaseId,
			@RequestParam(name = "productId") Long productId
			) {
		PurchaseHasProducts orderHasProduct = puHprService.getPurchaseHasProductByCompositeId(purchaseId, productId);
		return ResponseEntity.ok(orderHasProduct);
	}
	
	@GetMapping("/purchase/{id}") // localhost:8080/api/v1/purchase-has-products/purchase/1
	public ResponseEntity< Iterable<PurchaseHasProducts>> getPurchaseHasProductsByPurchaseId(
			@PathVariable("id") Long purchaseId
			) {
		Iterable<PurchaseHasProducts> orderHasProducts = puHprService.getPurchaseHasProductsByPurchaseId(purchaseId);
		return ResponseEntity.ok(orderHasProducts);
	}

	
	
}
