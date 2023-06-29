package com.example.blogapplication.service;

import com.example.blogapplication.model.Blog;
import com.example.blogapplication.repository.IBlogRepository;
import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
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
            existedBlog.setCreateAt(blog.getCreateAt());

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
