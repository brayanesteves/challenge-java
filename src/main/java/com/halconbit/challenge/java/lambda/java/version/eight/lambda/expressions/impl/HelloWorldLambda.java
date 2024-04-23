package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.impl;

import com.halconbit.challenge.java.lambda.helloworld.interfaces.HelloWorldInterface;

public class HelloWorldLambda {
    // Implementing 'sayHelloWorld()'. Using Lambda.
    public String HelloWorldInterface() {
        HelloWorldInterface helloWorldInterface = () -> {
            return "Hello World!";
        };
        return helloWorldInterface.sayHelloWorld();
    }
}