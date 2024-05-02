package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.collectorsoperations;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.controller.InstructorController;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsMinMaxExample {
    
    public Optional<Instructor> minBy() {
        // Instructor with minimum years of experience.
        Optional<Instructor> instructor = InstructorController.getAll().stream().collect(Collectors.minBy(Comparator.comparing(Instructor::getYearsOfExperience)));
        return instructor;
    }
    
    public Optional<Instructor> min() {
        // Instructor with minimum years of experience.
        Optional<Instructor> instructor = InstructorController.getAll().stream().min(Comparator.comparing(Instructor::getYearsOfExperience));
        return instructor;
    }
    
    public Optional<Instructor> maxBy() {
        // Instructor with maximum years of experience.
        Optional<Instructor> instructor = InstructorController.getAll().stream().collect(Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience)));
        return instructor;
    }
    
    
}