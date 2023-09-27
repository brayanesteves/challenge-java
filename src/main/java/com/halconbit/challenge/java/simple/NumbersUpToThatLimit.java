package com.halconbit.challenge.java.simple;

import java.util.Scanner;

/**
 * @author Brayan Esteves
 * Challenge:
 * [ENGLISH]:
 * Make a program that given a numeric limit entered by keyboard (for example 100)
 * shows on the screen all the numbers up to that limit (Starting with 1).
 * [=======]
 * [SPANISH]:
 * Realizar un programa que dado por treclado un limite numerico por teclado (por ejemplo 100)
 * muestre en pantalla todos los números hasta ese limite (Empezando por 1).
 */
public class NumbersUpToThatLimit {
    
    public static void main(String[] args) {
        
        // We have a limit, the one we have to count up to. 
        // Enter that limit.
        
        System.out.println("Enter the limit, the one you want to count up to.");
        Scanner keyboard = new Scanner (System.in);
        int limit = keyboard.nextInt();
        int count = 1;
        
        System.out.println("-----<WHILE>-----");
        while(count <= limit) {
            System.out.println(count);
            // count = count + 1;
            count++;
        }
        System.out.println("-----</WHILE>-----");
    }
    
}