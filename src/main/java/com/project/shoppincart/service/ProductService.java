package com.project.shoppincart.service;

import com.project.shoppincart.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product save(Product product);
    Optional<Product> getProductById(Long id);
    Product update (Product product);
    void delete(Long id);
    List<Product> findAll();
    List<Product> saveList(List<Product> products);
}
