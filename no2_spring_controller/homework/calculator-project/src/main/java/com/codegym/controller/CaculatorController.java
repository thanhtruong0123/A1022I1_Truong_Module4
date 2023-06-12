package com.codegym.controller;

import com.codegym.service.CaculatorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    private CaculatorService caculatorService;

    public CaculatorController(CaculatorService caculatorService) {
        this.caculatorService = caculatorService;
    }

    @GetMapping("/") String showCaculator() {
        return "index";
    }

    @PostMapping("/caculate") String doAddition(@RequestParam String operator, @RequestParam double operand1, @RequestParam double operand2, Model model) {
        double result = 0;
        switch (operator) {
            case "addition":
                result = caculatorService.doAddiction(operand1, operand2);
                break;
            case "subtraction":
                result = caculatorService.doSubtraction(operand1, operand2);
                break;
            case "multiplication":
                result = caculatorService.doMultiplication(operand1, operand2);
                break;
            case "division":
                result = caculatorService.doDivision(operand1, operand2);
                break;
        }
        model.addAttribute("message", "Result is: " + result);
        return "index";
    }
}
