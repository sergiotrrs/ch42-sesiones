package com.pakasio.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.pakasio.app.model.Purchase;

@RepositoryRestResource(collectionResourceRel = "purchases", path = "purchases")
public interface PurchaseRepository extends CrudRepository<Purchase, Long>, PagingAndSortingRepository<Purchase, Long> {
	
	List<Purchase> findAllByUserId(@Param("value") Long id);
}
