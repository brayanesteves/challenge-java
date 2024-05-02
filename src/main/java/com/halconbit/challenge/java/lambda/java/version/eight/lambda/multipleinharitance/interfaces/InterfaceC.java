package com.halconbit.challenge.java.lambda.java.version.eight.lambda.multipleinharitance.interfaces;

public interface InterfaceC {
    
    default void sumC(int a, int b) {
        System.out.println("InterfaceC.sumC " + (a + b));
    }
    
}