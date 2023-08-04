package com.example.shoppingcartproject.service;

import com.example.shoppingcartproject.model.Product;
import com.example.shoppingcartproject.repository.IProductRepository;
import com.example.shoppingcartproject.service.itf.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
