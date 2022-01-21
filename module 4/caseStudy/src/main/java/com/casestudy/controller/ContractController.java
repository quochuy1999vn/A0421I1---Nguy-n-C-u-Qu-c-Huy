package com.casestudy.controller;

import com.casestudy.entity.Contract;
import com.casestudy.entity.Contract_detail;
import com.casestudy.repository.IAttachServiceRepository;
import com.casestudy.repository.IContractDetailRepository;
import com.casestudy.service.IContractService;
import com.casestudy.service.ICustomerService;
import com.casestudy.service.IEmployeeService;
import com.casestudy.service.IdichVu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContractController {

    @Autowired
    private IContractService contractService;

    @Autowired
    private ICustomerService customerService;

    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private IdichVu idichVu;

    @Autowired
    private IContractDetailRepository contractDetailRepository;

    @Autowired
    private IAttachServiceRepository attachServiceRepository;

    @GetMapping("/contract")
    public String show() {
        return "contract/list";
    }

    @GetMapping("/create_contract")
    public String showCreateForm(Model model) {
        model.addAttribute("contracts", new Contract());
        model.addAttribute("customers", customerService.findAll());
        model.addAttribute("employees", employeeService.findAll());
        model.addAttribute("services", idichVu.findAll());
        return "contract/create";
    }

    @PostMapping("/create_contract")
    public String create(@ModelAttribute("contract") Contract contract, Model model) {
        contractService.save(contract);
        model.addAttribute("contracts", new Contract());
        model.addAttribute("message", "Contract created successfully");
        return "contract/create";
    }

    @GetMapping("/create_contract_detail")
    public String showCreateDetailForm(Model model) {
        model.addAttribute("contractDetails", new Contract_detail());
        model.addAttribute("contracts", contractService.findAll());
        model.addAttribute("attachServices", attachServiceRepository.findAll());
        return "contract/create_contractDetail";
    }

    @PostMapping("/create_contract_detail")
    public String createDetail(@ModelAttribute("contract") Contract_detail contract_detail, Model model) {
        contractDetailRepository.save(contract_detail);
        model.addAttribute("contractDetails", new Contract_detail());
        model.addAttribute("message", "Contract detail created successfully");
        return "contract/create_contractDetail";
    }
}
