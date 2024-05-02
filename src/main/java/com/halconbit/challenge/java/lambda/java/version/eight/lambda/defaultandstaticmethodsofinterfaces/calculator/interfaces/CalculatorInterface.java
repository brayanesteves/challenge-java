package com.halconbit.challenge.java.lambda.java.version.eight.lambda.defaultandstaticmethodsofinterfaces.calculator.interfaces;

public interface CalculatorInterface {
    
    // Abstract sum method.
    public int sum(int a, int b);
    
    // Abstract division method.
    public int divide(int a, int b);
    
    // Default method which is subtract.
    default int subtract(int a, int b) {
        return a - b;
    }
    
    static int multiply(int a, int b) {
        return a * b;
    }
    
}