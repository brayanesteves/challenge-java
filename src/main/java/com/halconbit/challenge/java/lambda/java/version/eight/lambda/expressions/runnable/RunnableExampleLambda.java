package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.runnable;

public class RunnableExampleLambda {
    // Runnable 'Lambda' Example.
    public void runnableExample() {
        Runnable runnable = () -> {
            int sum = 0;
            for(int i = 0; i < 10; i++) {
                sum += i;
                System.out.println("Runnable Lambda: " + sum);
            }
        };
        new Thread(runnable).start();  
    }
    
    // Implement using 'Thread' with 'Lambda'.
    public void threadExampleWithLambda() {
        new Thread(() -> {
            int sum = 0;
            for(int i = 0; i < 10; i++) {
                sum = sum + i;
                System.out.println("Thread Lambda: " + sum);
            }
        }).start();  
    }
}