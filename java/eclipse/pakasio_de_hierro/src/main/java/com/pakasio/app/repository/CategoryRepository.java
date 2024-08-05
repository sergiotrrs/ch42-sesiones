package com.pakasio.app.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.pakasio.app.model.Category;

/**
 * Se usa Spring Data REST 
 * 
 * Ideal para proyectos donde necesitas exponer rápidamente 
 * una API RESTful sin escribir mucho código manualmente, 
 * especialmente útil en prototipos y aplicaciones donde 
 * las operaciones CRUD estándar son suficientes.
 */
@CrossOrigin
public interface CategoryRepository extends CrudRepository<Category, Long>, PagingAndSortingRepository<Category, Long> {
	

}
