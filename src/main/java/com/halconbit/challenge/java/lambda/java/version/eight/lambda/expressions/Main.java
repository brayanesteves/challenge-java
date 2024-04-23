package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions;

import com.halconbit.challenge.java.lambda.helloworld.HelloWorldTraditional;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.impl.HelloWorldLambda;

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
        System.out.println("====================");
        
        System.out.println("====================");
        System.out.println("LAMBDA");
        HelloWorldLambda helloWorldLambda = new HelloWorldLambda();
        System.out.println(helloWorldLambda.HelloWorldInterface());
        System.out.println("====================");
        
    }
}