package com.haris.spring.boilerplate.rest.model;

import org.springframework.stereotype.Component;

public class Store {
    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    private String storeCode;
    private String storeName;
}
