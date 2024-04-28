package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.variablesscope;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.controller.InstructorController;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.models.Instructor;
import java.util.List;
import java.util.function.IntConsumer;

public class VariablesScopeExample {
    int k_global = 0;
    public void localVariable_Multiply() {
        int b = 10; // Local variable.
        IntConsumer intConsumer = (a) -> System.out.println(a * 10);
    }
    
    public void localVariable_ObjectInstructor() {
        int k = 0; // Local variable.
        List<Instructor> instructors = InstructorController.getAll();
        instructors.forEach(instructor -> {
            // System.out.println(instructor + " " + k); // ERROR: local variables referenced from a lambda expression must be final or effectively final.
            System.out.println(instructor + " " + this.k_global);
        });
        // k++;
        this.k_global++;
    }
    
}