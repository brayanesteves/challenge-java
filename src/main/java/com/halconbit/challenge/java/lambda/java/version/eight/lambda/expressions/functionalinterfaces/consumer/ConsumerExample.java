package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
    public void consumerString() {
        Consumer<String> consumer = (x) -> System.out.println(x.length() + " the value of 'x': " + x);
        consumer.accept("Up in the air");
    }
    
    // Consumer with block statement.
    public void consumerInteger() {
        Consumer<Integer> consumer = (x) -> {
            System.out.println("x*x = " + x*x);
            System.out.println("x/x = " + x/x);
        };
        consumer.accept(10);
    }
}