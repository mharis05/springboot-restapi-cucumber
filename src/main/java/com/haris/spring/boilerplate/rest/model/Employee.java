package com.haris.spring.boilerplate.rest.model;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer registrationNumber;

    public Employee() {
    }

    private String name;
    private Integer age;

    public Employee(String name, Integer age, Integer registrationNumber) {
        this.name = name;
        this.age = age;
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setRegistrationNumber(Integer registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }
}
