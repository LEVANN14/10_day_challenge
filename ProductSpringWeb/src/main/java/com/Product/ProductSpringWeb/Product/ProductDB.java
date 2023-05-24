package com.Product.ProductSpringWeb.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductDB extends JpaRepository<Product, Integer>{
	List<Product> findByNameIgnoreCase(String name);
	List<Product> findByTypeIgnoreCase(String type);
	List<Product> findByPlaceIgnoreCase(String place);
	List<Product> findByNameContainingIgnoreCase(String name);
	List<Product> findByTypeContainingIgnoreCase(String type);
	List<Product> findByPlaceContainingIgnoreCase(String place);
	List<Product> findByWarrantyLessThan(Integer warranty);
	
} 

