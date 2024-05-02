package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.collectorsoperations;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.controller.InstructorController;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;
import java.util.LinkedHashMap;
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
    
    public Map<Integer, List<String>> groupingBy_filtering_ObjectInstructorClassified() {
        // Grouping by length of string and also checking that the names contains e
        // and only return those name which has e in it.
        List<String> name                 = List.of("Syed", "Mike", "Jenny", "Gene", "Rajeev");
        Map<Integer, List<String>> result = name.stream().collect(Collectors.groupingBy(String::length, Collectors.filtering(s -> s.contains("e"), Collectors.toList())));
        return result;
    }
    
    public Map<String, List<Instructor>> groupingBy_filtering_ObjectInstructorClassified_Filter() {
        // Instructor grouping them by 'Senior(>10)' and 'Junior(<10)' and filter them
        // on online courses.
        Map<String, List<Instructor>> instructorByExpAndOnline = InstructorController.getAll().stream().collect(Collectors.groupingBy(instructor -> instructor.getYearsOfExperience() > 10 ? "SENIOR" : "JUNIOR", Collectors.filtering(s -> s.isOnlineCourses(), Collectors.toList())));
        return instructorByExpAndOnline;
    }
    
    public LinkedHashMap<Integer, List<String>> groupingBy_filtering_ObjectInstructorClassified_LinkedHashMap() {
        // Grouping by length of string and also checking that the names contains e
        // and only return those name which has e in it.
        List<String> name                 = List.of("Syed", "Mike", "Jenny", "Gene", "Rajeev");
        LinkedHashMap<Integer, List<String>> result = name.stream().collect(Collectors.groupingBy(String::length, LinkedHashMap::new, Collectors.filtering(s -> s.contains("e"), Collectors.toList())));
        return result;
    }
    
    public LinkedHashMap<String, List<Instructor>> groupingBy_filtering_ObjectInstructorClassified_Filter_LinkedHashMap() {
        // Instructor grouping them by 'Senior(>10)' and 'Junior(<10)' and filter them
        // on online courses.
        LinkedHashMap<String, List<Instructor>> instructorByExpAndOnline = InstructorController.getAll().stream().collect(Collectors.groupingBy(instructor -> instructor.getYearsOfExperience() > 10 ? "SENIOR" : "JUNIOR", LinkedHashMap::new, Collectors.filtering(s -> s.isOnlineCourses(), Collectors.toList())));
        return instructorByExpAndOnline;
    }
    
}