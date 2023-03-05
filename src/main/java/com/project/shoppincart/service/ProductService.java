package com.project.shoppincart.service;

import com.project.shoppincart.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product save(Product product);
    Optional<Product> getProductById(Integer id);
    Product update (Product product);
    void delete(Integer id);
    List<Product> findAll();
}
