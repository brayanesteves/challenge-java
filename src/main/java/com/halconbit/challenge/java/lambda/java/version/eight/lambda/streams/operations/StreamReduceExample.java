package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.operations;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.controller.InstructorController;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    
    public void reduceSingle_Sum() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // 1) 0[identy] + 1 =  1 | 5) 10[identy] + 5 = 15 | 9) 36[identy] + 9 = 45
        // 2) 1[identy] + 2 =  3 | 6) 15[identy] + 6 = 21 |
        // 3) 3[identy] + 3 =  6 | 7) 21[identy] + 7 = 28 |
        // 4) 6[identy] + 4 = 10 | 8) 28[identy] + 8 = 36 |
        int results = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(results);
    }
    
    public void reduceSingle_Multiply() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // 1) 1[identy] * 1 =  1 | 5) 0[identy] * 1 = 0 |
        // 2) 1[identy] * 2 =  2 | 6) 0[identy] * 2 = 0 |        
        int results = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(results);
    }
    
    public void reduceSingle_SumWithOptional() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional results = numbers.stream().reduce((a, b) -> a + b);
        System.out.println(results);
    }
    
    public void reduceSingle_SumWithOptionalAndGet() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional results = numbers.stream().reduce((a, b) -> a + b);
        // Exception in thread "main" java.util.NoSuchElementException: No value present
        System.out.println(results.get());
    }
    
    public void reduceSingle_SumWithOptionalAndGetAndConditional() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional results = numbers.stream().reduce((a, b) -> a + b);
        // Exception in thread "main" java.util.NoSuchElementException: No value present
        if(results.isPresent()) {
            System.out.println(results.get());            
        }
        
    }
    
    public void reduce_PrintingTheInstructor() {
        // Printing the instructor who has the highest years of experience.
        Optional instructor = InstructorController.getAll().stream().reduce((s1, s2) -> {
            if(s1.getYearsOfExperience() > s2.getYearsOfExperience()) {
                return s1;
            } else {
                return s2;
            }
        });
        if(instructor.isPresent()) {
            System.out.println(instructor.get());            
        }
    }
    
    public void reduce_PrintingTheInstructorOperatorTernario() {
        // Printing the instructor who has the highest years of experience.
        Optional instructor = InstructorController.getAll().stream().reduce((s1, s2) -> s1.getYearsOfExperience() > s2.getYearsOfExperience() ? s2 : s1);
        if(instructor.isPresent()) {
            System.out.println(instructor.get());            
        }
    }
    
}