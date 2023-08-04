package com.example.furama.service.customer.itf;

import com.example.furama.model.customer.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findAll();
}
