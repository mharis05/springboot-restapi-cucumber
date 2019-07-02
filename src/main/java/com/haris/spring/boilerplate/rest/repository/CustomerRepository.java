package com.haris.spring.boilerplate.rest.repository;

import com.haris.spring.boilerplate.rest.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
