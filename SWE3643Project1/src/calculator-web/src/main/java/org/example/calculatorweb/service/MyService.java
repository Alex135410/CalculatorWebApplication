package org.example.calculatorweb.service;

import org.springframework.stereotype.Service;
import org.example.calculatorengine.calculator;

@Service
public class MyService {

    private final calculator calculator;

    public MyService(calculator calculator) {
        this.calculator = calculator;
    }

    public double add(double input1, double input2) {
        return calculator.Add(input1, input2);
    }

}

