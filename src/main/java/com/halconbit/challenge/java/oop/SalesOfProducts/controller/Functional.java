package com.halconbit.challenge.java.oop.SalesOfProducts.controller;

import com.halconbit.challenge.java.oop.SalesOfProducts.model.Person;
import java.util.List;

public class Functional {
    
    public void withFor(List<Person>  persons) {
        System.out.println("<FOR>");
        for(int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
        System.out.println("</FOR>");
    }
    
    public void withForEach(List<Person>  persons) {
        System.out.println("<FOR EACH>");
        for(Person person : persons) {
            System.out.println(person);
        }
        System.out.println("</FOR EACH>");
    }
    
}
