package com.example.furama.controller.employee;

import com.example.furama.model.employee.Employee;
import com.example.furama.service.employee.itf.IDivisionService;
import com.example.furama.service.employee.itf.IEducationDegreeService;
import com.example.furama.service.employee.itf.IEmployeeService;
import com.example.furama.service.employee.itf.IPositionService;
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
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;
    @Autowired
    private IEducationDegreeService educationDegreeService;
    @Autowired
    private IDivisionService divisionService;
    @Autowired
    private IPositionService positionService;

    @GetMapping("")
    public String showPage(@RequestParam(defaultValue = "0") int page,
                          @RequestParam(defaultValue = "") String name,
                          Model model) {
        int pageSize = 3;
        Pageable pageable = PageRequest.of(page, pageSize);
        Page<Employee> employeePage = employeeService.searchByName(pageable, name);

        //  object
        model.addAttribute("employeePage", employeePage);

        //  search
        model.addAttribute("name", name);

        //  pagination
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPage", employeePage.getTotalPages());
        return "/employee/list";
    }

    @GetMapping("/create")
    public String createEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        model.addAttribute("educationDegrees", educationDegreeService.findAll());
        model.addAttribute("divisions", divisionService.findAll());
        model.addAttribute("positions", positionService.findAll());
        return "/employee/create";
    }

    @PostMapping("/create")
    public String createEmployee(@ModelAttribute("employee") Employee employee,
                                 RedirectAttributes redirectAttributes) {
        employeeService.createEmployee(employee);
        redirectAttributes.addFlashAttribute("mess", "Create employees successfully!");
        return "redirect:/employee";
    }

    @PostMapping("/remove")
    public String removeEmployee(@RequestParam("selectedEmployeeIds") List<Long> selectedEmployeeIds,
                                 RedirectAttributes redirectAttributes) {
        employeeService.deleteAllByIds(selectedEmployeeIds);
        redirectAttributes.addFlashAttribute("mess", "Delete employees successfully!");
        return "redirect:/employee";
    }

    @GetMapping("/update/{id}")
    public String updateEmployee(@PathVariable("id") Long id, Model model) {
        model.addAttribute("employee", employeeService.findById(id));
        model.addAttribute("educationDegrees", educationDegreeService.findAll());
        model.addAttribute("divisions", divisionService.findAll());
        model.addAttribute("positions", positionService.findAll());
        return "/employee/update";
    }

    @PostMapping("/update/{id}")
    public String updateEmployee(@ModelAttribute("employee") Employee employee,
                                 RedirectAttributes redirectAttributes) {
        employeeService.updateEmployee(employee);
        redirectAttributes.addFlashAttribute("mess", "Update employees successfully!");
        return "redirect:/employee";
    }
}
