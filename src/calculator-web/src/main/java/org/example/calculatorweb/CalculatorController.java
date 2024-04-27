package org.example.calculatorweb;

import org.example.calculatorweb.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;

@Controller
public class CalculatorController {

    @Autowired
    private MyService myService;

    @GetMapping("/calculator")
    public String getCalculator(Model model) {
        model.addAttribute("defaultMessage", "Enter value(s) below and select an operation.");
        return "calculator"; // Name of your calculator view template
    }

    @PostMapping("/calculate/add")
    public String add(@RequestParam("input1") double input1,
                      @RequestParam("input2") double input2,
                      Model model) {
        try {
            double result = myService.add(input1, input2);
            model.addAttribute("displayData", Collections.singletonMap("operation", "add"));
            model.addAttribute("displayData", Collections.singletonMap("result", result));
        } catch (IllegalArgumentException e) {
            // Handle any exceptions from the service layer (e.g., invalid input)
            model.addAttribute("error", e.getMessage());
        }
        return "calculator"; // Name of your calculator view template
    }



    @PostMapping("/calculate/subtract")
    public String subtract(@RequestParam("input1") double input1,
                           @RequestParam("input2") double input2,
                           Model model) {
        try {
            double result = myService.subtract(input1, input2);
            model.addAttribute("displayData", Collections.singletonMap("operation", "subtract"));
            model.addAttribute("displayData", Collections.singletonMap("result", result));
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
        }
        return "calculator"; // Name of your calculator view template
    }

    @PostMapping("/calculate/multiply")
    public String multiply(@RequestParam("input1") double input1,
                           @RequestParam("input2") double input2,
                           Model model) {
        try {
            double result = myService.multiply(input1, input2);
            model.addAttribute("displayData", Collections.singletonMap("operation", "multiply"));
            model.addAttribute("displayData", Collections.singletonMap("result", result));
        } catch (IllegalArgumentException e) {
            // Handle any exceptions from the service layer (e.g., invalid input)
            model.addAttribute("error", e.getMessage());
        }
        return "calculator"; // Name of your calculator view template
    }

    @PostMapping("/calculate/divide")
    public String divide(@RequestParam("input1") double input1,
                         @RequestParam("input2") double input2,
                         Model model) {
        try {
            double result = myService.divide(input1, input2);
            model.addAttribute("displayData", Collections.singletonMap("operation", "divide"));
            model.addAttribute("displayData", Collections.singletonMap("result", result));
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
        }
        return "calculator"; // Name of your calculator view template
    }

    @PostMapping("/calculate/equals")
    public String equals(@RequestParam("input1") double input1,
                         @RequestParam("input2") double input2,
                         Model model) {
        try {
            double result = myService.equals(input1, input2);
            model.addAttribute("displayData", Collections.singletonMap("operation", "equals"));
            model.addAttribute("displayData", Collections.singletonMap("result", result));
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
        }
        return "calculator"; // Name of your calculator view template
    }

    @PostMapping("/calculate/raiseToPower")
    public String raiseToPower(@RequestParam("input1") double base,
                               @RequestParam("input2") double power,
                               Model model) {
        try {
            double result = myService.raiseToPower(base, power);
            model.addAttribute("displayData", Collections.singletonMap("operation", "raiseToPower"));
            model.addAttribute("displayData", Collections.singletonMap("result", result));
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
        }
        return "calculator"; // Name of your calculator view template
    }

    @PostMapping("/calculate/logarithm")
    public String logarithm(@RequestParam("input1") double input1,
                            @RequestParam("input2") double input2,
                            Model model) {
        try {
            double result = myService.logarithm(input1, input2);
            model.addAttribute("displayData", Collections.singletonMap("operation", "logarithm"));
            model.addAttribute("displayData", Collections.singletonMap("result", result));
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
        }
        return "calculator"; // Name of your calculator view template
    }

    @PostMapping("/calculate/root")
    public String root(@RequestParam("input1") double base,
                       @RequestParam("input2") double power,
                       Model model) {
        try {
            double result = myService.root(base, power);
            model.addAttribute("displayData", Collections.singletonMap("operation", "root"));
            model.addAttribute("displayData", Collections.singletonMap("result", result));
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
        }
        return "calculator"; // Name of your calculator view template
    }

    @PostMapping("/calculate/factorial")
    public String factorial(@RequestParam("input1") double input1,
                            Model model) {
        try {
            double result = myService.factorial(input1);
            model.addAttribute("displayData", Collections.singletonMap("operation", "factorial"));
            model.addAttribute("displayData", Collections.singletonMap("result", result));
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
        }
        return "calculator"; // Name of your calculator view template
    }

    @PostMapping("/calculate/sine")
    public String sine(@RequestParam("input1") double angle,
                       Model model) {
        try {
            double result = myService.sine(angle);
            model.addAttribute("displayData", Collections.singletonMap("operation", "sine"));
            model.addAttribute("displayData", Collections.singletonMap("result", result));
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
        }
        return "calculator"; // Name of your calculator view template
    }

    @PostMapping("/calculate/cosine")
    public String cosine(@RequestParam("input1") double angle,
                         Model model) {
        try {
            double result = myService.cosine(angle);
            model.addAttribute("displayData", Collections.singletonMap("operation", "cosine"));
            model.addAttribute("displayData", Collections.singletonMap("result", result));
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
        }
        return "calculator"; // Name of your calculator view template
    }

    @PostMapping("/calculate/tangent")
    public String tangent(@RequestParam("input1") double angle,
                          Model model) {
        try {
            double result = myService.tangent(angle);
            model.addAttribute("displayData", Collections.singletonMap("operation", "tangent"));
            model.addAttribute("displayData", Collections.singletonMap("result", result));
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
        }
        return "calculator"; // Name of your calculator view template
    }

    @PostMapping("/calculate/reciprocal")
    public String reciprocal(@RequestParam("input1") double input1,
                             Model model) {
        try {
            double result = myService.reciprocal(input1);
            model.addAttribute("displayData", Collections.singletonMap("operation", "reciprocal"));
            model.addAttribute("displayData", Collections.singletonMap("result", result));
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
        }
        return "calculator"; // Name of your calculator view template
    }
}