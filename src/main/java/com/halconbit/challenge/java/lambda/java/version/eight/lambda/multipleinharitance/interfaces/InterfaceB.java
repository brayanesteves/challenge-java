package com.halconbit.challenge.java.lambda.java.version.eight.lambda.multipleinharitance.interfaces;

public interface InterfaceB extends InterfaceA {
    
    default void sumB(int a, int b) {
        System.out.println("InterfaceB.sumB " + (a + b));
    }
    
    default void sumA(int a, int b) {
        System.out.println("InterfaceB.sumA " + (a + b));
    }
    
}