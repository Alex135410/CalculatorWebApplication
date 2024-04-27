package org.example.calculatorweb.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorConfig {

    @Bean
    public org.example.calculatorengine.calculator getCalculator() {
        return new org.example.calculatorengine.calculator(); // Replace with your actual implementation if needed
    }
}
