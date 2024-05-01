package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.operations;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.controller.InstructorController;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    
    public void returningInstructorSorted() {
        // Returning instructors sorted by their name and have more that 10 years of experience.
        List<Instructor> list = InstructorController.getAll().stream().filter(instructor -> instructor.getYearsOfExperience() > 10).sorted(Comparator.comparing(Instructor::getName)).collect(Collectors.toList());
        list.forEach(System.out::println);
    }
    
}