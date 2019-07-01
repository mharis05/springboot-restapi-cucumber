package com.haris.spring.boilerplate.rest.repository;

import com.haris.spring.boilerplate.rest.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}