package com.halconbit.challenge.java.lambda.java.version.eight.lambda.multipleinharitance.interfaces;

public interface InterfaceD {
    
    default void sumD(int a, int b) {
        System.out.println("InterfaceD.sumD " + (a + b));
    }
    
}