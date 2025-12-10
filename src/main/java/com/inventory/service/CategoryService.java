package com.inventory.service;

import java.util.List;

import com.inventory.dto.CategoryDTO;

public interface CategoryService {

    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO updateCategory(Long id, CategoryDTO categoryDTO);

    CategoryDTO getCategoryById(Long id);

    List<CategoryDTO> getAllCategories();

    void deleteCategory(Long id);

    CategoryDTO getCategoryByName(String name);
}
