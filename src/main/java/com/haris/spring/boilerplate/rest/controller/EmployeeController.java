package com.haris.spring.boilerplate.rest.controller;

import com.haris.spring.boilerplate.rest.model.Employee;
import com.haris.spring.boilerplate.rest.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/employees",
            produces = "application/json")
    @ResponseBody
    public List<Employee> employees() {
        return employeeRepository.findAll();
    }

    @RequestMapping(
            method = RequestMethod.POST,
            value = "/employee",
            produces = "application/json")
    @ResponseBody
    public void addEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        System.out.println("Employee saved: " + employee.getName() + "with ID: " + employee.getRegistrationNumber());
        employeeRepository.findById(employee.getRegistrationNumber());
    }


}