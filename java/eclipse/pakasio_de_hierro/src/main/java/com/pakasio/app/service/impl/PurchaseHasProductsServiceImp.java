package com.pakasio.app.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pakasio.app.model.PurchaseHasProducts;
import com.pakasio.app.model.composite_key.PurchaseProductKey;
import com.pakasio.app.repository.PurchaseHasProductsRepository;
import com.pakasio.app.service.PurchaseHasProductsService;

@Service
public class PurchaseHasProductsServiceImp implements PurchaseHasProductsService {
	
	PurchaseHasProductsRepository puHprRepository;
	
	public PurchaseHasProductsServiceImp(PurchaseHasProductsRepository puHprRepository) {
		this.puHprRepository = puHprRepository;
	}

	@Override
	public PurchaseHasProducts createOrderHasProduct(PurchaseHasProducts purchaseHasProduct) {
		return puHprRepository.save( purchaseHasProduct );
	}

	@Override
	public Iterable<PurchaseHasProducts> getPurchaseHasProducts() {
		return puHprRepository.findAll();
	}

	@Override
	public PurchaseHasProducts getPurchaseHasProductByCompositeId(Long purchaseId, Long productId) {
		PurchaseProductKey purchaseProductKey = new PurchaseProductKey(purchaseId, productId);
		Optional<PurchaseHasProducts> optionalPuHpr = puHprRepository.findById(purchaseProductKey);
		if( optionalPuHpr.isEmpty()) {
			new IllegalStateException (
					"OrderHasProduct does not exist with orderId: " +
			purchaseId + " and productId " + productId);
		}
		return optionalPuHpr.get();
	}

	@Override
	public Iterable<PurchaseHasProducts> getPurchaseHasProductsByPurchaseId(Long purchaseId) {
		return puHprRepository.findAllByPurchaseId(purchaseId);
	}

	@Override
	public PurchaseHasProducts updatePurchaseHasProductByCompositeId(PurchaseHasProducts purchaseHasProduct,
			long purchaseId, long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePurchaseHasProductByCompositeId(Long purchaseId, Long productId) {
		PurchaseHasProducts puHpr = getPurchaseHasProductByCompositeId(purchaseId, productId);
		puHprRepository.delete(puHpr);
		
	}


}
