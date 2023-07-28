package school21.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping("/calculator")
    public String calculate(@RequestParam(value = "a", defaultValue = "0") double a,
                            @RequestParam(value = "b", defaultValue = "0") double b,
                            @RequestParam(value = "action", defaultValue = "") String action,
                            Model model) {

        switch (action) {
            case "multiplication" -> model.addAttribute("result", a * b);
            case "addition" -> model.addAttribute("result", a + b);
            case "subtraction" -> model.addAttribute("result", a - b);
            case "division" -> model.addAttribute("result", a / b);
        }

        return "calculator/calculator";
    }
}
