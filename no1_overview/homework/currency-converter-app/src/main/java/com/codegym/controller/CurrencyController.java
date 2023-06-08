package com.codegym.controller;

import com.codegym.model.Currency;
import com.codegym.service.CurrencyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CurrencyController {
    CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping("/currencies")
    public String getCurrencies(Model model) {
        List<Currency> currencies = currencyService.getAllCurrencies();
        model.addAttribute("currencies", currencies);
        return "currencies";
    }

    @PostMapping("/convert")
    public String convertCurrency(@RequestParam double amount, @RequestParam String fromCurrencyUnit,
                                  @RequestParam String toCurrencyUnit, Model model) {
        double convertedAmount = currencyService.convertedCurrency(amount, fromCurrencyUnit, toCurrencyUnit);
        model.addAttribute("amount", amount);
        model.addAttribute("fromCurrencyUnit", fromCurrencyUnit);
        model.addAttribute("toCurrencyUnit", toCurrencyUnit);
        model.addAttribute("convertedAmount", convertedAmount);
        return "result";
    }
}
