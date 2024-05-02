package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.numeric;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateFunctions {
    
    public int sum(int a, int b) {
        int sum = IntStream.rangeClosed(a, b).sum();
        return sum;
    }
    
    public int min(int a, int b) {
        OptionalInt min = IntStream.rangeClosed(a, b).min();
        return min.isPresent() ? min.getAsInt() : 0;
    }
    
    public int max(int a, int b) {
        OptionalInt max = IntStream.rangeClosed(a, b).max();
        return max.isPresent() ? max.getAsInt() : 0;
    }
    
    public Double average(int a, int b) {
        OptionalDouble average = LongStream.rangeClosed(a, b).asDoubleStream().average();        
        return average.isPresent() ? average.getAsDouble() : 0.0;
    }
    
}