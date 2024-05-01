package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.operations;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.controller.InstructorController;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapExample {
    
    public void getListOfAllTheCoursesWhichInstructorsOffers() {
        // Get a list of all the courses which instructors offers.
        List<String> instructorsCoursesZeroList = InstructorController.getAll().stream().map(Instructor::getCourses).flatMap(List::stream).collect(Collectors.toList());
        Set<String>  instructorsCoursesZeroSet  = InstructorController.getAll().stream().map(Instructor::getCourses).flatMap(List::stream).collect(Collectors.toSet());
        
        System.out.println("With 'List<>'");
        System.out.println(instructorsCoursesZeroList);
        System.out.println("With 'Set<>'");
        System.out.println(instructorsCoursesZeroSet);
    }
    
}