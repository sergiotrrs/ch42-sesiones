package com.pakasio.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.pakasio.app.model.Purchase;
/**
 * Se usa Spring Data REST 
 * 
 * Ideal para proyectos donde necesitas exponer rápidamente 
 * una API RESTful sin escribir mucho código manualmente, 
 * especialmente útil en prototipos y aplicaciones donde 
 * las operaciones CRUD estándar son suficientes.
 */
@RepositoryRestResource(collectionResourceRel = "purchases", path = "purchases")
public interface PurchaseRepository extends CrudRepository<Purchase, Long>, PagingAndSortingRepository<Purchase, Long> {
	
	List<Purchase> findAllByUserId(@Param("value") Long id);
}
