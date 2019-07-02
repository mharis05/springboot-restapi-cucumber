package com.haris.spring.boilerplate.rest.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Store {

    public Store(Integer code, String name, List<Employee> employees, List<Product> products) {
        this.code = code;
        this.name = name;
        this.employees = employees;
        this.products = products;
    }

    public Store() {

    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer code;

    @OneToMany(targetEntity=Employee.class)
    private List<Employee> employees;

    @OneToMany(targetEntity=Product.class)
    private List<Product> products;

    private String name;

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Product> getProducts() {
        return products;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
