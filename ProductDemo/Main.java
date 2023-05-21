package ProductDemo;

import java.text.ParseException;
import java.util.*;



public class Main {

	public static void main(String[] args) throws ParseException {
		

		
		ProductService service = new ProductService();
		service.addProduct(new Product("Asus","laptop","drawer",2023));
		service.addProduct(new Product("Dell","laptop","table",2026));
		service.addProduct(new Product("Pixel","Phone","TV",2022));
		service.addProduct(new Product("G502","Mouse","table",2020));
		service.addProduct(new Product("ThinkPad","laptop","bag",2019));
		
		
		List<Product> p=service.getProductWithTextStream("t");
		p.forEach(n -> System.out.println(n));
		/*List<Product> products=service.getAllProducts();
		
		
		for (Product product : products) {
			
			System.out.println(product);
			
		}
		System.out.println("=================================================");
		
		System.out.println(service.getProduct("G502"));*/
	/*	
		List<Product> prods=service.getProductWithText("T");
		
		for(Product p1: prods) {
			System.out.println(p1);
		}*/
		
		
		//Finding product by place, Additional feature -> Case insensitive search and partial text can also be searched
		/*List<Product> prodPlace=service.getProductWithText("table");
		
		for(Product p1:prodPlace) {
			System.out.println(p1);
		}*/
		
		
		/*
		List<Product> outWarranty=service.outOfWarranty();
		for(Product p1:outWarranty) {
			System.out.println(p1);
		}*/
		
	}
}
