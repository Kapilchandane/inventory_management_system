package com.inventory.service;

import java.util.List;
import com.inventory.dto.ProductDTO;

public interface ProductService {

    ProductDTO createProduct(ProductDTO productDTO);

    List<ProductDTO> getAllProducts();

    ProductDTO getProductById(Long id);

    ProductDTO updateProduct(Long id, ProductDTO productDTO);

    void deleteProduct(Long id);
    
    List<ProductDTO> searchByName(String name);

    List<ProductDTO> searchByCategory(String category);

    List<ProductDTO> searchByNameAndCategory(String name, String category);

}
