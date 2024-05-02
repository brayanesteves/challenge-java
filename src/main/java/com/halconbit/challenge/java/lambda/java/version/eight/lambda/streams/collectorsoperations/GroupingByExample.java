package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.collectorsoperations;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.controller.InstructorController;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
    
    public Map<Integer, List<String>> groupingBy() {
        // Group list of name by their length.
        List<String> names                = List.of("Syed", "Mike", "Jenny", "Gene", "Rajeev");
        Map<Integer, List<String>> result = names.stream().collect(Collectors.groupingBy(String::length));
        return result;
    }
    
    public Map<String, List<Instructor>> groupingBy_ObjectInstructor() {
        // Grouping by instructors by their gender.
        Map<String, List<Instructor>> instructorByGender = InstructorController.getAll().stream().collect(Collectors.groupingBy(Instructor::getGender));
        return instructorByGender;
    }
    
    public Map<String, List<Instructor>> groupingBy_ObjectInstructorClassified() {
        // Grouping by experience where > 10 years of experience is classified
        // as 'Senior' and others are 'Junior'.
        Map<String, List<Instructor>> instructorByGender = InstructorController.getAll().stream().collect(Collectors.groupingBy(instructor -> instructor.getYearsOfExperience() > 10 ? "SENIOR" : "JUNIOR"));
        return instructorByGender;
    }
    
}