package com.epam.calculator;

public class Calculator {

    public int sumNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtractNumbers(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiplyNumbers(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int divideNumbers(int dividend, int divider) {
        if (divider == 0) {
            return 0;
        }

        return dividend / divider;
    }


}
