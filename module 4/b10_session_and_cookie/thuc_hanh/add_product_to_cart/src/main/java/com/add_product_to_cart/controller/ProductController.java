package com.add_product_to_cart.controller;

import com.add_product_to_cart.entity.Cart;
import com.add_product_to_cart.entity.Product;
import com.add_product_to_cart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Optional;

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

//    @GetMapping("/add/{id}")
//    public String addToCart(@PathVariable Long id, @ModelAttribute Cart cart, @RequestParam("action") String action) {
//        Optional<Product> optionalProduct = productService.findById(id);
//        if (!optionalProduct.isPresent()) {
//            return "/error.404";
//        }
//        if (action.equals("show")) {
//            cart.addProduct(optionalProduct.get());
//            return "redirect:/shopping-cart";
//        }
//        cart.addProduct(optionalProduct.get());
//        return "redirect:/shop";
//    }
}
