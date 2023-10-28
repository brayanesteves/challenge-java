package com.halconbit.challenge.java.simple;

/**
 * @author Brayan Esteves
 * Challenge:
 * [ENGLISH]:
 * The factorial of an integer greater than 0 is equal to the product of all
 * integers from 1 up to the number for which you want to calculate the factorial.
 * This means that n! = 1x2x3x...x(n-1) x n. In addition, the factorial of 0 is 1.
 * Implement an algorithm that calculates the factorial of a number 'n'.
 * [=======]
 * [SPANISH]:
 * El factorial de un número entero mayor a 0, equivale al producto de todos los
 * números enteros desde 1 hasta el número al que se le desea calcular el factorial.
 * Esto significa que n! = 1x2x3x...x(n-1) x n. Además, el factorial de 0 es 1.
 * Implemente un algoritmo que calcule el factorial de un número 'n'.
 */
public class Factorial {
    
    public static void main(String[] args) {
        
        long n         = 5;
        long factorial = 1;
        
        if(n == 0 || n == 1) {
            System.out.println("Factorial of number " + n + " is: " + factorial);
        } else {
            /**
             * Example of n = 5:
             * 1)  1 * 1 =   1.
             * 2)  1 * 2 =   2.
             * 3)  2 * 3 =   6.
             * 4)  6 * 4 =  24.
             * 5) 24 * 5 = 120.
             */
           for(int i = 1; i < n; i++) {            
               factorial *= i;            
           }

           System.out.println("Factorial of number " + n + " is: " + factorial);
        }        
        
    }
    
}
