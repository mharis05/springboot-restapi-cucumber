package com.haris.spring.boilerplate.rest.controller;

import com.haris.spring.boilerplate.rest.model.Store;
import com.haris.spring.boilerplate.rest.service.StoreService;
import gherkin.deps.com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stores")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @GetMapping("/list")
    public List<Store> getAllStores() {
        return storeService.getAllStores();
    }

    @PostMapping("/add")
    public ResponseEntity<Object> addStore(@RequestBody Store store) {
        storeService.addNewStore(store);
        return new ResponseEntity<>(new Gson().toJson("Store added successfully."), HttpStatus.CREATED);
    }

    @PutMapping(path = "/employee/{storeCode}/{empCode}")
    public ResponseEntity<Object> assignEmployeeToStore(@PathVariable("storeCode") Integer storecode, @PathVariable("empCode") Integer empCode) {
        return null;
    }

    @GetMapping(value = "/{code}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Store getStoreDetail(@PathVariable("code") Integer code) {
        return storeService.getStore(code);
    }
}
