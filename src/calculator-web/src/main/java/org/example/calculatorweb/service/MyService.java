package org.example.calculatorweb.service;

import org.example.calculatorengine.calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    private final org.example.calculatorengine.calculator calculator;

    public MyService(org.example.calculatorengine.calculator calculator) {
        this.calculator = calculator;
    }

    public double add(double input1, double input2) {
        return calculator.Add(input1, input2);
    }

    public double subtract(double input1, double input2) {
        return calculator.subtract(input1, input2);
    }

    public double multiply(double input1, double input2) {
        return calculator.multiplication(input1, input2);
    }

    public double divide(double input1, double input2) throws IllegalArgumentException {
        return calculator.divison(input1, input2);
    }

    public double equals(double input1, double input2) {
        return calculator.equals(input1, input2);
    }

    public double raiseToPower(double base, double power) {
        return calculator.raiseToPower(base, power);
    }

    public double logarithm(double input1, double input2) throws IllegalArgumentException {
        return calculator.logarithmOfNumber(input1, input2);
    }

    public double root(double input1, double input2) throws IllegalArgumentException {
        return calculator.rootOfPower(input1, input2);
    }

    public double factorial(double input1) {
        return calculator.factorialOfNumber(input1);
    }

    public double sine(double input1) {
        return calculator.sineA(input1);
    }

    public double cosine(double input1) {
        return calculator.cosineA(input1);
    }

    public double tangent(double input1) {
        return calculator.tangentA(input1);
    }

    public double reciprocal(double input1) throws IllegalArgumentException {
        return calculator.reciprocalOfA(input1);
    }
}

