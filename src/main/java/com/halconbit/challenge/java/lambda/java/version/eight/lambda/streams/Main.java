package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.example.StreamExample;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.example.StreamVsCollectorExample;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.operations.FilterExample;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.operations.FlatMapExample;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.operations.MapExample;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.operations.StreamComparatorExample;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.operations.StreamMapFilterReduce;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.operations.StreamMaxExample;
import com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.operations.StreamReduceExample;
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
    // STREAMS OPERATIONS [count(), count().distinct(), distinct().count(), distinct().sorted(), anyMatch(), allMatch(), noneMatch()]. //
    private static StreamsOperationsExample streamsOperationsExample;
    // STREAM COMPARATOR. //
    private static StreamComparatorExample streamComparatorExample;
    // filter() //
    private static FilterExample filterExample;
    // reduce() //
    private static StreamReduceExample streamReduceExample;
    // map().filter().reduce() //
    private static StreamMapFilterReduce streamMapFilterReduce;
    // max() //
    private static StreamMaxExample streamMaxExample;
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
        // STREAMS OPERATIONS [count(), count().distinct(), distinct().count(), distinct().sorted(), anyMatch(), allMatch(), noneMatch()]. //
        streamsOperationsExample = new StreamsOperationsExample();
        // STREAM COMPARATOR. //
        streamComparatorExample = new StreamComparatorExample();
        // filter() //
        filterExample = new FilterExample();
        // reduce() //
        streamReduceExample = new StreamReduceExample();
        // map().filter().reduce() //
        streamMapFilterReduce = new StreamMapFilterReduce();
        // max() //
        streamMaxExample = new StreamMaxExample();
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
        Main.flatMapExample.getListOfAllTheCoursesWhichInstructorsOffers();
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
        System.out.println("-o-o-o-o-o-o-o-o-");
        System.out.println("STREAM COMPARATOR.");
        System.out.println("No 'reversed()'");
        Main.streamComparatorExample.returningAllInstructorsSortedByTheirName();
        System.out.println("reversed()");
        Main.streamComparatorExample.returningAllInstructorsSortedByTheirName_Reversed();
        System.out.println("-o-o-o-o-o-o-o-o-");
        System.out.println("filter()");
        Main.filterExample.returningInstructorSorted();
        System.out.println("-o-o-o-o-o-o-o-o-");
        System.out.println("reduce()");
        Main.streamReduceExample.reduceSingle_Sum();    
        Main.streamReduceExample.reduceSingle_Multiply();        
        Main.streamReduceExample.reduceSingle_SumWithOptional();
        Main.streamReduceExample.reduceSingle_SumWithOptionalAndGet();        
        Main.streamReduceExample.reduceSingle_SumWithOptionalAndGetAndConditional();
        Main.streamReduceExample.reduce_PrintingTheInstructor();
        Main.streamReduceExample.reduce_PrintingTheInstructorOperatorTernario();
        System.out.println("-o-o-o-o-o-o-o-o-");
        System.out.println("map().filter().reduce()");
        Main.streamMapFilterReduce.totalYearsOfExperienceBWInstructors_Sum();
        Main.streamMapFilterReduce.totalYearsOfExperienceBWInstructors_SumAndInteger();
        System.out.println("-o-o-o-o-o-o-o-o-");
        System.out.println("max()");
        Main.streamMaxExample.maxUsingStreamMaxFunction_ComparatorTo();
        Main.streamMaxExample.maxUsingStreamMaxFunction_ReduceTernarioZero();
        Main.streamMaxExample.maxUsingStreamMaxFunction_OptionalReduceTernarioZero();
        Main.streamMaxExample.maxUsingStreamMaxFunction_OptionalReduceTernarioOne();
        System.out.println("====================");
    }
    
}