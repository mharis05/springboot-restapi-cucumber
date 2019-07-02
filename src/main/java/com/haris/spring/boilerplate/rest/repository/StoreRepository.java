package com.haris.spring.boilerplate.rest.repository;

import com.haris.spring.boilerplate.rest.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Integer> {

    public Store findByName(String name);
    public Store findByCode(Integer code);
}
