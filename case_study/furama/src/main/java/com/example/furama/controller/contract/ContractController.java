package com.example.furama.controller.contract;

import com.example.furama.model.contract.Contract;
import com.example.furama.model.contract.ContractDetail;
import com.example.furama.service.contract.itf.IAttachServiceService;
import com.example.furama.service.contract.itf.IContractDetailService;
import com.example.furama.service.contract.itf.IContractService;
import com.example.furama.service.customer.itf.ICustomerService;
import com.example.furama.service.employee.itf.IEmployeeService;
import com.example.furama.service.services.itf.IServiceService;
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
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private IContractService contractService;
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private IEmployeeService employeeService;
    @Autowired
    private IServiceService serviceService;
    @Autowired
    private IContractDetailService contractDetailService;
    @Autowired
    private IAttachServiceService attachServiceService;


    @GetMapping("/create")
    public String createContract(Model model) {
        model.addAttribute("contract", new Contract());
        model.addAttribute("customer", customerService.findAll());
        model.addAttribute("employee", employeeService.findAll());
        model.addAttribute("service", serviceService.findAll());
        return "/contract/create";
    }

    @PostMapping("/create")
    public String createContract(@ModelAttribute("contract") Contract contract,
                                 RedirectAttributes redirectAttributes) {
        contractService.createContract(contract);
        redirectAttributes.addFlashAttribute("mess", "Create contract successfully!");
        return "redirect:/";
    }

    @GetMapping("/contract-detail")
    public String getHomePage(@RequestParam(defaultValue = "0") int page,
                              @RequestParam(defaultValue = "") String name,
                              Model model) {
        int pageSize = 3;
        Pageable pageable = PageRequest.of(page, pageSize);
        Page<ContractDetail> contractDetailPage = contractDetailService.getPage(pageable, name);

        //object
        model.addAttribute("contractDetailPage", contractDetailPage);

        //search name
        model.addAttribute("name", name);

        //pagination
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPage", contractDetailPage.getTotalPages());
        return "/contract/contract_detail/list";
    }

    @GetMapping("/contract-detail/create")
    public String createContractDetail(Model model) {
        model.addAttribute("contractDetail", new ContractDetail());
        model.addAttribute("attachServices", attachServiceService.findAll());
        model.addAttribute("contracts", contractService.findAll());
        return "create";
    }

    @PostMapping("/contract-detail/create")
    public String createContractDetai(@ModelAttribute("contractDetail") ContractDetail contractDetail,
                                      RedirectAttributes redirectAttributes) {
        contractDetailService.createNew(contractDetail);
        redirectAttributes.addFlashAttribute("mess", "Create contract detail successfully!");
        return "redirect:/contract/contract-detail";
    }

    @PostMapping("/contract-detail/remove")
    public String removeContractDetail(@RequestParam("selectedContractDetailIds") List<Long> selectedContractDetailIds,
                                       RedirectAttributes redirectAttributes) {
        contractDetailService.deleteAllById(selectedContractDetailIds);
        redirectAttributes.addFlashAttribute("mess", "Delete contract detail successfully!");
        return "redirect:/contract/contract-detail";
    }

    @GetMapping("/contract-detail/update/{id}")
    public String updateContractDetail(@PathVariable("id") Long id, Model model) {
        model.addAttribute("contractDetail", contractDetailService.findById(id));
        model.addAttribute("attachServices", attachServiceService.findAll());
        model.addAttribute("contracts", contractService.findAll());
        return "/contract/contract_detail/update";
    }

    @PostMapping("/contract-detail/update/{id}")
    public String updateContractDetail(@ModelAttribute("contractDetail") ContractDetail contractDetail,
                                       RedirectAttributes redirectAttributes) {
        contractDetailService.updateOne(contractDetail);
        redirectAttributes.addFlashAttribute("mess", "Update contract detail successfully!");
        return "redirect:/contract/contract-detail";
    }
}
