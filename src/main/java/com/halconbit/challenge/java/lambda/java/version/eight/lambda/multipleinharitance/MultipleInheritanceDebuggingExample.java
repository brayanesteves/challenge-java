package com.halconbit.challenge.java.lambda.java.version.eight.lambda.multipleinharitance;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.multipleinharitance.interfaces.InterfaceA;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.multipleinharitance.interfaces.InterfaceD;

public class MultipleInheritanceDebuggingExample implements InterfaceA, InterfaceD {    
    
    public void sumA(int a, int b) {
        System.out.println("MultipleInheritanceExample.sumA " + (a + b));
    }
    
}