package com.ecomApp.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecomApp.crud.model.Product;
import com.ecomApp.crud.service.ProductService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/products")
public class ProductController {
	@Autowired
	private ProductService productService;
//get all products
	@GetMapping
	public List<Product> getAllproducts(){
		return productService.getAllproducts();
		
	}
//get product by Id
	@GetMapping("/{id}")
	public Optional<Product> getProductById(@PathVariable Long id ) {
		 return productService.getProductById(id);
	}
//create a product
	@PostMapping
	public Product createProduct(@RequestBody Product product) {
		return productService.createProduct(product);
	}
// update a product
	@PutMapping("/{id}")
	public Product UpdateProduct(@PathVariable Long id,@RequestBody Product productsDetails) {
		return productService.updateProduct(id, productsDetails);
	}
	
	
	
	
//delete product by Id
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
	}
	
	
}
