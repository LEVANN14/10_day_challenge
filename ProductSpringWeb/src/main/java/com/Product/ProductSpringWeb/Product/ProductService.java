package com.Product.ProductSpringWeb.Product;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ProductService {
	
	@Autowired
	ProductDB db;
	
	

	
	public List<Product> getAllProducts(){
		
		return db.findAll();
		
	}
	

	
//-----------------------------------------Assignment part--------------------------------------
	//Adding new Product to the database 
	public void addProduct(Product p) {
		db.save(p);
	}
	
	//Finding product by name case insensitive 
	public List<Product> getProductByName(String name){
		return db.findByNameIgnoreCase(name);
	}

	//Finding product by type case insensitive 	
	public List<Product> getProductByType(String type){
		return db.findByTypeIgnoreCase(type);
	}
	
	//Finding product by place case insensitive 
	public List<Product> getProductByPlace(String place){
		return db.findByPlaceIgnoreCase(place);
	}
	
	//Finding product by text case insensitive 
	public List<Product> getProductByText(String text){
		List<Product> products= new ArrayList<>();
		products.addAll(db.findByNameContainingIgnoreCase(text));
		products.addAll(db.findByTypeContainingIgnoreCase(text));
		products.addAll(db.findByPlaceContainingIgnoreCase(text));
		
		return products;
	}
	
	//List all out of warranty products
	//Considering if current year and warranty year are equal then the product is in warranty
	public List<Product> getOutOfWarranty(){
		Calendar today=Calendar.getInstance();
		int year=today.get(Calendar.YEAR);
		return db.findByWarrantyLessThan(year);
	}
	
}
