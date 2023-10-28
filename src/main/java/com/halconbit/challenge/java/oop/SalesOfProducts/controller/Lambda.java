package com.halconbit.challenge.java.oop.SalesOfProducts.controller;

import com.halconbit.challenge.java.oop.SalesOfProducts.model.Person;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {
    
    public void withForEachLambda(List<Person>  persons) {
        System.out.println("<FOR EACH - LAMBDA>");
        persons.forEach(System.out::println);
        System.out.println("</FOR EACH - LAMBDA>");
    }
    
    public void withFilter(List<Person>  persons) {
        System.out.println("<FILTER>");
        List<Person> filteredLis = persons.stream().filter(person -> getAge(person.getDateOfBirth()) >= 18).collect(Collectors.toList());
        this.printList(persons);
        System.out.println("</FILTER>");
    }
    
    public int getAge(LocalDate birthDate) {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
    
    public void printList(List<?> list) {
        list.forEach(System.out::println);
    }
    
}
