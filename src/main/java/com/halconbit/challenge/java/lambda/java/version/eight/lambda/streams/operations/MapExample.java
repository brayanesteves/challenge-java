package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.operations;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.controller.InstructorController;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapExample {
    
    public void returnOnlyInstructorNamesFromTheInstructorList() {
        // Return only instructor names from the instructor list.
        List<String> instructorNamesZeroList = InstructorController.getAll().stream().map(Instructor::getName).map(String::toUpperCase).collect(Collectors.toList());
        Set<String> instructorNamesZeroSet   = InstructorController.getAll().stream().map(Instructor::getName).map(String::toUpperCase).collect(Collectors.toSet());
    
        System.out.println(instructorNamesZeroList);
        System.out.println(instructorNamesZeroSet);
    }
    
}