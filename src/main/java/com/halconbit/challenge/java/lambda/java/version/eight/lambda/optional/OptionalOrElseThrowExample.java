package com.halconbit.challenge.java.lambda.java.version.eight.lambda.optional;

import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OptionalOrElseThrowExample {
    
    public int orElse(Integer[] numbersList, int position) {
        Integer[] numbers = new Integer[10];
        numbers = numbersList;
        Optional<Integer> number = Optional.ofNullable(numbers[position]);
        int result = number.orElse(-1);
        return result;
    }
    
    public int orElseGet(Integer[] numbersList, int position) {
        Integer[] numbers = new Integer[10];
        numbers = numbersList;
        Optional<Integer> number = Optional.ofNullable(numbers[position]);
        int result = number.orElseGet(() -> -1);
        return result;
    }
    
    public int orElseThrow(Integer[] numbersList, int position) {
        int result = 0;
        try {
            Integer[] numbers = new Integer[10];
            numbers = numbersList;
            Optional<Integer> number = Optional.ofNullable(numbers[position]);
            result = number.orElseThrow(Exception::new);
            
        } catch (Exception ex) {
            Logger.getLogger(OptionalOrElseThrowExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
}