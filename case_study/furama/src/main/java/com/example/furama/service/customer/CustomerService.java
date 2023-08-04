package com.example.furama.service.customer;

import com.example.furama.model.customer.Customer;
import com.example.furama.repository.customer.ICustomerRepository;
import com.example.furama.service.customer.itf.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public Page<Customer> searchByName(Pageable pageable, String name) {
        return customerRepository.searchByName(pageable, name+"%");
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public void addNew(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteAllByIds(List<Long> customerIds) {
        customerRepository.deleteAllById(customerIds);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerRepository.save(customer);
    }
}
