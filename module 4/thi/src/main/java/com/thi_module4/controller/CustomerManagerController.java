package com.thi_module4.controller;

import com.thi_module4.entity.Product;
import com.thi_module4.entity.ProductType;
import com.thi_module4.repository.IProductTypeRepository;
import com.thi_module4.service.IProductService;
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

import java.util.List;
import java.util.Optional;

@Controller
public class CustomerManagerController {
    @Autowired
    private IProductService productService;

    @Autowired
    private IProductTypeRepository productTypeRepository;

    @ModelAttribute("listProductType")
    public List<ProductType> productTypes() {
        return productTypeRepository.findAll();
    }


    @GetMapping("/list")
    public ModelAndView show(Optional<String> search, Optional<Integer> price, Optional<Integer> productId,
                             @PageableDefault(size = 5) Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("/index");
        if (!search.isPresent()) {
            if (!price.isPresent()) {
                if (productId.isPresent()) {
                    modelAndView.addObject("productId", productId.get());
                    modelAndView.addObject("products", productService.findByProductTypeId(pageable, productId.get()));
                } else {
                    modelAndView.addObject("products", productService.findAll(pageable));
                }
            }else{
                modelAndView.addObject("products", productService.findByPrice(pageable, price.get()));
            }
        }else {
            modelAndView.addObject("products", productService.findAllByName(pageable, search.get()));
        }
        return modelAndView;
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("products", new Product());
        return "create";
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute("products") Product product, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "create";
        }
        productService.save(product);
        model.addAttribute("products", new Product());
        model.addAttribute("message", "Product created successfully");
        return "create";
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable int id) {
        Optional<Product> product = productService.findById(id);
        if (product.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("/delete");
            modelAndView.addObject("products",product.get());
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute("products") Product product) {
        productService.delete(product.getId());
        return "redirect:list";
    }
}
