package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions;

import com.halconbit.challenge.java.lambda.helloworld.HelloWorldTraditional;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.impl.lambda.ConcatenateLambda;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.impl.traditional.ConcatenateTraditional;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.impl.lambda.HelloWorldLambda;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.impl.lambda.IncrementByFiveInterfaceLambda;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.impl.traditional.IncrementByFiveTraditional;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.interfaces.ConcatenateInterface;

/**
 *
 * @author Brayan Esteves
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("====================");
        System.out.println("TRADITIONAL");
        HelloWorldTraditional helloWorldTraditional = new HelloWorldTraditional();
        System.out.println(helloWorldTraditional.sayHelloWorld());
        System.out.println();
        IncrementByFiveTraditional incrementByFiveTraditional = new IncrementByFiveTraditional();
        System.out.println(incrementByFiveTraditional.incrementByFive(2));
        System.out.println();
        ConcatenateTraditional concatenateTraditional = new ConcatenateTraditional();
        System.out.println(concatenateTraditional.sconcat("Hello", "World!"));
        System.out.println("====================");
        
        System.out.println("====================");
        System.out.println("LAMBDA");
        HelloWorldLambda helloWorldLambda = new HelloWorldLambda();
        System.out.println(helloWorldLambda.HelloWorldInterface());
        System.out.println();
        System.out.println(helloWorldLambda.HelloWorldInterfaceSingle()); 
        System.out.println();
        IncrementByFiveInterfaceLambda incrementByFiveInterfaceLambda = new IncrementByFiveInterfaceLambda();
        System.out.println(incrementByFiveInterfaceLambda.IncrementByFive(2));
        System.out.println(incrementByFiveInterfaceLambda.IncrementByFiveSingle(2));
        System.out.println();
        ConcatenateLambda concatenateLambda = new ConcatenateLambda();
        System.out.println(concatenateLambda.Concatenate("Hello", "World!"));
        System.out.println(concatenateLambda.ConcatenateSingle("Hello", "World!"));
        System.out.println("====================");
        
    }
}