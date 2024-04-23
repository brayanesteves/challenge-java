
package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.impl.traditional;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.interfaces.ConcatenateInterface;

public class ConcatenateTraditional implements ConcatenateInterface {

    @Override
    public String sconcat(String a, String b) {
        return a + " " + b;
    }
    
}