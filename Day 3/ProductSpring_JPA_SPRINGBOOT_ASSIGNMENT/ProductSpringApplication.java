package com.Product.ProductSpring;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.Product.ProductSpring.Product.Product;
import com.Product.ProductSpring.Product.ProductService;



@SpringBootApplication
public class ProductSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(ProductSpringApplication.class, args);
		
		ProductService service = context.getBean(ProductService.class);
		//service.show();
	//	ProductService service= new ProductService();
		
		//service.addProduct(new Product("RedGead","Controller","Table",2021));

		System.out.println("=================================================================");
		
		List<Product> products  = service.getProductByType("phone");
		for (Product product : products) {

			System.out.println(product);

		}
		
	}

}
