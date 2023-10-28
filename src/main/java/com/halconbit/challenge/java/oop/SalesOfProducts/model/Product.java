package com.halconbit.challenge.java.oop.SalesOfProducts.model;

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
public class Product {
    
    private Integer id;
    private String  name;
    private Double  priceUnit;
    
}
