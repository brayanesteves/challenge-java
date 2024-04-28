package com.halconbit.challenge.java.lambda.java.version.eight.lambda.expressions.functionalinterfaces.supplier;

import java.util.function.Supplier;

public class SupplierExample {
    
    public void supplier_Integer() {
        Supplier<Integer> supplier = () -> (int) (Math.random() * 1000);
        System.out.println("Random Nº0: " + supplier.get());
        System.out.println("Random Nº1: " + supplier.get());
    }
    
}