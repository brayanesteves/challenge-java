package com.halconbit.challenge.java.lambda.java.version.ten.var;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TypeInterferenceExample {
    
    public void String() {
        // String.
        // String name = "Mike";
        var name          = "Mike";
        var dateTime      = LocalDateTime.now(); // LocalDateTime dateTime = LocalDateTime.now();
        var idiomOfTheDay = "A blessing in disguise.";
    }
    
    public void HashMap() {
        HashMap<Integer, String> map = new HashMap<>();
        var mapVar = new HashMap<Integer, String>();
    }
    
    public void integerArray() {
        // Integer 'array';
        int[] numbers  = {1, 2, 3, 4, 5};
        var numbersVar = new int[] {1, 2, 3, 4, 5};
    }
    
    public void list() {
        // List.
        List<String> names = new ArrayList<>();
        names.add("Syed");
        names.add("Mike");
        
        var namesVar = new ArrayList<>();
        namesVar.add("Gene");
        namesVar.add(1.0001);
        namesVar.add(1);
    }
    
    public void numbers() {
        //
        var integers = List.of(1, 2, 3, 4, 5);
        integers.forEach(System.out::println);
        
        // int num = 999999999999999L;
        var num = 999999999999999L;
        
        var resultZero = 9/2; //4
        
        var resultOne = 9.0/2; //4.5
        
        var resultTwo = 11d/2d; //5.5
    }
    
    
}