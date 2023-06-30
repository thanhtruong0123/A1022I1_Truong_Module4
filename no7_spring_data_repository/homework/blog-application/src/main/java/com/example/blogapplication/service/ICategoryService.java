package com.example.blogapplication.service;

import com.example.blogapplication.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> getList();

    Category getCategory(Long id);
}
