package com.library.controller;

import com.library.service.IBookService;
import com.library.service.ICodeService;
import com.library.service.IStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    @Autowired
    private IBookService bookService;

    @Autowired
    private ICodeService codeService;

    @Autowired
    private IStatusService statusService;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "book/home";
    }
}
