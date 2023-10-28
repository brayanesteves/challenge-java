package com.halconbit.challenge.java.oop.SalesOfProducts.controller;

import com.halconbit.challenge.java.oop.SalesOfProducts.model.Person;
import com.halconbit.challenge.java.oop.SalesOfProducts.model.Product;
import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lambda {
    
    // Variables 'Global'.
    private Comparator<Person> byNameDesc          = (Person object_1, Person object_2) -> object_2.getName().compareTo(object_1.getName());
    private Comparator<Person> byNameAsc           = (Person object_1, Person object_2) -> object_1.getName().compareTo(object_2.getName());
    private Predicate<Person>  startsWithPredicate = person -> person.getName().startsWith("J");
    private int                pageNumber          = 0;
    private int                pageSize            = 2;    
    
    public void withForEachLambda_ClassPerson(List<Person> persons) {
        System.out.println("<FOR EACH - LAMBDA>");
        persons.forEach(System.out::println);
        System.out.println("</FOR EACH - LAMBDA>");
    }
    
    public void withFilter_ClassPerson(List<Person> persons) {
        System.out.println("<FILTER>");
        List<Person> filteredList = persons.stream().filter(person -> this.getAge(person.getDateOfBirth()) >= 18).collect(Collectors.toList());
        this.printList(filteredList);
        System.out.println("</FILTER>");
    }
    
    public void withMap_ClassPerson(List<Person> persons) {
        System.out.println("<MAP>");
        List<Integer> mapList = persons.stream().map(person -> this.getAge(person.getDateOfBirth())).collect(Collectors.toList());
        this.printList(mapList);
        System.out.println("</MAP>");
    }
    
    public void withFilterMap_ClassPerson(List<Person> persons) {
        System.out.println("<FILTER & MAP>");
        List<Integer> filterMapList = persons.stream().filter(person -> this.getAge(person.getDateOfBirth()) >= 18).map(person -> this.getAge(person.getDateOfBirth())).collect(Collectors.toList());
        this.printList(filterMapList);
        System.out.println("</FILTER & MAP>");
    }
    
    public void withMapOnPrefix_ClassPerson(List<Person> persons) {
        System.out.println("<MAP ON PREFIX>");
        List<String> mapOnPrefixList = persons.stream().map(person -> "Coder " + person.getName()).collect(Collectors.toList());
        this.printList(mapOnPrefixList);
        System.out.println("</MAP ON PREFIX>");
    }
    
    public void withSortedAsc_ClassPerson(List<Person> persons) {
        System.out.println("<SORTED: ASC>");
        List<Person> sortedList = persons.stream().sorted(this.byNameAsc).collect(Collectors.toList());
        this.printList(sortedList);
        System.out.println("</SORTED: ASC>");
    }
    
    public void withSortedDesc_ClassPerson(List<Person> persons) {
        System.out.println("<SORTED: DESC>");
        List<Person> sortedList = persons.stream().sorted(this.byNameDesc).collect(Collectors.toList());
        this.printList(sortedList);
        System.out.println("</SORTED: DESC>");
    }
    
    public void withAnyMatch_ClassPerson(List<Person> persons) {
        System.out.println("<ANY MATCH>");
        boolean anyMatchList = persons.stream().anyMatch(this.startsWithPredicate);
        System.out.println(anyMatchList);
        System.out.println("</ANY MATCH>");
    }
    
    public void withAllMatch_ClassPerson(List<Person> persons) {
        System.out.println("<ALL MATCH>");
        boolean allMatchList = persons.stream().allMatch(this.startsWithPredicate);
        System.out.println(allMatchList);
        System.out.println("</ALL MATCH>");
    }
    
    public void withNoneMatch_ClassPerson(List<Person> persons) {
        System.out.println("<NONE MATCH>");
        boolean noneMatchList = persons.stream().noneMatch(this.startsWithPredicate);
        System.out.println(noneMatchList);
        System.out.println("</NONE MATCH>");
    }
    
    public void withSkip_ClassPerson(List<Person> persons) {
        System.out.println("<SKIP>");
        List<Person> skipList = persons.stream().skip(this.pageNumber).collect(Collectors.toList());
        this.printList(skipList);
        System.out.println("</SKIP>");
    }
    
    public void withLimit_ClassPerson(List<Person> persons) {
        System.out.println("<LIMIT>");
        List<Person> skipList = persons.stream().limit(this.pageSize).collect(Collectors.toList());
        this.printList(skipList);
        System.out.println("</LIMIT>");
    }
    
    public void withSkipAndLimit_ClassPerson(List<Person> persons) {
        System.out.println("<SKIP & LIMIT>");
        List<Person> skipList = persons.stream().skip(this.pageNumber * this.pageSize).limit(this.pageSize).collect(Collectors.toList());
        this.printList(skipList);
        System.out.println("</SKIP & LIMIT>");
    }
    
    public void withGroupByDouble_ClassProduct(List<Product> products) {
        System.out.println("<GROUP BY: DOUBLE>");
        Map<Double, List<Product>> groupByCollect = products.stream().filter(product -> product.getPriceUnit() > 20.00).collect(Collectors.groupingBy(Product::getPriceUnit));
        System.out.println(groupByCollect);
        System.out.println("</GROUP BY: DOUBLE>");
    }
    
    public void withGroupByString_ClassProduct(List<Product> products) {
        System.out.println("<GROUP BY: STRING>");
        Map<String, List<Product>> groupByCollect = products.stream().filter(product -> product.getPriceUnit() > 20.00).collect(Collectors.groupingBy(Product::getName));
        System.out.println(groupByCollect);
        System.out.println("</GROUP BY: STRING>");
    }
    
    public void withCountingLong_ClassProduct(List<Product> products) {
        System.out.println("<COUNTING: LONG>");
        Map<String, Long> countingCollect = products.stream().collect(Collectors.groupingBy(Product::getName, Collectors.counting()));
        System.out.println(countingCollect);
        System.out.println("</COUNTING: LONG>");
    }
    
    public void groupingByProductNameAndSummingWithDouble_ClassProduct(List<Product> products) {
        System.out.println("<GROUP BY & SUMMING: DOUBLE>");
        Map<String, Double> countingCollect = products.stream().collect(Collectors.groupingBy(Product::getName, Collectors.summingDouble(Product::getPriceUnit)));
        System.out.println(countingCollect);
        System.out.println("</GROUP BY & SUMMING: DOUBLE>");
    }
    
    public void gettingSumAndSummaryWithDouble_ClassProduct(List<Product> products) {
        System.out.println("<SUMMARIZING: DOUBLE SUMMARY STATISTICS>");
        DoubleSummaryStatistics statistics = products.stream().collect(Collectors.summarizingDouble(Product::getPriceUnit));
        System.out.println(statistics);
        System.out.println("</SUMMARIZING: DOUBLE SUMMARY STATISTICS>");
    }
    
    public int getAge(LocalDate birthDate) {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
    
    public void printList(List<?> list) {
        list.forEach(System.out::println);
    }
    
}
