package com.halconbit.challenge.java.oop.SalesOfProducts.controller;

import com.halconbit.challenge.java.oop.SalesOfProducts.model.Person;
import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lambda {
    
    // Variables 'Global'.
    private Comparator<Person> byNameDesc          = (Person object_1, Person object_2) -> object_2.getName().compareTo(object_1.getName());
    private Comparator<Person> byNameAsc           = (Person object_1, Person object_2) -> object_1.getName().compareTo(object_2.getName());
    private Predicate<Person>  startsWithPredicate = person -> person.getName().startsWith("J");
    
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
    
    public void withSortedAsc(List<Person> persons) {
        System.out.println("<SORTED: ASC>");
        List<Person> sortedList = persons.stream().sorted(this.byNameAsc).collect(Collectors.toList());
        this.printList(sortedList);
        System.out.println("</SORTED: ASC>");
    }
    
    public void withSortedDesc(List<Person> persons) {
        System.out.println("<SORTED: DESC>");
        List<Person> sortedList = persons.stream().sorted(this.byNameDesc).collect(Collectors.toList());
        this.printList(sortedList);
        System.out.println("</SORTED: DESC>");
    }
    
    public void withAnyMatch(List<Person> persons) {
        System.out.println("<ANY MATCH>");
        boolean anyMatchList = persons.stream().anyMatch(this.startsWithPredicate);
        System.out.println(anyMatchList);
        System.out.println("</ANY MATCH>");
    }
    
    public void withAllMatch(List<Person> persons) {
        System.out.println("<ALL MATCH>");
        boolean anyMatchList = persons.stream().allMatch(this.startsWithPredicate);
        System.out.println(anyMatchList);
        System.out.println("</ALL MATCH>");
    }
    
    public void withNoneMatch(List<Person> persons) {
        System.out.println("<NONE MATCH>");
        boolean anyMatchList = persons.stream().noneMatch(this.startsWithPredicate);
        System.out.println(anyMatchList);
        System.out.println("</NONE MATCH>");
    }
    
    public int getAge(LocalDate birthDate) {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
    
    public void printList(List<?> list) {
        list.forEach(System.out::println);
    }
    
}
