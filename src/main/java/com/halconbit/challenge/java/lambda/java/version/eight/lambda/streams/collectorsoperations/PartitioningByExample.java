package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.collectorsoperations;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.controller.InstructorController;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartitioningByExample {
    
    public Map<Boolean, List<Instructor>> partitionInstructorsInTwoGroups() {
        // Partition instructors in two groups of instructors
        // first is years of experience is > 10 and other is <= 10.
        Predicate<Instructor> experiencePredicate   = instructor -> instructor.getYearsOfExperience() > 10;
        Map<Boolean, List<Instructor>> partitionMap = InstructorController.getAll().stream().collect(Collectors.partitioningBy(experiencePredicate));
        return partitionMap;
    }
    
    public Map<Boolean, Set<Instructor>> partitionButReturnIsSetInsteadOfList_Set() {
        // Partition but return is set instead of list.
        Predicate<Instructor> experiencePredicate   = instructor -> instructor.getYearsOfExperience() > 10;
        Map<Boolean, Set<Instructor>> partitionMap = InstructorController.getAll().stream().collect(Collectors.partitioningBy(experiencePredicate, Collectors.toSet()));
        return partitionMap;
    }
    
}