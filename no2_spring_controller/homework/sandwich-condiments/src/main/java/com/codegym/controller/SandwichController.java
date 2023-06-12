package com.codegym.controller;

import com.codegym.service.SandwichService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SandwichController {
    private SandwichService sandwichService;

    public SandwichController(SandwichService sandwichService) {
        this.sandwichService = sandwichService;
    }

    @GetMapping("/") String showAllCondiments(Model model) {
        model.addAttribute("condiments", sandwichService.getAllCondiments());
        return "index";
    }

    @PostMapping("chosen-list") String showChosenCondiment(@RequestParam(name = "condiment", required = false) String[] condimentList, Model model) {
        model.addAttribute("condimentList", condimentList);
        return "result";
    }
}
