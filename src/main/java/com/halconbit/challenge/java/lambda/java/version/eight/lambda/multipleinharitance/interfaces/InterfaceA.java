package com.halconbit.challenge.java.lambda.java.version.eight.lambda.multipleinharitance.interfaces;

public interface InterfaceA {
    
    default void sumA(int a, int b) {
        System.out.println("InterfaceA.sumA " + (a + b));
    }
    
}