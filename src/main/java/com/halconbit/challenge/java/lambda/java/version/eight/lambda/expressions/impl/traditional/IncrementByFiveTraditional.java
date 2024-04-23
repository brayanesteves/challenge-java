package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.impl.traditional;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.interfaces.IncrementByFiveInterface;

/**
 *
 * @author Brayan Esteves
 */
public class IncrementByFiveTraditional implements IncrementByFiveInterface{

    @Override
    public int incrementByFive(int value) {
        return value + 5;
    }
    
}
