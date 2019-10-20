package com.haris.spring.boilerplate.rest.model;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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

    @NotEmpty(message = "Please provide a Product name.")
    private String name;
    @NotNull(message = "Please provide a quantity.")
    private Integer quantity;
    @NotNull(message = "Please provide a price.")
    private Double price;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
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
