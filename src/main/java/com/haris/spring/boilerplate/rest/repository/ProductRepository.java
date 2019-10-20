package com.haris.spring.boilerplate.rest.repository;

import com.haris.spring.boilerplate.rest.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    public Product findByCode(Integer code);
    public ResponseEntity<String> deleteByCode(Integer code);
}
