package com.halconbit.challenge.java.oop.SalesOfProducts.controller;

import com.halconbit.challenge.java.oop.SalesOfProducts.model.Person;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {
    
    public void withForEachLambda(List<Person> persons) {
        System.out.println("<FOR EACH - LAMBDA>");
        persons.forEach(System.out::println);
        System.out.println("</FOR EACH - LAMBDA>");
    }
    
    public void withFilter(List<Person> persons) {
        System.out.println("<FILTER>");
        List<Person> filteredList = persons.stream().filter(person -> this.getAge(person.getDateOfBirth()) >= 18).collect(Collectors.toList());
        this.printList(filteredList);
        System.out.println("</FILTER>");
    }
    
    public void withMap(List<Person> persons) {
        System.out.println("<MAP>");
        List<Integer> mapList = persons.stream().map(person -> this.getAge(person.getDateOfBirth())).collect(Collectors.toList());
        this.printList(mapList);
        System.out.println("</MAP>");
    }
    
    public void withFilterMap(List<Person> persons) {
        System.out.println("<FILTER & MAP>");
        List<Integer> filterMapList = persons.stream().filter(person -> this.getAge(person.getDateOfBirth()) >= 18).map(person -> this.getAge(person.getDateOfBirth())).collect(Collectors.toList());
        this.printList(filterMapList);
        System.out.println("</FILTER & MAP>");
    }
    
    public void withMapOnPrefix(List<Person> persons) {
        System.out.println("<MAP ON PREFIX>");
        List<String> mapOnPrefixList = persons.stream().map(person -> "Coder " + person.getName()).collect(Collectors.toList());
        this.printList(mapOnPrefixList);
        System.out.println("</MAP ON PREFIX>");
    }
    
    public int getAge(LocalDate birthDate) {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
    
    public void printList(List<?> list) {
        list.forEach(System.out::println);
    }
    
}
