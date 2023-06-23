package com.product.service;

import com.product.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getList();
    Product getProduct(int id);
    boolean addProduct(Product product);
    boolean updateProduct(int id, Product product);
    boolean deleteProduct(int id);
}
