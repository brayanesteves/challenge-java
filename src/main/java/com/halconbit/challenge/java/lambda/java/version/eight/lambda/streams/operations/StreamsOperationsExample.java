package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.operations;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.controller.InstructorController;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsOperationsExample {
    
    public void count() {
        Long count = InstructorController.getAll().stream().map(Instructor::getCourses).flatMap(List::stream).count();
        System.out.println(count);
    }
    
    public void countDistinct() {
        Long countDistinct = InstructorController.getAll().stream().map(Instructor::getCourses).flatMap(List::stream).distinct().count();
        System.out.println(countDistinct);
    }
    
    public void distinct() {
        List<String> distinct = InstructorController.getAll().stream().map(Instructor::getCourses).flatMap(List::stream).distinct().collect(Collectors.toList());
        System.out.println(distinct);
    }
    
    public void distinctSorted() {
        List<String> distinctSorted = InstructorController.getAll().stream().map(Instructor::getCourses).flatMap(List::stream).distinct().sorted().collect(Collectors.toList());
        System.out.println(distinctSorted);
    }
    
    public void anyMatch() {
        boolean anyMatch = InstructorController.getAll().stream().map(Instructor::getCourses).flatMap(List::stream).anyMatch(s -> s.startsWith("J"));
        System.out.println(anyMatch);
    }
    
    public void allMatch() {
        boolean allMatch = InstructorController.getAll().stream().map(Instructor::getCourses).flatMap(List::stream).allMatch(s -> s.startsWith("J"));
        System.out.println(allMatch);
    }
    
    public void noneMatch() {
        boolean noneMatch = InstructorController.getAll().stream().map(Instructor::getCourses).flatMap(List::stream).noneMatch(s -> s.startsWith("J"));
        System.out.println(noneMatch);
    }
    
}