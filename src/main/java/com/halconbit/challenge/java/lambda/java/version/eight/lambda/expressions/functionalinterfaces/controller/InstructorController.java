package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.controller;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;
import java.util.Arrays;
import java.util.List;

public class InstructorController {
    
    public static List<Instructor> getAll() {
        Instructor instructor1 = new Instructor("Mike", 10, "Software Developer", "M", true, Arrays.asList("Java Programming", "C++ Programming", "Python Programming"));
        Instructor instructor2 = new Instructor("Jenny", 5, "Engineer", "F", false, Arrays.asList("Multi-Threaded Programming", "CI/CD", "Unit Test"));
        Instructor instructor3 = new Instructor("Gene", 6, "Manager", "M", false, Arrays.asList("C++ Programming", "C Programming", "React Native"));
        Instructor instructor4 = new Instructor("Anthony", 15, "Senior Developer", "M", true, Arrays.asList("Java Programming", "Angular Programming", "Python Programming"));
        Instructor instructor5 = new Instructor("Syed", 15, "Principal Engineer", "M", true, Arrays.asList("Java Programming", "Java Multi-Thread Programming", "Python Programming"));
        List<Instructor> list = Arrays.asList(instructor1, instructor2, instructor3, instructor4, instructor5);
        return list;
    }
    
}