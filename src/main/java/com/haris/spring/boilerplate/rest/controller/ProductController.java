package com.haris.spring.boilerplate.rest.controller;


import com.haris.spring.boilerplate.rest.model.Product;
import com.haris.spring.boilerplate.rest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<String> addProduct(@Valid @RequestBody Product product){
        return productService.createProduct(product);
    }

    @GetMapping("/list")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @DeleteMapping("{code}")
    public ResponseEntity<String> deleteProduct(@PathVariable("code") Integer code){
        return productService.deleteProduct(code);
    }

    @GetMapping("{code}")
    public Product getProduct(@PathVariable("code") Integer code){
        return productService.getProduct(code);
    }
}
