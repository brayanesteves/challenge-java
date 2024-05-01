package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.operations;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.controller.InstructorController;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {
    
    public void returningAllInstructorsSortedByTheirName() {
        // Returning all instructors sorted by their name.
        List<Instructor> list = InstructorController.getAll().stream().sorted(Comparator.comparing(Instructor::getName)).collect(Collectors.toList());
        list.forEach(System.out::println);
    }
    
    public void returningAllInstructorsSortedByTheirName_Reversed() {
        // Returning all instructors sorted by their name.
        List<Instructor> list = InstructorController.getAll().stream().sorted(Comparator.comparing(Instructor::getName).reversed()).collect(Collectors.toList());
        list.forEach(System.out::println);
    }
    
}