package com.complete_shopping_cart.controller;

import com.complete_shopping_cart.entity.Cart;
import com.complete_shopping_cart.entity.Product;
import com.complete_shopping_cart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private IProductService productService;

    @ModelAttribute("cart")
    public HashMap<Long, Cart> setupCart() {
        return new HashMap<>();
    }

    @GetMapping("/shop")
    public ModelAndView showShop() {
        ModelAndView modelAndView = new ModelAndView("/shop");
        modelAndView.addObject("products", productService.findAll());
        return modelAndView;
    }

    @GetMapping("create")
    public String showFormCreate(@ModelAttribute("cart") HashMap<Long, Cart> hashMap, Model model) {
        System.out.println(hashMap.keySet());
        model.addAttribute("products", new Product());
        return "create";
    }

    @PostMapping("create")
    public String saveProduct(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        productService.save(product);
        redirectAttributes.addAttribute("message", "New product created successfully");
        return "redirect:/shop";
    }
}
