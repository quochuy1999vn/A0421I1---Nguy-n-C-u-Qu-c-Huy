package configuring_email.controller;

import configuring_email.model.ConfiguringEmail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ConfiguringEmailController {
    List<String> spamFilters = new ArrayList<>();

    @GetMapping("/update")
    public String update(Model model) {
        model.addAttribute("email", new ConfiguringEmail());
        model.addAttribute("spamFilters", spamFilters);
        return "update";
    }
    @PostMapping("/result")
    public String result(@RequestParam("language") String language, @RequestParam("pageSize") String pageSize, String spamFilters, Model model, ConfiguringEmail email) {
        model.addAttribute("language", language);
        model.addAttribute("pageSize", pageSize);
        model.addAttribute("spamFilters", spamFilters);
        model.addAttribute("email", email);

        return "result";
    }
}
