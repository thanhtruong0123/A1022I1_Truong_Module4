package com.example.furama.service.customer.itf;

import com.example.furama.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
    Page<Customer> searchByName(Pageable pageable, String name);

    List<Customer> findAll();

    Customer findById(Long id);

    void addNew(Customer customer);

    void deleteAllByIds(List<Long> customerIds);

    void updateCustomer(Customer customer);
}
