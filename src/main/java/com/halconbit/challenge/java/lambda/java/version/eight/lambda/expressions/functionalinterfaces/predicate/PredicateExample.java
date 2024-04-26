package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.predicate;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.controller.InstructorController;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;
import java.util.List;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
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
    
    // <OBJECT> //
    public void predicate_AllInstructorWhoTeachesOnline() {
        // All instructor who teaches online.
        Predicate<Instructor> predicateZero = (i) -> i.isOnlineCourses() == true;
        // Instructor experience is > 10 years.
        Predicate<Instructor> predicateOne  = (i) -> i.getYearsOfExperience() > 0;
        List<Instructor> instructors = InstructorController.getAll();
        instructors.forEach(instructor -> {
            if(predicateOne.test(instructor)) {
                System.out.println(instructor);
            }
        });        
    }
    
    public void predicate_IsInstructorTeachesOnlineAndExperienceIsGreatherThanTen() {
        // Is instructor teaches online and experience is > 10 years.
        Predicate<Instructor> predicateZero = (i) -> i.isOnlineCourses() == true;
        // Instructor experience is > 10 years.
        Predicate<Instructor> predicateOne  = (i) -> i.getYearsOfExperience() > 0;
        List<Instructor> instructors = InstructorController.getAll();
        instructors.forEach(instructor -> {
            if(predicateOne.and(predicateZero).test(instructor)) {
                System.out.println(instructor);
            }
        });        
    }
    // <.OBJECT> //
    
    public void intPredicate() {
        IntPredicate intPredicate = (i) -> i > 100;
        System.out.println(intPredicate.test(100));
    }
    
    public void longPredicate() {
        LongPredicate longPredicate = (i) -> i > 100L;
        System.out.println(longPredicate.test(11111111111111111L));
    }
    
    public void doublePredicate() {
        DoublePredicate doublePredicateZero = (i) -> i > 100.25;
        DoublePredicate doublePredicateOne  = (i) -> i > 100.10;
        System.out.println(doublePredicateZero.and(doublePredicateOne).test(100.15));
    }
    
}