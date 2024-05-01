package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.example.StreamExample;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.example.StreamVsCollectorExample;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.operations.MapExample;

public class Main {
    
    // ==================== //
    // STREAM EXAMPLE. //
    private static StreamExample streamExample;
    // STREAM VS COLLECTOR EXAMPLE. //
    private static StreamVsCollectorExample streamVsCollectorExample;
    // OPERATIONS. //
    // map() //
    private static MapExample mapExample;
    // ==================== //
    
    public Main() {
        // ==================== //
        // STREAM EXAMPLE. //
        streamExample = new StreamExample();
        // STREAM VS COLLECTOR EXAMPLE. //
        streamVsCollectorExample = new StreamVsCollectorExample();
        // OPERATIONS. //
        // map() //
        mapExample = new MapExample();
        // ==================== //
    }
    
    public static void main(String[] args) {
        System.out.println("====================");
        System.out.println("STREAM EXAMPLE.");
        Main.streamExample.creatingMapOfNamesAndCourseOfInstructorsWhoTeaches();
        System.out.println("-o-o-o-o-o-o-o-o-");
        System.out.println("STREAM EXAMPLE (INSIDE STREAM).");
        Main.streamExample.creatingMapOfNamesAndCourseOfInstructorsWhoTeaches_InsideStream();
        System.out.println("-----------------");
        System.out.println("STREAM EXAMPLE (INSIDE STREAM) [DEBUGGING].");
        Main.streamExample.creatingMapOfNamesAndCourseOfInstructorsWhoTeaches_InsideStreamDebuggingZero();
        Main.streamExample.creatingMapOfNamesAndCourseOfInstructorsWhoTeaches_InsideStreamDebuggingOne();
        Main.streamExample.creatingMapOfNamesAndCourseOfInstructorsWhoTeaches_InsideStreamDebuggingTwo();
        System.out.println("-o-o-o-o-o-o-o-o-");
        System.out.println("STREAM VS COLLECTOR EXAMPLE.");
        Main.streamVsCollectorExample.listNames();
        Main.streamVsCollectorExample.listNames_Stream();
        Main.streamVsCollectorExample.listNames_StreamCollectors();
        System.out.println("-o-o-o-o-o-o-o-o-");
        System.out.println("OPERATIONS.");
        System.out.println("map()");
        Main.mapExample.returnOnlyInstructorNamesFromTheInstructorList();
        System.out.println("====================");
    }
    
}