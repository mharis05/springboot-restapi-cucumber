package com.haris.spring.boilerplate.rest.service;

import com.haris.spring.boilerplate.rest.model.Employee;

import java.util.List;

public interface EmployeeService {
    public abstract void createEmployee(Employee employee);
    public abstract List<Employee> getEmployees();
    public abstract Employee getEmployee(Integer code);
}
