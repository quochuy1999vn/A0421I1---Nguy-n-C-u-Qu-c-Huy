package com.casestudy.controller;

import com.casestudy.entity.DichVu;
import com.casestudy.repository.RentTypeRepository;
import com.casestudy.repository.ServiceTypeRepository;
import com.casestudy.service.IdichVu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ServiceController {

    @Autowired
    private IdichVu idichVu;

    @Autowired
    private ServiceTypeRepository serviceTypeRepository;

    @Autowired
    private RentTypeRepository rentTypeRepository;

    @GetMapping("/service")
    public String show(){
        return "newService/list";
    }

    @GetMapping("/create_service")
    public String showFormCreate(Model model) {
        model.addAttribute("services", new DichVu());
        return "newService/create_service";
    }

    @PostMapping("/create_service")
    public String create(@Validated @ModelAttribute("services") DichVu service, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "newService/create_service";
        }
        idichVu.save(service);
        model.addAttribute("services", new DichVu());
        model.addAttribute("serviceTypes", serviceTypeRepository.findAll());
        model.addAttribute("rentTypes", rentTypeRepository.findAll());
        model.addAttribute("message", "Service created successfully");
        return "newService/create_service";
    }
}

