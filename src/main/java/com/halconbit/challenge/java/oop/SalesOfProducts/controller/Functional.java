package com.halconbit.challenge.java.oop.SalesOfProducts.controller;

import com.halconbit.challenge.java.oop.SalesOfProducts.model.Person;
import java.util.List;

public class Functional {
    
    public void withFor(List<Person>  persons) {
        for(int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }
    
    public void withForEach(List<Person>  persons) {
        for(Person person : persons) {
            System.out.println(person);
        }
    }
    
}
