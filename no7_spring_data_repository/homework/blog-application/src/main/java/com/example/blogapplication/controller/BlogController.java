package com.example.blogapplication.controller;

import com.example.blogapplication.model.Blog;
import com.example.blogapplication.service.IBlogService;
import com.example.blogapplication.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.awt.print.Pageable;
import java.time.LocalDate;
import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/")
    public String getBlog(@RequestParam(defaultValue = "0") int page, Model model) {
        int pageSize = 2;
        PageRequest pageable = PageRequest.of(page, pageSize);
        Page<Blog> blogPage = blogService.showListBlog(pageable);
        model.addAttribute("blogPage", blogPage);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPage", blogPage.getTotalPages());
        model.addAttribute("categories", categoryService.getList());
        return "/list";
    }

    @GetMapping("/create")
    public String createBlog(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("categories", categoryService.getList());
        return "/create";
    }

    @PostMapping("/create")
    public String createBlog(@ModelAttribute("blog") Blog blog, RedirectAttributes redirectAttributes) {
        LocalDate localDate = LocalDate.now();
        blog.setCreateAt(localDate);
        blogService.addBlog(blog);
        redirectAttributes.addFlashAttribute("mess", "Create successfully");
        return "redirect:/";
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
        model.addAttribute("categories", categoryService.getList());
        return "/edit";
    }

    @PostMapping("/edit/{id}")
    public String editBlog(@PathVariable Long id, @ModelAttribute("blog") Blog blog, RedirectAttributes redirectAttributes) {
        blogService.updateBlog(id, blog);
        redirectAttributes.addFlashAttribute("mess", "Edit successfully");
        return "redirect:/";
    }
}
