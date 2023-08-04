package com.example.furama.controller.service;

import com.example.furama.model.service.ServiceModel;
import com.example.furama.model.service.ServiceType;
import com.example.furama.service.services.itf.IRentTypeService;
import com.example.furama.service.services.itf.IServiceService;
import com.example.furama.service.services.itf.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    private IServiceService serviceService;
    @Autowired
    private IServiceTypeService serviceTypeService;
    @Autowired
    private IRentTypeService rentTypeService;

    @GetMapping("/create/villa")
    public String createVilla(Model model) {
        ServiceModel serviceModel = new ServiceModel();
        serviceModel.setServiceType(serviceTypeService.findById(1L));

        model.addAttribute("serviceModel", serviceModel);
        model.addAttribute("rentTypeList", rentTypeService.findAll());
        return "/services/createVilla";
    }

    @PostMapping("/create/villa")
    public String createVilla(@ModelAttribute("serviceModel") ServiceModel serviceModel,
                              RedirectAttributes redirectAttributes) {
        serviceService.createService(serviceModel);
        return "redirect:/";
    }

    @GetMapping("/create/house")
    public String createHouse(Model model) {
        ServiceModel serviceModel = new ServiceModel();
        serviceModel.setServiceType(serviceTypeService.findById(2L));

        model.addAttribute("serviceModel", serviceModel);
        model.addAttribute("rentTypeList", rentTypeService.findAll());
        return "/services/createHouse";
    }

    @PostMapping("/create/house")
    public String createHouse(@ModelAttribute("serviceModel") ServiceModel serviceModel,
                              RedirectAttributes redirectAttributes) {
        serviceService.createService(serviceModel);
        return "redirect:/";
    }

    @GetMapping("/create/room")
    public String createRoom(Model model) {
        ServiceModel serviceModel = new ServiceModel();
        serviceModel.setServiceType(serviceTypeService.findById(3L));

        model.addAttribute("serviceModel", serviceModel);
        model.addAttribute("rentTypeList", rentTypeService.findAll());
        return "/services/createRoom";
    }

    @PostMapping("/create/room")
    public String createRoom(@ModelAttribute("serviceModel") ServiceModel serviceModel,
                              RedirectAttributes redirectAttributes) {
        serviceService.createService(serviceModel);
        return "redirect:/";
    }
}
