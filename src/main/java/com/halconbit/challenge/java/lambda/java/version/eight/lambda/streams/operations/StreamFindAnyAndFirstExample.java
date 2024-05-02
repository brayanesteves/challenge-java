package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.operations;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.controller.InstructorController;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;
import java.util.Optional;

public class StreamFindAnyAndFirstExample {
    
    public void findAny() {
        Optional<Instructor> instructorOptional = InstructorController.getAll().stream().findAny();
        if(instructorOptional.isPresent()) {
            System.out.println(instructorOptional.get());
        }
    }
    
    public void findFirst() {
        Optional<Instructor> instructorOptional = InstructorController.getAll().stream().findFirst();
        if(instructorOptional.isPresent()) {
            System.out.println(instructorOptional.get());
        }
    }
    
}