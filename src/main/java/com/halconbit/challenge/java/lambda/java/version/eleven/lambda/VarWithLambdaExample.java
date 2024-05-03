package com.halconbit.challenge.java.lambda.java.version.eleven.lambda;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.controller.InstructorController;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class VarWithLambdaExample {
    
    public void listInstructors() {
        var instructors = InstructorController.getAll();
        Predicate<Instructor> experiencePredicate = (var s) -> s.getYearsOfExperience() > 10;
        instructors.forEach(instructor -> {
            if(experiencePredicate.test(instructor)) {
                var result = instructor.getName();
            }
        });
        
        BiFunction<Integer, Integer, Integer> sum = (var x, var y) -> x + y;
    }
    
}