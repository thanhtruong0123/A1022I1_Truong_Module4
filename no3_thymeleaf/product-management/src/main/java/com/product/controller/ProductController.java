package com.product.controller;

import com.product.model.Product;
import com.product.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("")
    public ModelAndView displayProducts() {
        ModelAndView modelAndView = new ModelAndView("/list", "productList", productService.getList());
        return modelAndView;
    }

    @GetMapping("/add")
    public String addProduct(Model model) {
        model.addAttribute("product", new Product());
        return "/add";
    }

    @PostMapping("/add")
    public String addProduct(@ModelAttribute("product") Product product, Model model) {
        productService.addProduct(product);
        model.addAttribute("mess", "Add new successfully");
        return "/add";
    }

    @GetMapping("/detail/{id}")
    public String displayProduct(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.getProduct(id));
        return "/detail";
    }

    @GetMapping("/edit/{id}")
    public String updateProduct(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.getProduct(id));
        return "/edit";
    }

    @PostMapping("/edit/{id}")
    public String updateProduct(@ModelAttribute("product") Product product, @PathVariable int id, RedirectAttributes redirectAttributes) {
        productService.updateProduct(id, product);
        redirectAttributes.addFlashAttribute("mess", "Update successfully");
        return "redirect:/product";
    }
}
