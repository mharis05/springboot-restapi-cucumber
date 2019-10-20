package com.haris.spring.boilerplate.rest.service;

import com.haris.spring.boilerplate.rest.model.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {
    public abstract ResponseEntity<String> createProduct(Product product);
    public abstract List<Product> getProducts();
    public abstract Product getProduct(Integer code);
    public abstract ResponseEntity<String> deleteProduct(Integer code);
}
