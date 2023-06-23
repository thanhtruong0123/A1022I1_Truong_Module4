package com.product.service;

import com.product.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private static List<Product> productList;

    static {
        productList= new ArrayList<>();
        productList.add(new Product(1, "IphoneX", 3000, "Yellow", "China"));
        productList.add(new Product(2, "Iphone 11", 5000, "Pink", "Vietnam"));
        productList.add(new Product(3, "Iphone 12", 8000, "Black", "USA"));
    }
    @Override
    public List<Product> getList() {
        return productList;
    }

    @Override
    public Product getProduct(int id) {
        return productList.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean addProduct(Product product) {
        return productList.add(product);
    }

    @Override
    public boolean updateProduct(int id, Product product) {
        if (productList.contains(product)) {
            for (Product existingProduct : productList) {
                if (existingProduct.getId() == id) {
                    productList.set(productList.indexOf(existingProduct), product);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean deleteProduct(int id) {
        if (productList.contains(productList)) {
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getId() == id) {
                    productList.remove(i);
                    return true;
                }
            }
        }
        return false;
    }
}
