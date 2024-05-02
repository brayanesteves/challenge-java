package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinExample {
    
    public void minUsingStreamMinFunction_ComparatorTo() {
        // Min using stream min function.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Optional result = numbers.stream().min(Integer::compareTo);
        if(result.isPresent()) {
            System.out.println(result);
        }
    }
    
    public void minUsingStreamMinFunction_ReduceTernarioZero() {
        // Min using stream min function.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        // 1) (0, 1) - 0 |
        // 2) (0, 2) - 0 |
        // 3) (0, 3) - 0 |
        int result = numbers.stream().reduce(0, (a, b) -> a < b ? a : b);
    }
    
    public void minUsingStreamMinFunction_OptionalReduceTernarioZero() {
        // Min using stream min function.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Optional result = numbers.stream().reduce((a, b) -> a < b ? a : b);
        if(result.isPresent()) {
            System.out.println(result);
        }
    }
    
    public void minUsingStreamMinFunction_OptionalReduceTernarioOne() {
        // Min using stream min function.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        // 1) (0, 1) - 1 | return 0
        // 2) (1, 2) - 2 |
        // 3) (2, 3) - 3 |
        Optional result = numbers.stream().reduce(Integer::min);   
        if(result.isPresent()) {
            System.out.println(result);
        }
    }
    
}