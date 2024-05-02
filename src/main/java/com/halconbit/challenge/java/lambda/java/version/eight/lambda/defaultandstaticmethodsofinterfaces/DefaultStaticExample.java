package com.halconbit.challenge.java.lambda.java.version.eight.lambda.defaultandstaticmethodsofinterfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultStaticExample {
    
    public List<String> traditional() {
        List<String> names = Arrays.asList("Mike", "Syed", "Jenny", "Gene", "Rajeev");
        Collections.sort(names);
        return names;
    }
    
    public List<String> withComparator() {
        List<String> names = Arrays.asList("Mike", "Syed", "Jenny", "Gene", "Rajeev");
        names.sort(Comparator.naturalOrder());
        return names;
    }
    
}