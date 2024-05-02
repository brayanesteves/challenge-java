package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.numeric;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class BoxingUnBoxingExample {
    
    public List<Integer> boxed(int a, int b) {
        List<Integer> numbers;
        IntStream numberStream = IntStream.rangeClosed(a, b);
        numbers = numberStream.boxed().collect(Collectors.toList());
        return numbers;
    }
    
    public List<Integer> boxed_sum(int x, int y) {
        List<Integer> numbers;
        IntStream numberStream = IntStream.rangeClosed(x, y);
        numbers = numberStream.boxed().collect(Collectors.toList());
        Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);
        return numbers;
    }
    
}