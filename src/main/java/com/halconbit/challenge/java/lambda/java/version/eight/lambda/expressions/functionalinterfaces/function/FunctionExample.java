package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.function;

import java.util.function.Function;

public class FunctionExample {
    
    public void squareRoot(int value) {
        Function<Integer, Double> sqrt = n -> Math.sqrt(n);
        System.out.println("Square root of " + value + ":" + sqrt.apply(value));
    }
    
    public void toLowerCase(String value) {
        Function<String, String> lowerCaseFunction = (s) -> s.toLowerCase();
        System.out.println(value + " = " + lowerCaseFunction.apply(value));
    }
    
    public void concatenate(String value, String text) {
        Function<String, String> concatFunction = (s) -> s.concat(text);
        System.out.println(concatFunction.apply(value));
    }
    
    public void toLowerCaseAndConcatenate(String value, String text) {
        Function<String, String> lowerCaseFunction = (s) -> s.toLowerCase();
        Function<String, String> concatFunction = (s) -> s.concat(text);
        System.out.println(lowerCaseFunction.andThen(concatFunction).apply(value));
    }
    
    public void toLowerCaseAndConcatenateWithCompose(String value, String text) {
        Function<String, String> lowerCaseFunction = (s) -> s.toLowerCase();
        Function<String, String> concatFunction = (s) -> s.concat(text);
        System.out.println(lowerCaseFunction.compose(concatFunction).apply(value));
    }
    
}