package com.epam.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddShouldSumWhenNumbersPositive() {
        Calculator calculator = new Calculator();

        int result = calculator.sumNumbers(5, 4);

        Assert.assertEquals(9, result);
    }

    @Test
    public void testAddShouldSumWhenNumbersNegative() {
        Calculator calculator = new Calculator();

        int result = calculator.sumNumbers(-5, -4);

        Assert.assertEquals(-9, result);
    }

    @Test
    public void testAddShouldSubtractWhenNumbersPositive() {
        Calculator calculator = new Calculator();

        int result = calculator.subtractNumbers(5, 4);

        Assert.assertEquals(1, result);
    }

    @Test
    public void testAddShouldSubtractWhenNumbersNegative() {
        Calculator calculator = new Calculator();

        int result = calculator.subtractNumbers(-5, -4);

        Assert.assertEquals(-1, result);
    }


    @Test
    public void testAddShouldMultiplyWhenNumbersPositive() {
        Calculator calculator = new Calculator();

        int result = calculator.multiplyNumbers(5, 4);

        Assert.assertEquals(20, result);
    }

    @Test
    public void testAddShouldMultiplyWhenNumbersNegative() {
        Calculator calculator = new Calculator();

        int result = calculator.multiplyNumbers(-5, -4);

        Assert.assertEquals(20, result);
    }

    @Test
    public void testAddShouldDivideWhenNumbersPositive(){
        Calculator calculator = new Calculator();

        int result = calculator.divideNumbers(5, 4);

        Assert.assertEquals(1, result);
    }

    @Test
    public void testAddShouldDivideWhenNumbersNegative(){
        Calculator calculator = new Calculator();

        int result = calculator.divideNumbers(-5, -4);

        Assert.assertEquals(1, result);
    }

    @Test
    public void testAddShouldNotDivideWhenZeroDivider(){
        Calculator calculator = new Calculator();

        int result = calculator.divideNumbers(5, 0);

        Assert.assertEquals(0, result);
    }



}
