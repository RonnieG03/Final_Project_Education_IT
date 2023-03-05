package com.project.shoppincart.service;

import com.project.shoppincart.model.Product;
import com.project.shoppincart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository productRepository;
    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
    @Override
    public Optional<Product> getProductById(Integer id) {
        return productRepository.findById(id);
    }
    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }
    @Override
    public void delete(Integer id) {
        productRepository.deleteById(id);

    }
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
