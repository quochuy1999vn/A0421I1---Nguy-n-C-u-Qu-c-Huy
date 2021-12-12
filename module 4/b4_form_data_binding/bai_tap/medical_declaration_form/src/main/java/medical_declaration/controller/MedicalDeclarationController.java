package medical_declaration.controller;

import medical_declaration.model.MedicalDeclaration;
import medical_declaration.service.IMedicalDeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MedicalDeclarationController {

    @Autowired
    IMedicalDeclarationService medicalDeclarationService;

    @GetMapping("")
    public String showForm(Model model) {
//        List<String> gender = new ArrayList<>();
//        gender.add("nam");
//        gender.add("nu");
////        ModelAndView modelAndView = new ModelAndView("/create");
//        model.addAttribute("gender", gender);
        model.addAttribute("medicalDeclaration", new MedicalDeclaration());
        return "/create";
    }

    @PostMapping("/save")
    public String display(MedicalDeclaration medicalDeclaration) {
        medicalDeclarationService.save(medicalDeclaration);
        return "index";
    }
}
