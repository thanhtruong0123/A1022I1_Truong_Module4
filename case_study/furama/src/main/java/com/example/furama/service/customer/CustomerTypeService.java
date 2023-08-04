package com.example.furama.service.customer;

import com.example.furama.model.customer.CustomerType;
import com.example.furama.repository.customer.ICustomerTypeRepository;
import com.example.furama.service.customer.itf.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    private ICustomerTypeRepository customerTypeRepository;

    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }
}
