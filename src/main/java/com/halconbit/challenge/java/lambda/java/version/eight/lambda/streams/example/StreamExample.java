package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.example;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.controller.InstructorController;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
    
    public void creatingMapOfNamesAndCourseOfInstructorsWhoTeaches() {
        // Creating a map of names and course of instructors who teaches
        // online have more than 10 years of experience.
        Predicate<Instructor> predicateZero = (i) -> i.isOnlineCourses();
        Predicate<Instructor> predicateOne  = (i) -> i.getYearsOfExperience() > 10;
        
        List<Instructor> list         = InstructorController.getAll();
        Map<String, List<String>> map = list.stream().filter(predicateZero).filter(predicateOne).collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));
    
        System.out.println(map);
    }
    
    public void creatingMapOfNamesAndCourseOfInstructorsWhoTeaches_InsideStream() {
        // Creating a map of names and course of instructors who teaches
        // online have more than 10 years of experience.
        Predicate<Instructor> predicateZero = (i) -> i.isOnlineCourses();
        Predicate<Instructor> predicateOne  = (i) -> i.getYearsOfExperience() > 10;
        
        List<Instructor> list         = InstructorController.getAll();
        list.stream().filter(predicateZero).filter(predicateOne);
        Map<String, List<String>> map = list.stream().filter(predicateZero).filter(predicateOne).collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));
    
        System.out.println(map);
    }
    
}