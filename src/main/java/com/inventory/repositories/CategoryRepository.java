package com.inventory.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	 Optional<Category> findByName(String name);

}
