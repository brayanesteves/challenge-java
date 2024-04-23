package com.halconbit.challenge.java.lambda.helloworld;

import com.halconbit.challenge.java.lambda.helloworld.interfaces.HelloWorldInterface;

public class HelloWorldTraditional implements HelloWorldInterface {

    @Override
    public String sayHelloWorld() {
        return "Hello World";
    }
    
}
