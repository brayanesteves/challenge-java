package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.example.StreamExample;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.example.StreamVsCollectorExample;

public class Main {
    
    // ==================== //
    // STREAM EXAMPLE. //
    private static StreamExample streamExample;
    // STREAM VS COLLECTOR EXAMPLE. //
    private static StreamVsCollectorExample streamVsCollectorExample;
    // ==================== //
    
    public Main() {
        // ==================== //
        // STREAM EXAMPLE. //
        streamExample = new StreamExample();
        // STREAM VS COLLECTOR EXAMPLE. //
        streamVsCollectorExample = new StreamVsCollectorExample();
        // ==================== //
    }
    
    public static void main(String[] args) {
        System.out.println("====================");
        System.out.println("STREAM EXAMPLE.");
        Main.streamExample.creatingMapOfNamesAndCourseOfInstructorsWhoTeaches();
        System.out.println("STREAM EXAMPLE (INSIDE STREAM).");
        Main.streamExample.creatingMapOfNamesAndCourseOfInstructorsWhoTeaches();
        System.out.println("STREAM VS COLLECTOR EXAMPLE.");
        Main.streamExample.creatingMapOfNamesAndCourseOfInstructorsWhoTeaches();
        System.out.println("====================");
    }
    
}