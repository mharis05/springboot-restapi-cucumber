package com.haris.spring.boilerplate.rest.service;

import com.haris.spring.boilerplate.rest.model.Employee;
import com.haris.spring.boilerplate.rest.model.Store;

import java.util.List;
import java.util.Optional;

public interface StoreService {

    public abstract void addNewStore(Store store);
    public abstract List<Store> getAllStores();
    public abstract void assignEmployeeToStore(Employee employee, Store store);
    public abstract List<Employee> getStoreEmployees(Store store);
    public abstract Store getStore(Integer code);
}
