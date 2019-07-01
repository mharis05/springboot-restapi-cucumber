package com.haris.spring.boilerplate.rest.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Employees {

    private List<Employee> employees;

    public List<Employee> getEmployees() {
        if(this.employees == null) {
            this.employees = new ArrayList<>();
        }
        return this.employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
