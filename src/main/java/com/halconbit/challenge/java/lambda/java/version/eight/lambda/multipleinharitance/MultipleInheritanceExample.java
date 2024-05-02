package com.halconbit.challenge.java.lambda.java.version.eight.lambda.multipleinharitance;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.multipleinharitance.interfaces.InterfaceA;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.multipleinharitance.interfaces.InterfaceB;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.multipleinharitance.interfaces.InterfaceC;

public class MultipleInheritanceExample implements InterfaceA, InterfaceB, InterfaceC {
    
    MultipleInheritanceExample multipleInheritanceExample;
    
    // Singleton.
    public MultipleInheritanceExample() {
        this.multipleInheritanceExample = new MultipleInheritanceExample();
    }
    
    public void show() {
        this.multipleInheritanceExample.sumA(4, 8); // Resolved to child.
        this.multipleInheritanceExample.sumB(2, 4);
        this.multipleInheritanceExample.sumC(1, 2);
    }
    
    // Implemented class first.
    // The sub interface that extends the interface.
    public void sumA(int a, int b) {
        System.out.println("MultipleInheritanceExample.sumA " + (a + b));
    }
    
}