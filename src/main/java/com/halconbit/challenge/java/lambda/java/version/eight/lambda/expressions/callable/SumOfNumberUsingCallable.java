package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.callable;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class SumOfNumberUsingCallable {
    
    public static int[] array = IntStream.rangeClosed(0, 5000).toArray();
    public static int total   = IntStream.rangeClosed(0, 5000).sum();
    
    public void callableLambda() throws InterruptedException, ExecutionException {
        
        Callable callableZero = () -> {
            int sum = 0;
            for(int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            return sum;
        };
        
        Callable callableOne = () -> {
            int sum = 0;
            for(int i = array.length / 2; i < array.length; i++) {
                sum = sum + array[i];
            }
            return sum;
        };
        
        ExecutorService executorService  = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> taskList = Arrays.asList(callableZero, callableOne);
        List<Future<Integer>> results    = executorService.invokeAll(taskList);
        
        int k   = 0;
        int sum = 0;
        for(Future<Integer> result : results) {
            sum = sum + result.get();
            System.out.println("SUM of " + k + " is: " + result.get());
        }
        System.out.println("Sum from the 'Callable' is: " + sum);
        System.out.println("Correct sum from 'InStream' is: " + total);
        
    }
    
}