package com.haris.spring.boilerplate.rest.model;

import javax.persistence.*;


@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer code;

    @ManyToOne
    @JoinColumn
    private Store store;

    public Employee() {
    }

    private String name;
    private Integer age;

    public Employee(String name, Integer age, Integer code) {
        this.name = name;
        this.age = age;
        this.code = code;
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

    public void setcode(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
