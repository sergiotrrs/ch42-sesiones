package com.pakasio.app.service;

import com.pakasio.app.model.PurchaseHasProducts;

public interface PurchaseHasProductsService {
	
	PurchaseHasProducts createOrderHasProduct(PurchaseHasProducts purchaseHasProduct);
	Iterable<PurchaseHasProducts> getPurchaseHasProducts();	
	PurchaseHasProducts getPurchaseHasProductByCompositeId(Long purchaseId, Long productId);	
	Iterable<PurchaseHasProducts> getPurchaseHasProductsByPurchaseId(Long purchaseId);		
	PurchaseHasProducts updatePurchaseHasProductByCompositeId(PurchaseHasProducts purchaseHasProduct, long purchaseId, long productId);
	void deletePurchaseHasProductByCompositeId(Long purchaseId, Long productId);

}
