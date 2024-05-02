package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.collectorsoperations;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.controller.InstructorController;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupingMinMaxAvgExample {
    
    public Map<Boolean, Optional<Instructor>> maxBy() {
        // Grouping the instructors in two sets of online course vs not online
        // and get the max years of experience of the instructors.
        Map<Boolean, Optional<Instructor>> maxInstructors = InstructorController.getAll().stream().collect(Collectors.groupingBy(Instructor::isOnlineCourses, Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience))));
        return maxInstructors;
    }
    
    public Map<Boolean, Instructor> maxBy_collectingAndThen() {
        // collectingAndThen().
        Map<Boolean, Instructor> maxInstructors = InstructorController.getAll().stream().collect(Collectors.groupingBy(Instructor::isOnlineCourses, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience)), Optional::get)));
        return maxInstructors;
    }

    public Map<Boolean, Double> maxBy_collectingAndThen_Double() {
        // Average years of experience of instructors who teaches online or not.
        Map<Boolean, Double> averageInstructors = InstructorController.getAll().stream().collect(Collectors.groupingBy(Instructor::isOnlineCourses, Collectors.averagingInt(Instructor::getYearsOfExperience)));
        return averageInstructors;
    }
    
    public Map<Boolean, IntSummaryStatistics> maxBy_collectingAndThen_IntSummaryStatistics() {
        // Drive a statistical summary from properties of grouped items.
        Map<Boolean, IntSummaryStatistics> averageInstructors = InstructorController.getAll().stream().collect(Collectors.groupingBy(Instructor::isOnlineCourses, Collectors.summarizingInt(Instructor::getYearsOfExperience)));
        return averageInstructors;
    }
    
}