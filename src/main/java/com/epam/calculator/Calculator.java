package com.epam.calculator;

public class Calculator {

    public double sumNumbers(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public double subtractNumbers(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public double multiplyNumbers(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divideNumbers(double dividend, double divider) {
        if (divider == 0) {
            return 0;
        }

        return dividend / divider;
    }

}
