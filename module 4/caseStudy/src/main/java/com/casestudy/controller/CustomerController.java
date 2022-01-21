package com.casestudy.controller;

import com.casestudy.entity.Customer;
import com.casestudy.repository.ICustomerTypeRepository;
import com.casestudy.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @Autowired
    private ICustomerTypeRepository customerTypeRepository;

//    @GetMapping("/customer")
//    public String listCustomer(Model model) {
//        model.addAttribute("customers", customerService.findAll());
//        return "/customer/list_customer";
//    }

    @GetMapping("/customer")
    public ModelAndView list(Optional<String> search, @PageableDefault(size = 3) Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("/customer/list_customer");
        //Nếu search không có giá trị, tức là người dùng không nhập vào.
        if (!search.isPresent()) {
            modelAndView.addObject("customers", customerService.findAll(pageable));
        }else {
            //Ô name có giá trị
            modelAndView.addObject("customers", customerService.findAllByName(pageable, search.get()));
        }
        return modelAndView;
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("customerTypes", customerTypeRepository.findAll());
        model.addAttribute("customers", new Customer());
        return "customer/create_customer";
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute("customers") Customer customer, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "customer/create_customer";
        }
        customerService.save(customer);
        model.addAttribute("customers", new Customer());
        model.addAttribute("message", "Customer created successfully");
        return "customer/create_customer";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable String id, Model model) {
        Optional<Customer> customerOptional = customerService.findById(id);
        if (customerOptional.isPresent()) {
            model.addAttribute("customers", customerOptional.get());
            return "customer/edit";
        }else {
            return "error.404";
        }
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("customer") Customer customer, Model model) {
        customerService.save(customer);
        model.addAttribute("customers", customer);
        model.addAttribute("message", "Customer updated successfully");
        return "customer/edit";
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable String id) {
        Optional<Customer> customerOptional = customerService.findById(id);
        if (customerOptional.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("/customer/delete");
            modelAndView.addObject("customers", customerOptional.get());
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute("blog") Customer customer) {
        customerService.remove(customer.getCustomer_id());
        return "redirect:customer";
    }
}
