package com.haris.spring.boilerplate.rest.repository;

import com.haris.spring.boilerplate.rest.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
