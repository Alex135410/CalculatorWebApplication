package org.example.calculatorweb;

import org.example.calculatorweb.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "org.example")
@RestController
public class CalculatorWebApplication {

    private final MyService myService;

    public CalculatorWebApplication(MyService myService) {
        this.myService = myService;
    }

    public static void main(String[] args) {
        SpringApplication.run(CalculatorWebApplication.class, args);
    }

}
