package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.consumer;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.controller.InstructorController;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerExample {
    public void consumerString() {
        Consumer<String> consumer = (x) -> System.out.println(x.length() + " the value of 'x': " + x);
        consumer.accept("Up in the air");
    }
    
    // Consumer with block statement.
    public void consumerInteger() {
        Consumer<Integer> consumer = (x) -> {
            System.out.println("x*x = " + x*x);
            System.out.println("x/x = " + x/x);
        };
        consumer.accept(10);
    }
    
    public void consumerObjectInstructor() {
        List<Instructor> instructors = InstructorController.getAll();
        // Looping through all the instructor and printing out the values of instructor.
        Consumer<Instructor> consumerZero = (s1) -> System.out.println(s1);
        instructors.forEach(consumerZero);
        
        System.out.println("====================");
        // Looping through all the instructor and only print out their name.
        Consumer<Instructor> consumerOne = (s1) -> System.out.println(s1.getName());
        instructors.forEach(consumerOne);
        
        System.out.println("====================");
        // Looping through all the instructors and print out their names and their courses.
        Consumer<Instructor> consumerTwo = (s1) -> System.out.println(s1.getCourses());
        instructors.forEach(consumerOne.andThen(consumerTwo));
        // Looping through all the instructors and print out their name if the years of experience is > 10.
        instructors.forEach(s1 -> {
            if(s1.getYearsOfExperience() > 10) {
                consumerZero.accept(s1);
            }
        });
        
        System.out.println("====================");
        // Looping through all the instructors and print out their name and years of experience if years
        // of experience is > 5 and teaches course online.
        instructors.forEach(s1 -> {
            if(s1.getYearsOfExperience() > 5 && s1.isOnlineCourses()) {
                consumerZero.andThen(consumerOne).accept(s1);
            }
        });
    }
    
    public void intConsumer() {
        IntConsumer intConsumer = (a) -> System.out.println(a * 10);
        intConsumer.accept(10);
    }
    
    public void longConsumer() {
        LongConsumer longConsumer = (a) -> System.out.println(a * 10L);
        longConsumer.accept(10);
    }
    
    public void doubleConsumer() {
        DoubleConsumer doubleConsumer = (a) -> System.out.println(a * 10);
        doubleConsumer.accept(10.50);
    }
    
    // <BI CONSUMER> //    
    public void biConsumer_PrintingTwoNumbers(int a, int b) {
        // Printing two numbers.
        BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println("x: " + x + " y: " + y);
        biConsumer.accept(a, b);
    }
    
    public void biConsumer_CalculatingTwoNumbers(int a, int b) {
        // Calculating sum of two integers.
        BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println("x+y: " + (x + y));
        biConsumer.accept(a, b);
    }
    
    public void biConsumer_ConcatenateString(String a, String b) {
        // Calculating sum of two integers.
        BiConsumer<String, String> biConsumer = (x, y) -> System.out.println(x + y);
        biConsumer.accept(a, b);
    }
    
    public void biConsumer_PrintNameAndGender() {
        // Print out name and gender of instructors.
        List<Instructor> instructors = InstructorController.getAll();        
        BiConsumer<String, String> biConsumer = (name, gender) -> System.out.println("Name is: " + name + " and gender is: " + gender);
        instructors.forEach(instructor -> biConsumer.accept(instructor.getName(), instructor.getGender()));
    }
    
    public void biConsumer_PrintNameAndListCourses() {
        // Print out name and gender of instructors.
        List<Instructor> instructors = InstructorController.getAll();        
        BiConsumer<String, List<String>> biConsumer = (name, courses) -> System.out.println("Name is: " + name + " and courses is: " + courses);
        instructors.forEach(instructor -> biConsumer.accept(instructor.getName(), instructor.getCourses()));
    }
    
    public void biConsumer_PrintNameAndGenderAllInstructors() {
        // Print out name and gender of all instructors who teaches online.
        List<Instructor> instructors = InstructorController.getAll();
        BiConsumer<String, String> biConsumer = null;
        instructors.forEach(instructor -> {
            biConsumer.accept(instructor.getName(), instructor.getGender());
        });
    }
    // <.BI CONSUMER> //
}