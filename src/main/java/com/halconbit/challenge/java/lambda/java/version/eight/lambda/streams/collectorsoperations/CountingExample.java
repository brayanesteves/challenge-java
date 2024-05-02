package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.collectorsoperations;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.controller.InstructorController;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;
import java.util.stream.Collectors;

public class CountingExample {
    
    public long count() {
        // Count the numbers of instructors who teaches online courses 'stream() & count()'.
        long count = InstructorController.getAll().stream().filter(Instructor::isOnlineCourses).count();
        return count;
    }
    
    public long counting() {
        // Collectors.counting.
        long count = InstructorController.getAll().stream().filter(Instructor::isOnlineCourses).collect(Collectors.counting());
        return count;
    }
    
}