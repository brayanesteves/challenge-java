package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.optional;

import java.util.Optional;

public class OptionalExample {
    
    public int traditional() {
        Integer[] numbers = new Integer[10];
        int number        = numbers[1].intValue();
        return number;
    }
    
    public int checkBullInt() {
        Integer[] numbers              = new Integer[10];
        Optional<Integer> checkNullInt = Optional.ofNullable(numbers[1]);
        int result = checkNullInt.isPresent() ? checkNullInt.get() : -1;
        return -1;
    }
    
}