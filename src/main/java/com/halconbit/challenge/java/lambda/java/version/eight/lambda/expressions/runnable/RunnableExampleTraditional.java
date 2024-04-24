package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.runnable;

public class RunnableExampleTraditional {
    // Runnable Traditional Example.
    public void runnableExample() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for(int i = 0; i < 10; i++) {
                    sum += i;
                    System.out.println("Traditional: " + sum);
                }
            }
        };
        new Thread(runnable).start();
    }
    
}