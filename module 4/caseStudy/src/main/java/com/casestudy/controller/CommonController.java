package com.casestudy.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {
    @GetMapping
    public String show() {
        return "index";
    }

    @GetMapping("/index")
    public String showIndex() {
        return "index";
    }

    @GetMapping("/admin/index")
    public String admin() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/deny")
    public String deny() {
        return "deny";
    }

    @GetMapping("/logoutSuccess")
    public String logout() {
        return "logout";
    }

//    @GetMapping("/customer/list")
//    public String listCustomer() {
//        return "/customer/list_customer";
//    }


}
