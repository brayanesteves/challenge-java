package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.impl.lambda;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.interfaces.IncrementByFiveInterface;

/**
 *
 * @author Brayan Esteves
 */
public class IncrementByFiveInterfaceLambda {
    // Implementing 'sayHelloWorld()'. Using Lambda.
    public int IncrementByFive(int value) {
        IncrementByFiveInterface incrementByFiveInterface = (x) -> {
            return x + 5;
        };
        return incrementByFiveInterface.incrementByFive(value);
    }
    
    public int IncrementByFiveSingle(int value) {
        IncrementByFiveInterface incrementByFiveInterface = (x) -> x + 5;
        return incrementByFiveInterface.incrementByFive(value);
    }
}