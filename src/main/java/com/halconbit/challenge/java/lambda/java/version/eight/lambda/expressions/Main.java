package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions;

import com.halconbit.challenge.java.lambda.helloworld.HelloWorldTraditional;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.callable.SumOfNumberUsingCallable;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.consumer.ConsumerExample;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.impl.lambda.ConcatenateLambda;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.impl.traditional.ConcatenateTraditional;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.impl.lambda.HelloWorldLambda;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.impl.lambda.IncrementByFiveInterfaceLambda;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.impl.traditional.IncrementByFiveTraditional;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.runnable.RunnableExampleLambda;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.runnable.RunnableExampleTraditional;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brayan Esteves
 */
public class Main {
    
    // ==================== //
    // TRADITIONAL //
    private static HelloWorldTraditional helloWorldTraditional;
    private static IncrementByFiveTraditional incrementByFiveTraditional;
    private static ConcatenateTraditional concatenateTraditional;
    // TRADITIONAL RUNNABLE //
    private static RunnableExampleTraditional runnableExample;
    // ==================== //
    // LAMBDA //
    private static HelloWorldLambda helloWorldLambda;
    private static IncrementByFiveInterfaceLambda incrementByFiveInterfaceLambda;
    private static ConcatenateLambda concatenateLambda;
    // LAMBDA RUNNABLE //
    private static RunnableExampleLambda runnableExampleLambda;
    // LAMBDA CALLABLE //
    private static SumOfNumberUsingCallable sumOfNumberUsingCallable;
    // CONSUMER //
    private static ConsumerExample consumerExample;
    // ==================== //
    
    public Main() {
        // ==================== //
        // TRADITIONAL. //
        helloWorldTraditional      = new HelloWorldTraditional();
        incrementByFiveTraditional = new IncrementByFiveTraditional();
        concatenateTraditional     = new ConcatenateTraditional();
        // TRADITIONAL RUNNABLE. //
        runnableExample = new RunnableExampleTraditional();
        // ==================== //
        // LAMBDA. //
        helloWorldLambda               = new HelloWorldLambda();
        incrementByFiveInterfaceLambda = new IncrementByFiveInterfaceLambda();
        concatenateLambda              = new ConcatenateLambda();
        // LAMBDA RUNNABLE. //
        runnableExampleLambda = new RunnableExampleLambda();
        // LAMBDA CALLABLE. //
        sumOfNumberUsingCallable = new SumOfNumberUsingCallable();
        // CONSUMER. //
        consumerExample = new ConsumerExample();
        // ==================== //
    }
    
    public static void main(String[] args) {
        System.out.println("====================");
        System.out.println("TRADITIONAL");
        System.out.println(Main.helloWorldTraditional.sayHelloWorld());
        System.out.println();
        System.out.println(Main.incrementByFiveTraditional.incrementByFive(2));
        System.out.println();
        System.out.println(Main.concatenateTraditional.sconcat("Hello", "World!"));
        System.out.println("TRADITIONAL RUNNABLE");
        Main.runnableExample.runnableExample();
        System.out.println("====================");
        
        System.out.println("====================");
        System.out.println("LAMBDA");
        System.out.println(Main.helloWorldLambda.HelloWorldInterface());
        System.out.println();
        System.out.println(Main.helloWorldLambda.HelloWorldInterfaceSingle());
        System.out.println();
        System.out.println(Main.incrementByFiveInterfaceLambda.IncrementByFive(2));
        System.out.println(Main.incrementByFiveInterfaceLambda.IncrementByFiveSingle(2));
        System.out.println();
        System.out.println(Main.concatenateLambda.Concatenate("Hello", "World!"));
        System.out.println(Main.concatenateLambda.ConcatenateSingle("Hello", "World!"));
        System.out.println("LAMBDA RUNNABLE");
        Main.runnableExampleLambda.runnableExample();
        Main.runnableExampleLambda.threadExampleWithLambda();
        System.out.println("LAMBDA CALLABLE");
        try {
            Main.sumOfNumberUsingCallable.callableLambda();
        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("LAMBDA CONSUMER");
        Main.consumerExample.consumerString();
        Main.consumerExample.consumerInteger();
        Main.consumerExample.consumerObjectInstructor();
        
        Main.consumerExample.intConsumer();
        Main.consumerExample.longConsumer();
        Main.consumerExample.doubleConsumer();
        
        Main.consumerExample.biConsumer_PrintingTwoNumbers(2, 4);
        Main.consumerExample.biConsumer_CalculatingTwoNumbers(2, 4);
        Main.consumerExample.biConsumer_ConcatenateString("Fell on", "deaf ears");
        System.out.println("====================");
    }
}