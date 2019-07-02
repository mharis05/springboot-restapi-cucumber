package com.haris.spring.boilerplate.rest.service.impl;

import com.haris.spring.boilerplate.rest.model.Employee;
import com.haris.spring.boilerplate.rest.repository.EmployeeRepository;
import com.haris.spring.boilerplate.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
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
}
