package com.codegym.controller;

import com.codegym.model.Config;
import com.codegym.service.ConfigService;
import com.codegym.service.ConfigServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/configuration")
public class ConfigController {
    private ConfigService configService = new ConfigServiceImpl();

    public ConfigController(ConfigService configService) {
        this.configService = configService;
    }

    @GetMapping("")
    public String showConfig(Model model) {
        model.addAttribute("initialConfig", configService.getConfig());
        model.addAttribute("message", "");
        return "/config";
    }

    @GetMapping("setting")
    public String updateConfig(Model model) {
        model.addAttribute("updateConfig", new Config());
        return "/setting";
    }

    @PostMapping("setting")
    public String saveConfig(@ModelAttribute Config updateConfig, Model model) {
        configService.updateConfig(updateConfig);
        model.addAttribute("initialConfig", updateConfig);
        model.addAttribute("message", "Add new successfully");
        return "/config";
    }
}
