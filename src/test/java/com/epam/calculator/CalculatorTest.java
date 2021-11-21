package com.epam.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddShouldSumWhenNumbersPositive() {
        Calculator calculator = new Calculator();

        double result = calculator.sumNumbers(5.33, 4.55);

        Assert.assertEquals(9.88, result, 0.1);
    }

    @Test
    public void testAddShouldSumWhenNumbersNegative() {
        Calculator calculator = new Calculator();

        double result = calculator.sumNumbers(-5.33, -4.55);

        Assert.assertEquals(-9.88, result, 0.1);
    }

    @Test
    public void testAddShouldSubtractWhenNumbersPositive() {
        Calculator calculator = new Calculator();

        double result = calculator.subtractNumbers(5.7, 4.4);

        Assert.assertEquals(1.3, result, 0.1);
    }

    @Test
    public void testAddShouldSubtractWhenNumbersNegative() {
        Calculator calculator = new Calculator();

        double result = calculator.subtractNumbers(-5.7, -4.4);

        Assert.assertEquals(-1.3, result, 0.1);
    }


    @Test
    public void testAddShouldMultiplyWhenNumbersPositive() {
        Calculator calculator = new Calculator();

        double result = calculator.multiplyNumbers(5.1, 4.3);

        Assert.assertEquals(21.93, result, 0.1);
    }

    @Test
    public void testAddShouldMultiplyWhenNumbersNegative() {
        Calculator calculator = new Calculator();

        double result = calculator.multiplyNumbers(-5.1, -4.3);

        Assert.assertEquals(21.93, result, 0.1);
    }

    @Test
    public void testAddShouldDivideWhenNumbersPositive() {
        Calculator calculator = new Calculator();

        double result = calculator.divideNumbers(7.5, 2);

        Assert.assertEquals(3.75, result, 0.01);
    }

    @Test
    public void testAddShouldDivideWhenNumbersNegative() {
        Calculator calculator = new Calculator();

        double result = calculator.divideNumbers(-5.5, -1.1);

        Assert.assertEquals(5, result, 0.1);
    }

    @Test
    public void testAddShouldNotDivideWhenZeroDivider() {
        Calculator calculator = new Calculator();

        double result = calculator.divideNumbers(5.89, 0);

        Assert.assertEquals(0, result, 0.1);
    }


}
