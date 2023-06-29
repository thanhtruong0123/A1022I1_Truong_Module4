package com.example.customermanagementprovince.service;

import com.example.customermanagementprovince.model.Customer;

import java.util.Optional;

public interface ICustomerService {
    Iterable<Customer> findAll();

    Optional<Customer> findById(int id);

    void save(Customer customer);

    void remove(int id);
}
