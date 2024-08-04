package com.pakasio.app.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.pakasio.app.model.Product;

/**
 * Se usa Spring Data REST 
 * 
 * Ideal para proyectos donde necesitas exponer rápidamente 
 * una API RESTful sin escribir mucho código manualmente, 
 * especialmente útil en prototipos y aplicaciones donde 
 * las operaciones CRUD estándar son suficientes.
 */
public interface ProductRepository extends CrudRepository<Product, Long>, PagingAndSortingRepository<Product, Long> {
	

}
