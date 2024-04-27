package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.function;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.controller.InstructorController;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample {
    
    public void squareRoot(int value) {
        Function<Integer, Double> sqrt = n -> Math.sqrt(n);
        System.out.println("Square root of " + value + ":" + sqrt.apply(value));
    }
    
    public void toLowerCase(String value) {
        Function<String, String> lowerCaseFunction = (s) -> s.toLowerCase();
        System.out.println(value + " = " + lowerCaseFunction.apply(value));
    }
    
    public void concatenate(String value, String text) {
        Function<String, String> concatFunction = (s) -> s.concat(text);
        System.out.println(concatFunction.apply(value));
    }
    
    public void toLowerCaseAndConcatenate(String value, String text) {
        Function<String, String> lowerCaseFunction = (s) -> s.toLowerCase();
        Function<String, String> concatFunction = (s) -> s.concat(text);
        System.out.println(lowerCaseFunction.andThen(concatFunction).apply(value));
    }
    
    public void toLowerCaseAndConcatenateWithCompose(String value, String text) {
        Function<String, String> lowerCaseFunction = (s) -> s.toLowerCase();
        Function<String, String> concatFunction = (s) -> s.concat(text);
        System.out.println(lowerCaseFunction.compose(concatFunction).apply(value));
    }
    
    // <OBJECT> //
    public void mapOfInstructorsWithNameAndYearsOfExperience() {
        // Map of instructors with name and years of experience.
        // Function with will 'List<Instructors>' and return a 'Map<String, Integer>'.
        Function<List<Instructor>, Map<String, Integer>> mapFunction = (instructors -> {
            Map<String, Integer> map = new HashMap<>();
            instructors.forEach(instructor -> {
                map.put(instructor.getName(), instructor.getYearsOfExperience());
            });
            return map;
        });
        System.out.println(mapFunction.apply(InstructorController.getAll()));
    }
    
    public void mapOfInstructorsWithNameAndYearsOfExperiencePredicate() {
        // Map of instructors with name and years of experience.
        // Function with will 'List<Instructors>' and return a 'Map<String, Integer>'.
        // Predicate will return 'true' if instructor has online courses.
        Predicate<Instructor> predicateZero = (i) -> i.isOnlineCourses() == true;
        Function<List<Instructor>, Map<String, Integer>> mapFunction = (instructors -> {
            Map<String, Integer> map = new HashMap<>();
            instructors.forEach(instructor -> {
                if(predicateZero.test(instructor)) {
                    map.put(instructor.getName(), instructor.getYearsOfExperience());
                }                
            });
            return map;
        });
        System.out.println(mapFunction.apply(InstructorController.getAll()));
    }
    // <.OBJECT> //
    
    // <BIFUNCTION> //
    public void biFunction_TwoInputs() {
        // BiFunction 2 inputs 'List<Instructors>' and second is predicate wich will filter id instructor has online
        // courses and return a map of '<String, Integer>' string is name and 'Integer' is the years of experience.
        Predicate<Instructor> predicateZero = (i) -> i.isOnlineCourses() == true;
        BiFunction<List<Instructor>, Predicate<Instructor>, Map<String, Integer>> mapBiFunction = ((instructors, instructorPredicate) -> {
            Map<String, Integer> map = new HashMap<>();
            instructors.forEach(instructor -> {
                if(instructorPredicate.test(instructor)) {
                    map.put(instructor.getName(), instructor.getYearsOfExperience());
                }
            });
            return map;            
        });
        System.out.println(mapBiFunction.apply(InstructorController.getAll(), predicateZero));
    }
    // <.BIFUNCTION> //
    
}