package com.example.customermanagementprovince.repository;

import com.example.customermanagementprovince.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Integer> {
}
