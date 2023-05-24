package com.Product.ProductSpringWeb.Product;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@Controller
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@RequestMapping("/")
	public String homePage(ModelMap model) {
		List<Product> product=service.getAllProducts();
		model.addAttribute("products",product);
		return "welcomePage";
	}
	
	@RequestMapping(value="/addProduct", method = RequestMethod.GET)
	public String showAddProductsPage(ModelMap model) {
		Product product=new Product();
		model.put("product", product);
		return "product";
	}
	
	@RequestMapping(value="/addProduct", method = RequestMethod.POST)
	public String addProductsToDB(ModelMap model, Product product) {
		
		service.addProduct(product);
		return "redirect:/";
	}
	
	@RequestMapping(value="/searchByName", method = RequestMethod.GET)
	public String showSearchProductsNamePage(ModelMap model) {
		List<Product> products=new ArrayList<>();
		String productName="";
		model.addAttribute("productName",productName);

		
		return "searchByName";
	}
	
	@RequestMapping(value="/searchByName", method = RequestMethod.POST)
	public String searchProductName(@RequestParam String productName,ModelMap model) {
		List<Product> product=service.getProductByName(productName);
		model.addAttribute("products",product);
		return "searchByName";
	}
	
	@RequestMapping(value="/searchByText", method = RequestMethod.GET)
	public String showSearchProductsTextPage(ModelMap model) {
		List<Product> products=new ArrayList<>();
		String productText="";
		model.addAttribute("productText",productText);

		
		return "searchByText";
	}
	
	@RequestMapping(value="/searchByText", method = RequestMethod.POST)
	public String searchProductText(@RequestParam String productText,ModelMap model) {
		List<Product> product=service.getProductByText(productText);
		model.addAttribute("products",product);
		return "searchByText";
	}
	
	@RequestMapping("/outOfWarranty")
	public String outOfWarranty(ModelMap model) {
		List<Product> product=service.getOutOfWarranty();
		model.addAttribute("products",product);
		return "outOfWarranty";
	}
	
	
	/*----------------------------------------------------------RestController--------------------------------------------*/
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		
		return service.getAllProducts();
		//return null;
	}
	
	@GetMapping("/products/{name}")
	public List<Product> getProducts( String name){
		
		return service.getProductByName(name);
		
	}
	
	//@PostMapping("/addProduct")
	public void addProduct(@RequestBody Product p) {
		service.addProduct(p);
		
	}
	
	@GetMapping("/outWarranty")
	public List<Product> getOutWarranty(){
		return service.getOutOfWarranty();
	}
	
}
