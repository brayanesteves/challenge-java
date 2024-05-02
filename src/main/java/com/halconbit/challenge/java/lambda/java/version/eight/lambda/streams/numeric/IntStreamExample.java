package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.numeric;

import java.util.Random;
import java.util.stream.IntStream;

public class IntStreamExample {
    
    public void using_of() {
        // Using of().
        IntStream numbers = IntStream.of(1, 2, 3, 4, 5);
        numbers.forEach(System.out::println);
    }
    
    public void using_iterate(int value) {
        // Using of().
        IntStream numbers = IntStream.iterate(0, i -> i + 2).limit(value);
        numbers.forEach(System.out::println);
    }
    
    public void using_generate(int value) {
        // Using of().
        IntStream numbers = IntStream.generate(new Random()::nextInt).limit(value);
        numbers.forEach(System.out::println);
    }
    
    public void using_range(int a, int b) {
        // Using of().
        IntStream numbers = IntStream.range(a, b);
        numbers.forEach(System.out::println);
    }
    
    public void using_rangeClosed(int a, int b) {
        // Using of().
        IntStream numbers = IntStream.rangeClosed(a, b);
        numbers.forEach(System.out::println);
    }
    
}