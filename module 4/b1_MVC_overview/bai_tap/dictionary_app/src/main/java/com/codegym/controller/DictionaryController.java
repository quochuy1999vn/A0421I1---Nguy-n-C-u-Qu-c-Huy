package com.codegym.controller;

import com.codegym.model.bean.Dictionary;
import com.codegym.model.service.DictionaryService;
import com.codegym.model.service.Impl.DictionaryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DictionaryController {

    DictionaryService dictionaryService = new DictionaryServiceImpl();

    @GetMapping("/form")
    public String showForm() {
        return "form";
    }

    @PostMapping("/result")
    public String dictionary(@RequestParam String key, Model model) {
        List<Dictionary> dictionaryList = dictionaryService.findAll();
        for (int i = 0; i < dictionaryList.size(); i++) {
            if (key.equalsIgnoreCase(dictionaryList.get(i).getEng())) {
                model.addAttribute("word", dictionaryList.get(i).getViet());
                model.addAttribute("key", key);
            }
        }
        return "result";
    }
}
