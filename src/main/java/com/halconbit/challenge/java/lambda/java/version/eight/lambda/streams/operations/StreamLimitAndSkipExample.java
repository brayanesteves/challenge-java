package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitAndSkipExample {
    
    public void limit(int value) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List result = numbers.stream().limit(value).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
    
    public void skip(int value) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List result = numbers.stream().skip(value).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
    
}