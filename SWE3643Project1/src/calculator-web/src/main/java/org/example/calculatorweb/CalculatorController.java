package org.example.calculatorweb;

import org.example.calculatorweb.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @Autowired
    private final MyService myService;

    public CalculatorController(MyService myService) {
        this.myService = myService;
    }

    @PostMapping("/add")
    public String add(@RequestParam("inputA") double inputA,
                      @RequestParam("inputB") double inputB,
                      Model model) {
        try {
            double result = myService.add(inputA, inputB);
            model.addAttribute("operation", inputA + " + " + inputB);
            model.addAttribute("result", result);
            return "index"; // Your view template name (e.g., index.html)
        } catch (NumberFormatException e) {
            // Handle invalid input, e.g., return an error message
            return "Invalid input. Please enter only numbers.";
        }
    }
}


