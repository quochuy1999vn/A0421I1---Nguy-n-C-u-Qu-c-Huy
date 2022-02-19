package com.promotion.controller;

import com.promotion.entity.Promotion;
import com.promotion.service.IPromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PromotionController {

    @Autowired
    private IPromotionService promotionService;

    @GetMapping()
    public String showList(Model model) {
        model.addAttribute("promotions", promotionService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("promotions", new Promotion());
        return "create";
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute("promotions") Promotion promotion,  BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "/create";
        }
        model.addAttribute("promotions", new Promotion());
        model.addAttribute("message", "Promotion created successfully");
        return "/create";
    }


}
