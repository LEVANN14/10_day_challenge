package ProductDemo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Stream;

public class ProductService {
	
	
	List<Product> products= new ArrayList<>();
	
	
	public void addProduct(Product p) {
		
		products.add(p);
		
	}
	
	
	public List<Product> getAllProducts() {
		
		
		return products;
	}


	public Product getProduct(String name) {
		
		for (Product product : products) {
			if(product.getName().equals(name)) {
				return product;
			}
				
		}
		
		return null;
		
	}
	
	public List<Product> getProductWithText(String text) {
		
		List<Product> prods=new ArrayList<>();
		for(Product p : products) {
			if(p.getName().toLowerCase().contains(text.toLowerCase()) || p.getType().toLowerCase().contains(text.toLowerCase())||p.getPlace().toLowerCase().contains(text.toLowerCase())) {
				prods.add(p);
			}
		
		}
		
		return prods;
	}
	
	//-------------------------Assignment part-----------------------------------------------------
	
	//Finding products by name using stream API. 
	public List<Product> getProductStream(String name) {
		List<Product> product= new ArrayList<>();
		products.stream().filter(p -> p.getName().toLowerCase().contains(name.toLowerCase())).forEach(p -> product.add(p));
		
		

		
		return product;
	}

	//Finding product by place, Additional feature -> Case insensitive search and partial text can also be searched
	public List<Product> getProductPlace(String place) {
		
		List<Product> prodPlace=new ArrayList<>();
		
		for (Product product : products) {
			if(product.getPlace().toLowerCase().contains(place.toLowerCase())) {
				prodPlace.add(product);
			}
		}
		
		return prodPlace;
		
	}



	
	//Get Products with text using stream API
	public List<Product> getProductWithTextStream(String text){
		List<Product> prods=new ArrayList<>();
		products.stream()
			.filter(p -> p.getName().toLowerCase().contains(text.toLowerCase()) || p.getType().toLowerCase().contains(text.toLowerCase())||p.getPlace().toLowerCase().contains(text.toLowerCase()))
			.forEach(p -> prods.add(p));
		
		return prods;
		
	}
	
	//This method will return products whose warranty year is older than the current year
	//NOTE: I am considering products whose warranty equals to the current year as in warranty.
	public List<Product> outOfWarranty() {
		Calendar today=Calendar.getInstance();
		int year=today.get(Calendar.YEAR);
		List<Product> outWarranty=new ArrayList<>();
		
		for(Product p: products) {
			if(p.getWarrnty()<year) {
				outWarranty.add(p);
			}
		}
		return outWarranty;
	}

}
