package com.halconbit.challenge.java.oop.SalesOfProducts.controller;

import com.halconbit.challenge.java.oop.SalesOfProducts.model.Person;
import java.util.List;

public class Lambda {
    
    public void withForEachLambda(List<Person>  persons) {
        System.out.println("<FOR EACH - LAMBDA>");
        persons.forEach(System.out::println);
        System.out.println("</FOR EACH - LAMBDA>");
    }
    
}
