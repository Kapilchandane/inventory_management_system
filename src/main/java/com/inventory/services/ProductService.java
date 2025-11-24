package com.inventory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.entity.Product;
import com.inventory.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository repo;

	public String addProduct(Product product) {
		repo.save(product);
		return "success";
	}

	public List<Product> getAllProducts() {
		List<Product> all = repo.findAll();
		return all;

	}

}
