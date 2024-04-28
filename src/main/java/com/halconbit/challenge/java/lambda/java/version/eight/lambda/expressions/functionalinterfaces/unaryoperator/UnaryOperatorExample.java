package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.unaryoperator;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    
    public void multiply(int value) {
        UnaryOperator<Integer> unary = i -> i * 10;
        System.out.println(unary.apply(value));
    }
    
    public void intUnaryOperator(int value) {
        IntUnaryOperator intUnaryOperator = i -> i * 10;
        System.out.println(intUnaryOperator.applyAsInt(value));
    }
    
    public void longUnaryOperator(Long value) {
        LongUnaryOperator longUnaryOperator = i -> i * 10;
        System.out.println(longUnaryOperator.applyAsLong(value));
    }
    
    public void doubleUnaryOperator(Double value) {
        DoubleUnaryOperator doubleUnaryOperator = i -> i * 10;
        System.out.println(doubleUnaryOperator.applyAsDouble(value));
    }
    
}