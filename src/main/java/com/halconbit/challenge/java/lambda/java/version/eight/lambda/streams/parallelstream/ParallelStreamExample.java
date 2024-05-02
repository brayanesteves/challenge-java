package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.parallelstream;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.parallelstream.models.RandomTokens;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ParallelStreamExample {
    
    public static int sumSequentialStream(int a, int b) {
        return IntStream.rangeClosed(a, b).sum();
    }
    
    public static int sumParallelStream(int a, int b) {
        return IntStream.rangeClosed(a, b).parallel().sum();
    }
    
    public static long measurePerfomanceInteger(Supplier<Integer> supplier, int numberOfTimes) {
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < numberOfTimes; i++) {
            supplier.get();
        }
        return System.currentTimeMillis() - startTime;
    }
    
    public static long measurePerfomanceLong(Supplier<Long> supplier, int numberOfTimes) {
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < numberOfTimes; i++) {
            supplier.get();
        }
        return System.currentTimeMillis() - startTime;
    }
    
    public static long sortSequentialStreamLong() {
        List<RandomTokens> randomTokens = LongStream.rangeClosed(0, 5000).parallel().mapToObj((i) -> {
            return new RandomTokens(i, ThreadLocalRandom.current().nextLong(5000));
        }).collect(Collectors.toList());        
        randomTokens.stream().sorted(Comparator.comparing(RandomTokens::getTokens));
        return -1;        
    }
    
    public static long sortParallelStreamLong() {
        List<RandomTokens> randomTokens = LongStream.rangeClosed(0, 5000).parallel().mapToObj((i) -> {
            return new RandomTokens(i, ThreadLocalRandom.current().nextLong(5000));
        }).collect(Collectors.toList());        
        randomTokens.stream().parallel().sorted(Comparator.comparing(RandomTokens::getTokens));
        return -1;        
    }
    
    public long resultSortSequentialStreamLong() {
        long result = this.measurePerfomanceLong(ParallelStreamExample::sortSequentialStreamLong, 20);
        return result;
    }
    
    public long resultSortParallelStreamLong() {
        long result = this.measurePerfomanceLong(ParallelStreamExample::sortParallelStreamLong, 20);
        return result;
    }
    
}