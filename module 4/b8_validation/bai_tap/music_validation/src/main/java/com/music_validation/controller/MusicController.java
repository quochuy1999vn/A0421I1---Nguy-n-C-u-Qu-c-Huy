package com.music_validation.controller;

import com.music_validation.entity.Music;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MusicController {

    @GetMapping()
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("music", new Music());
        return modelAndView;
    }

    @PostMapping("/validateMusic")
    public String checkValidation(@Validated @ModelAttribute("music") Music music, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return "index";
        }
        return "result";
    }
}
