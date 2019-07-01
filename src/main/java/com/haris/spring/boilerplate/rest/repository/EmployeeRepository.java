package com.haris.spring.boilerplate.rest.repository;

import com.haris.spring.boilerplate.rest.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
