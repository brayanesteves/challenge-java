package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.numeric;

import java.util.Random;
import java.util.stream.LongStream;

public class LongStreamExample {
    
    public void using_of() {
        // Using of().
        LongStream numbers = LongStream.of(1, 2, 3, 4, 5);
        numbers.forEach(System.out::println);
    }
    
    public void using_iterate(int value) {
        // Using of().
        LongStream numbers = LongStream.iterate(0, i -> i + 2).limit(value);
        numbers.forEach(System.out::println);
    }
    
    public void using_generate(int value) {
        // Using of().
        LongStream numbers = LongStream.generate(new Random()::nextLong).limit(value);
        numbers.forEach(System.out::println);
    }
    
    public void using_range(int a, int b) {
        // Using of().
        LongStream numbers = LongStream.range(a, b);
        numbers.forEach(System.out::println);
    }
    
    public void using_rangeClosed(int a, int b) {
        // Using of().
        LongStream numbers = LongStream.rangeClosed(a, b);
        numbers.forEach(System.out::println);
    }
    
}