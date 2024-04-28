package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.methodreference;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.controller.InstructorController;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {
    
    public void methodReference_Predicate() {
        Predicate<Instructor> predicate = Instructor::isOnlineCourses;
    }
    
    public void methodReference_Function_IntegerDouble() {
        Function<Integer, Double> functionSqrt = Math::sqrt;
    }
    
    public void methodReference_Function_StringString() {
        Function<String, String> functionToLowerCase = String::toLowerCase;
    }
    
    // <METHOD REFERENCE> //
    private static boolean greatherThanTenYearsOfExperience(Instructor instructor) {
        if(instructor.getYearsOfExperience() > 10) {
            return true;
        }
        return false;
    }
    
    public void convertToMethodReferenceExample() {
        Predicate<Instructor> predicate = MethodReferenceExample::greatherThanTenYearsOfExperience;
        InstructorController.getAll().forEach(instructor -> {
            if(predicate.test(instructor)) {
                System.out.println(instructor);
            }
        });
    }
    // <.METHOD REFERENCE> //
            
}