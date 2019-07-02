package com.haris.spring.boilerplate.rest.service.impl;

import com.haris.spring.boilerplate.rest.model.Employee;
import com.haris.spring.boilerplate.rest.model.Store;
import com.haris.spring.boilerplate.rest.repository.StoreRepository;
import com.haris.spring.boilerplate.rest.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreRepository storeRepository;

    @Override
    public void addNewStore(Store store) {
        storeRepository.save(store);
    }

    @Override
    public List<Store> getAllStores() {
        return storeRepository.findAll();
    }

    @Override
    public void assignEmployeeToStore(Employee employee, Store store) {

    }

    @Override
    public List<Employee> getStoreEmployees(Store store) {
        return null;
    }

    @Override
    public Store getStore(Integer code) {
        return storeRepository.findByCode(code);
    }
}
