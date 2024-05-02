package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.generators;

import java.util.Random;
import java.util.stream.Stream;

public class StreamFactoryMethodExample {
    
    public void of() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
        stream.forEach(System.out::println);
    }
    
    public void iterate() {
        Stream<Integer> stream = Stream.iterate(0, i -> i + 2);
        stream.forEach(System.out::println);
    }
    
    public void iterateAndLimit(int value) {
        Stream<Integer> stream = Stream.iterate(0, i -> i + 2).limit(value);
        stream.forEach(System.out::println);
    }
    
    public void generate(int value) {
        Stream<Integer> stream = Stream.generate(new Random()::nextInt).limit(value);
        stream.forEach(System.out::println);
    }
    
}