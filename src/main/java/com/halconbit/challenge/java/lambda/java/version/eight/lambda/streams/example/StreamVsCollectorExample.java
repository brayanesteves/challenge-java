package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamVsCollectorExample {
    
    public void listNames() {
        List<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("Syed");
        names.add("Rajeev");
        System.out.println("--------");
        System.out.println(names);
        
        names.remove("Syed");
        System.out.println("--------");
        System.out.println(names);
        
        for(String name : names) {
            System.out.println(name);
        }
        
    }
    
    public void listNames_Stream() {
        List<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("Syed");
        names.add("Rajeev");
        Stream<String> namesStream = names.stream();
        namesStream.forEach(System.out::println);
    }
    
    public void listNames_StreamCollectors() {
        List<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("Syed");
        names.add("Rajeev");
        Stream<String> namesStream = names.stream();
        namesStream.forEach(System.out::println);
        System.out.println("--------");
        List<String> listNames = namesStream.filter(s -> s.startsWith("M")).collect(Collectors.toList());
        System.out.println(listNames);
    }
    
}