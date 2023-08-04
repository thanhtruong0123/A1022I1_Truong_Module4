package com.example.shoppingcartproject.service.itf;

import com.example.shoppingcartproject.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
}
