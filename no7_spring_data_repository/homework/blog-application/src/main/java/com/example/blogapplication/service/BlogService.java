package com.example.blogapplication.service;

import com.example.blogapplication.model.Blog;
import com.example.blogapplication.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository blogRepository;

    @Override
    public List<Blog> showListBlog() {
        return blogRepository.findAll();
    }

    @Override
    public Page<Blog> searchBlogsByTitleContaining(Pageable pageable, String title) {
        return blogRepository.searchBlogsByTitleContaining(pageable, title);
    }

    @Override
    public Page<Blog> showListBlog(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Blog showBlog(Long id) {
        Optional<Blog> blogOptional = blogRepository.findById(id);
        if (blogOptional.isPresent()) {
            return blogOptional.get();
        } else {
            return null;
        }
    }

    @Override
    public void addBlog(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void updateBlog(Long id, Blog blog) {
        Blog existedBlog = blogRepository.findById(id).orElse(null);

        if (existedBlog != null) {
            //update properties
            existedBlog.setTitle(blog.getTitle());
            existedBlog.setContent(blog.getContent());
            existedBlog.setAuthor(blog.getAuthor());
            existedBlog.setCategory(blog.getCategory());

            //save
            blogRepository.save(existedBlog);
        }
    }

    @Override
    public void removeBlog(Long id) {
        Blog existedBlog = blogRepository.findById(id).orElse(null);

        if (existedBlog != null) {
            blogRepository.deleteById(id);
        }
    }
}
