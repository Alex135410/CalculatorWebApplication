package org.example.calculatorengine;

import org.springframework.stereotype.Service;

@Service
public class calculator {
    public double Add(double input1, double input2) {
        //preq-ENGINE-3
        double sum = input1 + input2;
        return sum;
    }

    public double subtract(double input1, double input2) {
        //preq-ENGINE-4
        double sum = input1 - input2;
        return sum;
    }

    public double multiplication(double input1, double input2) {
        //preq-ENGINE-5
        double sum = input1 * input2;
        return sum;
    }

    public double divison(double input1, double input2) {
        //preq-ENGINE-7
        if (input2 == 0) {
            throw new IllegalArgumentException("Number cannot be 0");
        }
        double sum = input1 / input2;
        return sum;
    }

    public double equals(double input1, double input2) {
        //preq-ENGINE-8
        double precision = 0.00000001;
        if (Math.abs(input1 - input2) < precision) {
            return 1;
        } else {
            return 0;
        }
    }

    public double raiseToPower(double base, double power) {
        //preq-ENGINE-9
        double sum = Math.pow(base, power);
        return sum;
    }

    public double logarithmOfNumber(double input1, double input2) {
        //preq-ENGINE-10
        if (input1 <= 0) {
            throw new IllegalArgumentException("Number must be greater than 0");
        }
        if (input2 == 0) {
            throw new IllegalArgumentException("Number cannot be 0");
        }
        double sum = Math.log(input1) / Math.log(input2);
        return sum;
    }

    public double rootOfPower(double input1, double input2) {
        //preq-ENGINE-11
        if (input1 <= 0) {
            throw new IllegalArgumentException("Number must be greater than 0");
        }
        if (input2 == 0) {
            throw new IllegalArgumentException("Number cannot be 0");
        }
        return Math.pow(input1, 1.0 / input2);
    }

    public double factorialOfNumber(double input1) {
        //preq-ENGINE-12
        if (input1 == 0) {
            return 1.0;
        }
        double i, sum = 1;
        for (i = 1; i <= input1; i++) {
            sum = i * sum;
        }
        return sum;
    }

    public double sineA(double input1) {
        //preq-ENGINE-13
        double conversion = Math.toRadians(input1);
        double sum = Math.sin(conversion);
        return sum;
    }

    public double cosineA(double input1) {
        //preq-ENGINE-14
        double conversion = Math.toRadians(input1);
        double sum = Math.cos(input1);
        return sum;
    }

    public double tangentA(double input1) {
        //preq-ENGINE-15
        double conversion = Math.toRadians(input1);
        double sum = Math.cos(input1);
        return sum;
    }

    public double reciprocalOfA(double input1) {
        //preq-ENGINE-16
        if (input1 == 0) {
            throw new IllegalArgumentException("Number cannot be 0");
        }
        return 1.0 / input1;
    }
}
