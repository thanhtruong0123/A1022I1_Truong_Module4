package com.example.blogapplication.service;

import com.example.blogapplication.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    List<Blog> showListBlog();

    Page<Blog> searchBlogsByTitleContaining(Pageable pageable, String title);


    Page<Blog> showListBlog(Pageable pageable);

    Blog showBlog(Long id);

    void addBlog(Blog blog);

    void updateBlog(Long id, Blog blog);

    void removeBlog(Long id);
}
