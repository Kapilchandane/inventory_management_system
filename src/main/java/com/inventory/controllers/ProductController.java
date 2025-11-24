package com.inventory.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.entity.Product;
import com.inventory.services.ProductService;

@RestController
public class ProductController {
	
	@Autowired ProductService service;
	
	@PostMapping("/add-product")
	public String addProduct(@RequestBody Product product) {
		
		String pro = service.addProduct(product);
		
		return "successfully product added";
		
	}

}
