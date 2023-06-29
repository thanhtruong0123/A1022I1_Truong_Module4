package com.example.blogapplication.controller;

import com.example.blogapplication.model.Blog;
import com.example.blogapplication.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @GetMapping("/")
    public String getBlog(Model model) {
        List<Blog> blogList = blogService.showListBlog();
        model.addAttribute("blogList", blogList);
        return "/list";
    }

    @GetMapping("/create")
    public String createBlog(Model model) {
        model.addAttribute("blog", new Blog());
        return "/create";
    }

    @PostMapping("/create")
    public String createBlog(@ModelAttribute("blog") Blog blog, Model model) {
        blogService.addBlog(blog);
        model.addAttribute("mess", "Create successfully");
        return "/create";
    }

    @GetMapping("/detail/{id}")
    public String getBlog(@PathVariable Long id, Model model) {
        Blog blog = blogService.showBlog(id);
        model.addAttribute("blog", blog);
        return "/detail";
    }

    @GetMapping("/delete/{id}")
    public String removeBlog(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        blogService.removeBlog(id);
        redirectAttributes.addFlashAttribute("mess", "Delete successfully");
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editBlog(@PathVariable Long id, Model model) {
        Blog blog = blogService.showBlog(id);
        model.addAttribute("blog", blog);
        return "/edit";
    }

    @PostMapping("/edit/{id}")
    public String editBlog(@PathVariable Long id, @ModelAttribute("blog") Blog blog, Model model) {
        blogService.updateBlog(id, blog);
        model.addAttribute("mess", "Edit successfully");
        return "/edit";
    }
}
