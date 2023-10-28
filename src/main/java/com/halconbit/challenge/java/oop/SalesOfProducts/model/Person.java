package com.halconbit.challenge.java.oop.SalesOfProducts.model;

import java.time.LocalDate;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Brayan Esteves
 * Challenge:
 * [ENGLISH]:
 * [=======]
 * [SPANISH]:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    
    private Integer   id;
    private String    name;
    private LocalDate dateOfBirth;
    
}