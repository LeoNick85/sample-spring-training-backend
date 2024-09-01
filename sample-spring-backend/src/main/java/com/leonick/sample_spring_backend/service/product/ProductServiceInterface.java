package com.leonick.sample_spring_backend.service.product;

import com.leonick.sample_spring_backend.model.Product;
import com.leonick.sample_spring_backend.request.AddProductRequest;
import com.leonick.sample_spring_backend.request.ProductUpdateRequest;

import java.util.List;

public interface ProductServiceInterface {
    Product addProduct(AddProductRequest request);

    void deleteProductById(Long id);
    Product updateProduct(ProductUpdateRequest request, Long productId);

    List<Product> getAllProducts();
    Product getProductById(Long id);
    List<Product> getProductsByCategoryName(String name);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String brand, String name);
}
