package com.halconbit.challenge.java.simple;

/**
 * @author Brayan Esteves
 * Challenge:
 * Write a program that allows an exchange between two variables.
 * For example: If a variable 'number' is 35, and a variable 'number2' is 20, 
 * perform the necessary actions so that 'number' becomes 20 and 'number2' becomes 35. 
 * Once the change has been made, show the result.
 */
public class NumberExchange {
    
    public static void main(String[] args) {
        
        int num1 = 35;
        int num2 = 20;
        int aux;
        
        System.out.println("-----<BEFORE>-----");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        System.out.println("-----</BEFORE>-----");
        System.out.println();
        System.out.println("-----<AFTER>-----");
        aux  = num2;
        num2 = num1;
        num1 = num2;
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        System.out.println("-----</AFTER>-----");
        
    }
    
}

