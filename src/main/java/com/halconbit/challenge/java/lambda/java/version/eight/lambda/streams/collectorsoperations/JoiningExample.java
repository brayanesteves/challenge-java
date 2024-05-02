package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.collectorsoperations;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.controller.InstructorController;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {
    
    public String joiningZero() {
        String result = Stream.of("E", "F", "G", "H").collect(Collectors.joining());
        return result;
    }
    
    public String joiningOne() {
        String result = Stream.of("E", "F", "G", "H").collect(Collectors.joining(","));
        return result;
    }
    
    public String joiningTwo() {
        String result = Stream.of("E", "F", "G", "H").collect(Collectors.joining(",", "{", "}"));
        return result;
    }
    
    public String joiningThree_ObjectInstructors() {
        String result = InstructorController.getAll().stream().map(Instructor::getName).collect(Collectors.joining(",", "{", "}"));
        return result;
    }
    
}