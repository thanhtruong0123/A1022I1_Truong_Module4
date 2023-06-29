package com.example.blogapplication.service;

import com.example.blogapplication.model.Blog;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    List<Blog> showListBlog();

    Blog showBlog(Long id);

    void addBlog(Blog blog);

    void updateBlog(Long id, Blog blog);

    void removeBlog(Long id);
}
