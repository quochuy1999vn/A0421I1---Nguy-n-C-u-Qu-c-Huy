package com.complete_shopping_cart.controller;

import com.complete_shopping_cart.entity.Cart;
import com.complete_shopping_cart.entity.Product;
import com.complete_shopping_cart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ShoppingCartController {

    @Autowired
    private IProductService productService;


    @GetMapping("add/{id}")
    public String addProductToCart(@PathVariable Long id, @SessionAttribute("cart")HashMap<Long, Cart> hashMap, Model model) {
        Product product = productService.findById(id);

        if (product != null) {
            //TH chưa có sản phẩm trong giỏ hàng
            Cart item = new Cart();
            item.setProduct(product);
            item.setQuantity(1);
            hashMap.put(id, item);
        }else {
            //TH sản phẩm đã có trong giỏ hàng
            Cart item = hashMap.get(id);
            item.setQuantity(item.getQuantity() + 1);
            hashMap.put(id, item);
        }
        model.addAttribute("cart", hashMap);
        model.addAttribute("cartNum", hashMap.size());
        model.addAttribute("cartMoney", totalPrice(hashMap));
        return "/cart";
    }

    public double totalPrice(HashMap<Long, Cart> hashMap) {
        int count = 0;
        for (Map.Entry<Long, Cart> entry : hashMap.entrySet()) {
            count += Double.parseDouble(String.valueOf(entry.getValue().getProduct().getPrice() * entry.getValue().getQuantity()));
        }
        return count;
    }
}
