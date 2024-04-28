
package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.interfaces;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;
import java.util.List;


public interface InstructorFactoryInterface {
    public abstract Instructor getInstructor(String name, int yearsOfExperience, String title, String gender, boolean onlineCourse, List<String> courses);
}