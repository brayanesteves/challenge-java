package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.operations;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.controller.InstructorController;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;

public class StreamMapFilterReduce {
    
    public void totalYearsOfExperienceBWInstructors_Sum() {
        // Total years of experience b/w instructors.
        int result = InstructorController.getAll().stream().filter(Instructor::isOnlineCourses).map(Instructor::getYearsOfExperience).reduce(0, (a, b) -> a + b);
        System.out.println(result);
    }
    
    public void totalYearsOfExperienceBWInstructors_SumAndInteger() {
        // Total years of experience b/w instructors.
        int result = InstructorController.getAll().stream().filter(Instructor::isOnlineCourses).map(Instructor::getYearsOfExperience).reduce(0, Integer::sum);
        System.out.println(result);
    }
    
}