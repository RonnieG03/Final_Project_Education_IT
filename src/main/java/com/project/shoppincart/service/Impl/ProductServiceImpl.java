package com.project.shoppincart.service.Impl;

import com.project.shoppincart.model.Product;
import com.project.shoppincart.repository.ProductRepository;
import com.project.shoppincart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
    @Override
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }
    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }
    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);

    }
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
    @Override
    public List<Product> saveList(List<Product> products) {
        return productRepository.saveAll(products);
    }
}
