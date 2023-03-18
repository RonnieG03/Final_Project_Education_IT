package com.project.shoppincart.controller;


import com.project.shoppincart.model.Product;
import com.project.shoppincart.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("api/v1/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    private final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    @PostMapping("/save")
    public ResponseEntity<Product> save(@RequestBody Product product){
        LOGGER.info("Create new product{}",product);
        return ResponseEntity.ok(productService.save(product));
    }

    @GetMapping()
    public ResponseEntity<List<Product>> list(){
        LOGGER.info("Get product list");
        return ResponseEntity.ok(productService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Integer id) {
        LOGGER.info("get product by id{}", id);
        Optional<Product> productOptional = productService.getProductById(id);
        return productOptional
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@RequestBody Product product, @PathVariable Integer id) {
        LOGGER.info("Update product{}",product);
        Optional<Product> productOptional = productService.getProductById(id);
        return productOptional
                .map(theProduct -> {
                    theProduct.setName(product.getName());
                    theProduct.setPrice(product.getPrice());
                    theProduct.setDescription(product.getDescription());
                    theProduct.setAmount(product.getAmount());
                    theProduct.setImage(product.getImage());
                    return ResponseEntity.ok(productService.update(theProduct));
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> delete(@PathVariable Integer id){
        LOGGER.info("Delete product{}",id);
        Optional<Product> productOptional = productService.getProductById(id);
        return productOptional
                .map(product -> {
                    productService.delete(product.getId());
                    return ResponseEntity.ok(product);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());

    }
}
