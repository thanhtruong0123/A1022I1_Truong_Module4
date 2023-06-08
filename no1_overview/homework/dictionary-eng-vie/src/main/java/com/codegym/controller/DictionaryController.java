package com.codegym.controller;

import com.codegym.model.Dictionary;
import com.codegym.service.DictionaryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    private DictionaryService dictionaryService;

    public DictionaryController(DictionaryService dictionaryService) {
        this.dictionaryService = dictionaryService;
    }

    @GetMapping("/dictionary")
    public String getDictionary(Model model) {
        return "dictionary";
    }

    @PostMapping("/translate")
    public String translate(@RequestParam String type, @RequestParam String inputWord, Model model) {
        String result = null;
        if (type.equals("eng")) {
            result = dictionaryService.getDictionaryByEng(inputWord).getVieWord();
        } else if (type.equals("vie")) {
            result = dictionaryService.getDictionaryByVie(inputWord).getEngWord();
        }
        model.addAttribute("result", result);
        return "resultPage";
    }
}
