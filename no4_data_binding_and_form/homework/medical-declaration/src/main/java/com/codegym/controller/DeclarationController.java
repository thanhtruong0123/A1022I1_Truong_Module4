package com.codegym.controller;

import com.codegym.model.Declaration;
import com.codegym.service.DeclarationService;
import com.codegym.service.DeclarationServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/medical-declaration")
public class DeclarationController {
    private DeclarationService declarationService;

    public DeclarationController(DeclarationService declarationService) {
        this.declarationService = declarationService;
    }

    @GetMapping("")
    public String getForm(Model model) {
        model.addAttribute("declarationForm", new Declaration());
        return "form";
    }

    @PostMapping("result")
    public String getResult(@ModelAttribute("declarationForm") Declaration declaration) {
        return "result";
    }
}
