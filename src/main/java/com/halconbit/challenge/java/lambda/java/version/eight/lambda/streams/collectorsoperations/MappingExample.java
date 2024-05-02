package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.collectorsoperations;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.controller.InstructorController;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MappingExample {
    
    public List<String> map() {
        List<String> namesList = InstructorController.getAll().stream().map(Instructor::getName).collect(Collectors.toList());
        return namesList;
    }
    
    public List<String> mapping() {
        // Collectors.mapping().
        List<String> namesList = InstructorController.getAll().stream().collect(Collectors.mapping(Instructor::getName, Collectors.toList()));
        return namesList;
    }
    
    public Map<Integer, List<String>> groupingBy() {
        // Collectors.mapping().
        Map<Integer, List<String>> mapYearsOfExperienceAndNames = InstructorController.getAll().stream().collect(Collectors.groupingBy(Instructor::getYearsOfExperience, Collectors.mapping(Instructor::getName, Collectors.toList())));
        return mapYearsOfExperienceAndNames;
    }
    
}