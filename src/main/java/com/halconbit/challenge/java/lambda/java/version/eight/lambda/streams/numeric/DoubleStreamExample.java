package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.numeric;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class DoubleStreamExample {
    
    public void using_of() {
        // Using of().
        DoubleStream numbers = DoubleStream.of(1.2, 2.2, 3.3, 4.4, 5.5);
        numbers.forEach(System.out::println);
    }
    
    public void using_iterate(int value) {
        // Using of().
        DoubleStream numbers = DoubleStream.iterate(0, i -> i + 2.0).limit(value);
        numbers.forEach(System.out::println);
    }
    
    public void using_generate(int value) {
        // Using of().
        DoubleStream numbers = DoubleStream.generate(new Random()::nextDouble).limit(value);
        numbers.forEach(System.out::println);
    }
    
    public void using_range(long a, long b) {
        // Using of().
        DoubleStream numbers = LongStream.range(a, b).asDoubleStream();
        numbers.forEach(System.out::println);
    }
    
    public void using_rangeClosed(long a, long b) {
        // Using of().
        DoubleStream numbers = LongStream.rangeClosed(a, b).asDoubleStream();
        numbers.forEach(System.out::println);
    }
    
}