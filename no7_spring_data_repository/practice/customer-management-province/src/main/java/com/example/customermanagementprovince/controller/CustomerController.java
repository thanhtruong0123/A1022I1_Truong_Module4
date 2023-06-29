package com.example.customermanagementprovince.controller;

import com.example.customermanagementprovince.model.Customer;
import com.example.customermanagementprovince.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("/create-customer")
    public String showCreateForm(Model model) {
        model.addAttribute("customer", new Customer);
        return "/customer/create";
    }
}
