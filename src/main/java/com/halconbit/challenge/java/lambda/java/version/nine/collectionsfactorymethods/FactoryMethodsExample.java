package com.halconbit.challenge.java.lambda.java.version.nine.collectionsfactorymethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethodsExample {
    
    public List<String> unmodifiableList() {        
        List<String> names = new ArrayList();
        names.add("Syed");
        names.add("Mike");
        names.add("Jenny");
        names = Collections.unmodifiableList(names);
        return names;        
    }
    
    // Factory methods of Java version 9.
    
    public List<String> List_of() {        
        List<String> names = List.of("Syed", "Mike", "Jenny");
        return names;        
    }
    
    public Set<String> Set_of() {        
        Set<String> names = Set.of("Syed", "Mike", "Jenny");
        return names;        
    }
    
    public Map<String, String> Map_of() {        
        Map<String, String> names = Map.of("Grade1" ,"Syed", "Grade2", "Mike");
        return names;        
    }
    
}