package personalCalculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonalCalculatorController {

    @GetMapping("/form")
    public String showForm() {
        return "form";
    }

    @PostMapping("/result")
    public String calculation(int number1, int number2, String calculator, Model model) {
        int result = 0;

        switch (calculator) {
            case "addition(+)":
                result = number1 + number2;
                break;
            case "subtraction(-)":
                result = number1 - number2;
                break;
            case "multiplication(x)":
                result = number1 * number2;
                break;
            case "division(/)":
                result = number1 / number2;
                break;
        }
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        model.addAttribute("result", result);
        return "result";
    }
}
