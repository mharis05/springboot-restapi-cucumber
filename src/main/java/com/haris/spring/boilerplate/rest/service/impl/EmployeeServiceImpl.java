package com.haris.spring.boilerplate.rest.service.impl;

import com.haris.spring.boilerplate.rest.model.Employee;
import com.haris.spring.boilerplate.rest.repository.EmployeeRepository;
import com.haris.spring.boilerplate.rest.service.EmployeeService;
import gherkin.deps.com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void createEmployee(Employee employee) {
        employeeRepository.save(employee);
        System.out.println("Employee saved: " + employee.getName() + " with ID: " + employee.getCode());
        employeeRepository.findById(employee.getCode());
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(Integer code) {
        return employeeRepository.findByCode(code);
    }

    @Override
    public ResponseEntity<String> deleteEmployee(Integer code) {
        try {
            employeeRepository.deleteById(code);
        } catch (DataAccessException dae) {
            return ResponseEntity.status( HttpStatus.NOT_FOUND).body(new Gson().toJson("Employee does not exist with the provided Identifier."));
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
