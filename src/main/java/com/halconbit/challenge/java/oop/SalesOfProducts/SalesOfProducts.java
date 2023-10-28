package com.halconbit.challenge.java.oop.SalesOfProducts;

import com.halconbit.challenge.java.oop.SalesOfProducts.controller.Functional;
import com.halconbit.challenge.java.oop.SalesOfProducts.controller.Lambda;
import com.halconbit.challenge.java.oop.SalesOfProducts.model.Person;
import com.halconbit.challenge.java.oop.SalesOfProducts.model.Product;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * @author Brayan Esteves
 * Challenge:
 * [ENGLISH]:
 * [=======]
 * [SPANISH]:
 */
public class SalesOfProducts {

    public static void main(String[] args) {
        
        Person person_0 = new Person(0,  "Mito", LocalDate.of(1991, 1, 21));
        Person person_1 = new Person(1,  "Code", LocalDate.of(1990, 2, 21));
        Person person_2 = new Person(2, "Jaime", LocalDate.of(1980, 6, 23));
        Person person_3 = new Person(3,  "Duke", LocalDate.of(2019, 5, 15));
        Person person_4 = new Person(4, "James", LocalDate.of(2010, 1,  4));
        
        Product product_0 = new Product(1,       "Ceviche", 15.0);
        Product product_1 = new Product(2,   "Chilaquiles", 25.50);
        Product product_2 = new Product(3, "Bandeja Paisa", 35.50);
        Product product_3 = new Product(4,       "Ceviche", 15.0);
        
        List<Person>  persons  = Arrays.asList(person_0, person_1, person_2, person_3, person_4);
        List<Product> products = Arrays.asList(product_0, product_1, product_2, product_3);
        
        // Imperative.
        // Functional.
        Functional functional = new Functional();
        Lambda     lambda     = new Lambda();
        
        functional.withFor(persons);
        functional.withForEach(persons);
        
        lambda.withForEachLambda(persons);        
        
        // Lambda. Method reference.
        // list.forEach(System.out::println);        
        
        // 1 - Filter (param: Predicate).
        lambda.withFilter(persons);
        
        // 2 - Map (param: Function).
        lambda.withMap(persons);
        
        // 2.1 - Filter with map.
        lambda.withFilterMap(persons);
        
        // 2.2 - Map on prefix.
        lambda.withMapOnPrefix(persons);
        
        // 3 - Sorted (param: Comparator).
        // A) Asc.
        lambda.withSortedAsc(persons);
        // B) Desc.
        lambda.withSortedDesc(persons);
        
        // 4 - Match (param: Predicate).
        // 4.1 - anyMatch: Does not evaluate the entire stream, finishes on the match.
        lambda.withAnyMatch(persons);
        // 4.2 - allMatch: Evaluates the entire stream, under the condition. 
        lambda.withAllMatch(persons);
        // 4.3 - noneMatch: Evaluates the entire stream, under the condition.
        lambda.withNoneMatch(persons);
        
        // 5 - Limit/Skip.
        // 5.1 - Skip.
        lambda.withSkip(persons);
        // 5.2 - Limit.
        lambda.withLimit(persons);
        
    }    
    
}
