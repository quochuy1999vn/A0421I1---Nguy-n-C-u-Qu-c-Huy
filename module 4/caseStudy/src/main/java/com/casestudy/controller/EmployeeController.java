package com.casestudy.controller;

import com.casestudy.entity.Employee;
import com.casestudy.repository.IDivisionRepository;
import com.casestudy.repository.IEducationDegreeRepository;
import com.casestudy.repository.IPositionRepository;
import com.casestudy.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private IPositionRepository positionRepository;

    @Autowired
    private IEducationDegreeRepository educationDegreeRepository;

    @Autowired
    private IDivisionRepository divisionRepository;

    @GetMapping("/employee")
    public String list(Model model) {
        model.addAttribute("employees", employeeService.findAll());
        return "employee/list";
    }

    @GetMapping("/create_employee")
    public String showFormCreate(Model model) {
        model.addAttribute("employees", new Employee());
        model.addAttribute("divisions",divisionRepository.findAll());
        model.addAttribute("positions",positionRepository.findAll());
        model.addAttribute("educations",educationDegreeRepository.findAll());
        return "employee/create";
    }

    @PostMapping("/create_employee")
    public String create(@Validated @ModelAttribute("employees") Employee employee, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "employee/create";
        }
        employeeService.save(employee);
        model.addAttribute("employees", new Employee());
        model.addAttribute("message", "Employee created successfully");
        return "employee/create";
    }

    @GetMapping("/edit_employee/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        Optional<Employee> employee = employeeService.findById(id);
        if (employee.isPresent()) {
            model.addAttribute("employees", employee.get());
            return "employee/edit";
        }else {
            return "error.404";
        }
    }

    @PostMapping("/edit_employee")
    public String edit(@ModelAttribute("employee") Employee employee, Model model) {
        employeeService.save(employee);
        model.addAttribute("employees", employee);
        model.addAttribute("message", "Employee updated successfully");
        return "employee/edit";
    }

    @GetMapping("/delete_employee/{id}")
    public ModelAndView showDeleteForm(@PathVariable int id) {
        Optional<Employee> employee = employeeService.findById(id);
        if (employee.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("/employee/delete");
            modelAndView.addObject("employees", employee.get());
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete_employee")
    public String delete(@ModelAttribute("blog") Employee employee) {
        employeeService.remove(employee.getEmployee_id());
        return "redirect:employee";
    }

}
