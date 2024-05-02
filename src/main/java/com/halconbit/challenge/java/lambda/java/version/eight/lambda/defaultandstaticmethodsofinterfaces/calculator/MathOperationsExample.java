package com.halconbit.challenge.java.lambda.java.version.eight.lambda.defaultandstaticmethodsofinterfaces.calculator;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.defaultandstaticmethodsofinterfaces.calculator.interfaces.CalculatorInterface;

public class MathOperationsExample implements CalculatorInterface {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }    
    
    
}