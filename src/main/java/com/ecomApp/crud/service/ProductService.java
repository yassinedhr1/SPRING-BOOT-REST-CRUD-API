package com.ecomApp.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomApp.crud.model.Product;
import com.ecomApp.crud.repository.ProductRepository;
//
@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	//get all products
	public List<Product> getAllproducts(){
		 return productRepository.findAll();
		
	}
	//get one product by id
	public Optional<Product> getProductById(Long id) {
		return productRepository.findById(id);
	}
	//create one product
	public Product createProduct(Product product) {
		 return productRepository.save(product);
	}
	//update a product
	public Product updateProduct(Long id,Product productdetails) {
	Optional<Product> productUpdate=productRepository.findById(id);	
	    Product productUpdate1=productUpdate.get();
		productUpdate1.setName(productdetails.getName());
		productUpdate1.setPrice(productdetails.getPrice());
		return productUpdate1;
		
		
		
		
	}
	//delete one product
	public void deleteProduct(Long id) {
		
		productRepository.deleteById(id);	
		
	}
	
	

}
