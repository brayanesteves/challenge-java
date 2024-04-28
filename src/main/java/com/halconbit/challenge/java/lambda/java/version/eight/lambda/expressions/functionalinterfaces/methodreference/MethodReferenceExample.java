package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.methodreference;

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
            
}