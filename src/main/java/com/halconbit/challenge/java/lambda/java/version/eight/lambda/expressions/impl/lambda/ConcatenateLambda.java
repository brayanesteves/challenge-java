
package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.impl.lambda;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.interfaces.ConcatenateInterface;

public class ConcatenateLambda {
    // Implementing 'sayHelloWorld()'. Using Lambda.
    public String Concatenate(String a, String b) {
        ConcatenateInterface concatenateInterface = (x, y) -> {
            return a + " " + b;
        };
        return concatenateInterface.sconcat(a, b);
    }
    
    public String ConcatenateSingle(String a, String b) {
        ConcatenateInterface concatenateInterface = (x, y) -> a + " " + b;
        return concatenateInterface.sconcat(a, b);
    }
}