package com.haris.spring.boilerplate.rest.service.impl;

import com.haris.spring.boilerplate.rest.model.Product;
import com.haris.spring.boilerplate.rest.repository.ProductRepository;
import com.haris.spring.boilerplate.rest.service.ProductService;
import gherkin.deps.com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ResponseEntity<String> createProduct(Product product) {
        productRepository.save(product);
        return new ResponseEntity<String>(new Gson().toJson("Product added successfully."), HttpStatus.CREATED);
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(Integer code) {
        return productRepository.findByCode(code);
    }

    @Override
    public ResponseEntity<String> deleteProduct(Integer code) {
        try {
            productRepository.deleteById(code);
        } catch (DataAccessException dae) {
            return new ResponseEntity<>(new Gson().toJson("Product with given ID does not exist."), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(new Gson().toJson("Product deleted successfully."), HttpStatus.OK);
    }
}
