package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.numeric;

import com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.numeric.models.RandomIds;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;


public class MapToObjLongDoubleExample {
    
    public List<RandomIds> mapToObj(int a, int b) {
        List<RandomIds> randomIds = IntStream.rangeClosed(a, b).mapToObj((i) -> { 
            return new RandomIds(i, ThreadLocalRandom.current().nextInt(100));
         }).collect(Collectors.toList());
        
        return randomIds;
    }
    
    public LongStream mapToLong(int a, int b) {
        LongStream longStream = IntStream.rangeClosed(a, b).mapToLong((i) -> (long) i);
        return longStream;
    }
    
    public DoubleStream mapToDouble(int a, int b) {
        DoubleStream doubleStream = LongStream.rangeClosed(a, b).mapToDouble((i) -> (double) i);
        return doubleStream;
    }
    
}