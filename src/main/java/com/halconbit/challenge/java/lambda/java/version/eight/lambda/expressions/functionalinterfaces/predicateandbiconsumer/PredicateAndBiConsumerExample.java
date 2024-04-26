package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.predicateandbiconsumer;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.controller.InstructorController;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndBiConsumerExample {
    
    public void allInstructorWhoTeachesOnline() {
        // All instructor who teaches online.
        List<Instructor> instructors = InstructorController.getAll();
        Predicate<Instructor> predicateZero = (i) -> i.isOnlineCourses() == true;
        // Instructor experience is > 10.
        Predicate<Instructor> predicateOne  = (i) -> i.getYearsOfExperience() > 10;
        // BiConsumer print name and courses.
        BiConsumer<String, List<String>> biConsumer = (name, courses) -> System.out.println("Name is: " + name + " courses: " + courses);
        instructors.forEach(instructor -> {
            if(predicateZero.and(predicateOne).test(instructor)) {
                biConsumer.accept(instructor.getName(), instructor.getCourses());
            }
        });
    }
    
}