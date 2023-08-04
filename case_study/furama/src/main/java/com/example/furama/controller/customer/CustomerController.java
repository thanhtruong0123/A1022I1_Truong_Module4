package com.example.furama.controller.customer;

import com.example.furama.model.customer.Customer;
import com.example.furama.service.customer.itf.ICustomerService;
import com.example.furama.service.customer.itf.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private ICustomerTypeService customerTypeService;

    @GetMapping("")
    public String showPage(@RequestParam(defaultValue = "0") int page,
                            @RequestParam(defaultValue = "") String name,
                            Model model) {
        int pageSize = 3;
        Pageable pageable = PageRequest.of(page, pageSize);
        Page<Customer> customerPage = customerService.searchByName(pageable, name);

        // object
        model.addAttribute("customerPage", customerPage);

        // search
        model.addAttribute("name", name);

        // pagination
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPage", customerPage.getTotalPages());
        return "/customer/list";
    }

    @GetMapping("/create")
    public String createNew(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("customerTypeList", customerTypeService.findAll());
        return "/customer/create";
    }

    @PostMapping("/create")
    public String createNew(@ModelAttribute("customer") Customer customer, RedirectAttributes redirectAttributes) {
        customerService.addNew(customer);
        redirectAttributes.addFlashAttribute("mess", "Create customer successfully");
        return "redirect:/customer";
    }

    @PostMapping("/remove")
    public String removeCustomer(@RequestParam("selectedCustomerIds") List<Long> selectedCustomerIds,
                                 RedirectAttributes redirectAttributes) {
        customerService.deleteAllByIds(selectedCustomerIds);
        redirectAttributes.addFlashAttribute("mess", "Remove customer successfully");
        return "redirect:/customer";
    }

    @GetMapping("/update/{id}")
    public String updateCustomer(@PathVariable("id") Long id, Model model) {
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        model.addAttribute("customerTypeList", customerTypeService.findAll());
        return "/customer/update";
    }

    @PostMapping("/update/{id}")
    public String updateCustomer(@ModelAttribute("customer") Customer customer,
                                 RedirectAttributes redirectAttributes) {
        customerService.updateCustomer(customer);
        redirectAttributes.addFlashAttribute("mess", "Update customer successfully");
        return "redirect:/customer";
    }
}
