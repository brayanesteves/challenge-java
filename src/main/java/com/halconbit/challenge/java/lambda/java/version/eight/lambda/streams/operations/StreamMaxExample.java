package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxExample {
    
    public void maxUsingStreamMaxFunction_ComparatorTo() {
        // Max using stream max function.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Optional result = numbers.stream().max(Integer::compareTo);
        if(result.isPresent()) {
            System.out.println(result);
        }
    }
    
    public void maxUsingStreamMaxFunction_ReduceTernarioZero() {
        // Max using stream max function.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        // 1) (0, 1) - 1 | return 0
        // 2) (1, 2) - 2 |
        // 3) (2, 3) - 3 |
        int result = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
    }
    
    public void maxUsingStreamMaxFunction_OptionalReduceTernarioZero() {
        // Max using stream max function.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Optional result = numbers.stream().reduce((a, b) -> a > b ? a : b);
        if(result.isPresent()) {
            System.out.println(result);
        }
    }
    
    public void maxUsingStreamMaxFunction_OptionalReduceTernarioOne() {
        // Max using stream max function.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        // 1) (0, 1) - 1 | return 0
        // 2) (1, 2) - 2 |
        // 3) (2, 3) - 3 |
        Optional result = numbers.stream().reduce(Integer::sum);   
        if(result.isPresent()) {
            System.out.println(result);
        }
    }
    
}