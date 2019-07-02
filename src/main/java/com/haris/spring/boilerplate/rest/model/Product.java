package com.haris.spring.boilerplate.rest.model;

import javax.persistence.*;

@Entity
public class Product {

    public Product() {
    }

    public Product(String name, Integer code, Double price, Integer quantity) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.quantity = quantity;
    }

    private String name;
    private Integer quantity;


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer code;

    @ManyToOne
    @JoinColumn(name="storeCode")
    private Store store;


    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    private Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
