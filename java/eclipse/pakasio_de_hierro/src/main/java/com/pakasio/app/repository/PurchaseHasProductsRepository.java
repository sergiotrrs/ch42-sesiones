package com.pakasio.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.pakasio.app.model.PurchaseHasProducts;
import com.pakasio.app.model.composite_key.PurchaseProductKey;

@RepositoryRestResource(collectionResourceRel = "purchaseHasProducts", path = "purchaseHasProducts")
public interface PurchaseHasProductsRepository extends CrudRepository< PurchaseHasProducts, PurchaseProductKey> {
	
	List<PurchaseHasProducts> findAllByPurchaseId(@Param("id") Long purchaseId );
	//Optional<PurchaseHasProducts> findByPurchaseIdAndProductId();
}
