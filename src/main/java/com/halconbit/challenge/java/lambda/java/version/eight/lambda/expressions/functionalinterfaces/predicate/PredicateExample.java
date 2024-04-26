package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.predicate;

import java.util.function.Predicate;

public class PredicateExample {
    
    public void predicate_ReturnTrueOrFalse() {
        // If number is > 10 return 'true' other 'false'.
        Predicate<Integer> predicate = (i) -> i > 10;
        System.out.println(predicate.test(100));
    }
    
    public void predicate_NumberGreatherTenAndNumberIsEvenNumber() {
        // i > 10 && Number is even number (i % 2 == 0)
        Predicate<Integer> predicateZero = (i) -> i > 10;
        Predicate<Integer> predicateOne  = (i) -> i % 2 == 0;
        System.out.println(predicateOne.and(predicateZero).test(20));
    }
    
    public void predicate_NumberGreatherTenOrNumberIsEvenNumber() {
        // i > 10 || Number is even number (i % 2 == 0)
        Predicate<Integer> predicateZero = (i) -> i > 10;
        Predicate<Integer> predicateOne  = (i) -> i % 2 == 0;
        System.out.println(predicateZero.or(predicateOne).test(4));
    }
    
    public void predicate_GreatherThanTenAndNotEqualZero() {
        // i > 10 && i != 0
        Predicate<Integer> predicateZero = (i) -> i > 10;
        Predicate<Integer> predicateOne  = (i) -> i % 2 == 0;
        System.out.println(predicateZero.and(predicateOne.negate()).test(33));
    }
    
}