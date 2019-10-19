package com.haris.spring.boilerplate.rest.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.haris.spring.boilerplate.rest.model.Employee;
import com.haris.spring.boilerplate.rest.service.EmployeeService;
import gherkin.deps.com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/list")
    public List<Employee> employees() {
        return employeeService.getEmployees();
    }

    @GetMapping("{code}")
    public Employee getEmployee(@PathVariable("code") Integer code) {
        return employeeService.getEmployee(code);
    }

    @PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
        return new ResponseEntity<>(new Gson().toJson("Employee created successfully"), HttpStatus.CREATED);

    }

    @DeleteMapping("{code}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("code") Integer code) {
        return employeeService.deleteEmployee(code);
        //return new ResponseEntity<String>(new Gson().toJson("Employee deleted successfully"), HttpStatus.OK);
    }

}