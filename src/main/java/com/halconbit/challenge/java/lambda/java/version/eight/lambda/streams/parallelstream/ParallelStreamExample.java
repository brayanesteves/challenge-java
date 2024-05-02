package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.parallelstream;

import java.util.stream.IntStream;

public class ParallelStreamExample {
    
    public int sumSequentialStream(int a, int b) {
        return IntStream.rangeClosed(a, b).sum();
    }
    
    public int sumParallelStream(int a, int b) {
        return IntStream.rangeClosed(a, b).parallel().sum();
    }
    
}