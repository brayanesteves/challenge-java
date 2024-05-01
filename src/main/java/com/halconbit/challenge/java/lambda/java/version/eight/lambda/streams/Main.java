package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.example.StreamExample;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.example.StreamVsCollectorExample;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.operations.FlatMapExample;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.operations.MapExample;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.operations.StreamsOperationsExample;

public class Main {
    
    // ==================== //
    // STREAM EXAMPLE. //
    private static StreamExample streamExample;
    // STREAM VS COLLECTOR EXAMPLE. //
    private static StreamVsCollectorExample streamVsCollectorExample;
    // OPERATIONS. //
    // map() //
    private static MapExample mapExample;
    // flatMap() //
    private static FlatMapExample flatMapExample;
    // flatMap() //
    private static StreamsOperationsExample streamsOperationsExample;
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
        // flatMap() //
        flatMapExample = new FlatMapExample();
        // flatMap() //
        streamsOperationsExample = new StreamsOperationsExample();
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
        System.out.println("flatMap()");
        Main.mapExample.returnOnlyInstructorNamesFromTheInstructorList();
        System.out.println("count()");
        Main.streamsOperationsExample.count();        
        System.out.println("count().distinct()");
        Main.streamsOperationsExample.countDistinct();
        System.out.println("distinct().count()");
        Main.streamsOperationsExample.distinct();
        System.out.println("distinct().sorted()");
        Main.streamsOperationsExample.distinctSorted();
        System.out.println("anyMatch()");
        Main.streamsOperationsExample.anyMatch();
        System.out.println("allMatch()");
        Main.streamsOperationsExample.allMatch();
        System.out.println("noneMatch()");
        Main.streamsOperationsExample.noneMatch();
        System.out.println("====================");
    }
    
}