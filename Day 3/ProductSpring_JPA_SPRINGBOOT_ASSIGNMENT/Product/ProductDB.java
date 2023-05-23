package com.Product.ProductSpring.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductDB extends JpaRepository<Product, Integer>{
	List<Product> findByNameIgnoreCase(String name);
	List<Product> findByTypeIgnoreCase(String type);
	List<Product> findByPlaceIgnoreCase(String place);
	List<Product> findByNameContainingIgnoreCase(String name);
	List<Product> findByTypeContainingIgnoreCase(String type);
	List<Product> findByPlaceContainingIgnoreCase(String place);
	
} 