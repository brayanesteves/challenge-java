package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.constructorreference;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.interfaces.InstructorFactoryInterface;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;
import java.util.List;

public class ConstructorReferenceExample {
    
    public void constructorReference_InstructorFactory(String name, int yearsOfExperience, String title, String gender, boolean onlineCourse, List<String> courses) {
        InstructorFactoryInterface instructorFactoryInterface = Instructor::new;
        Instructor instructor                                 = instructorFactoryInterface.getInstructor(name, yearsOfExperience, title, gender, onlineCourse, courses);
        System.out.println(instructor);
    }
    
}