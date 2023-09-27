package com.halconbit.challenge.java.simple;

import java.util.Scanner;

/**
 * @author Brayan Esteves
 * Challenge:
 * [ENGLISH]:
 * Make a program that allows loading 15 numbers into an array. Once loaded,
 * the program needs to count and report on the screen how many times the number
 * 3 was loaded.
 * [=======]
 * [SPANISH]:
 * Realizar un programa que permita cargar 15 número en un vector. Una vez cargados,
 * se necesita que el programa cuente en informe por pantalla cuantas veces se
 * cargo el numero 3.
 */
public class Loading15NumbersIntoAnArray {
    
    public static void main(String[] args) {
        
        int vector [] = new int [15];
        System.out.print("Enter a number for the vector: ");
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("-----<FOR Nº0>-----");
        // Load our vector.
        for(int i = 0; i < 15; i++) {
            vector[i] = keyboard.nextInt();
        }
        System.out.println("-----</FOR Nº0>-----");
        
        System.out.println("===================");
        
        // Go through and count how many number 3 exists.
    
        System.out.println("-----<FOR Nº1>-----");
        int count = 0;
        // Load our vector.
        for(int i = 0; i < 15; i++) {
            if(vector[i] == 3) {
                // count = count + 1;
                count++;
            }
        }
        System.out.println("-----</FOR Nº1>-----");
        System.out.println("===================");
        System.out.println("The amount of number 3s that exist in the vector is: " + count);
        
    }
    
}