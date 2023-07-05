package com.example.rigisterformproject.controller;

import com.example.rigisterformproject.dto.UserDto;
import com.example.rigisterformproject.model.User;
import com.example.rigisterformproject.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String showListUser(Model model) {
        List<User> userList = userService.findAll();
        model.addAttribute("userList", userList);
        return "/list";
    }

    @GetMapping("/create")
    public String getForm(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "create";
    }

    @PostMapping("/create")
    public String saveNewUser(@Valid @ModelAttribute("userDto") UserDto userDto, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        new UserDto().validate(userDto, bindingResult);
        if (bindingResult.hasErrors()) {
            return "/create";
        }
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        userService.addNewUser(user);
        redirectAttributes.addFlashAttribute("mess", "Add new successfully");
        return "redirect:/";
    }
}
