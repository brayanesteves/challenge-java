package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.example.StreamExample;

public class Main {
    
    // ==================== //
    // STREAM EXAMPLE. //
    private static StreamExample streamExample;
    // ==================== //
    
    public Main() {
        // ==================== //
        // STREAM EXAMPLE. //
        streamExample = new StreamExample();
        // ==================== //
    }
    
    public static void main(String[] args) {
        System.out.println("====================");
        System.out.println("STREAM EXAMPLE.");
        Main.streamExample.creatingMapOfNamesAndCourseOfInstructorsWhoTeaches();
        System.out.println("====================");
    }
    
}