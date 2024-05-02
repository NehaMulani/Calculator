package com.example.calculator.Controller;

import com.example.calculator.domain.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculatorController {
    @GetMapping("/index")
    public String ViewForm(Model model)
    {
        model.addAttribute("Calculator",new Calculator());
        return "index";
    }

    @PostMapping("/calculator")
    public String addForm(@ModelAttribute Calculator calculator, Model model)
    {
        model.addAttribute("calculator",calculator);
        return "calculate";
    }

}
