package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.collectorsoperations;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.controller.InstructorController;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;
import java.util.stream.Collectors;

public class CollectorSummingAveragingExample {
    
    public int summingInt() {
        // Sum of years of experience of all instructor.
        int summingInt = InstructorController.getAll().stream().collect(Collectors.summingInt(Instructor::getYearsOfExperience));
        return summingInt;
    }
    
    public double averagingInt() {
        // Calculate average of years of experience of all instructors.
        double averagingInt = InstructorController.getAll().stream().collect(Collectors.averagingInt(Instructor::getYearsOfExperience));
        return averagingInt;
    }
    
}