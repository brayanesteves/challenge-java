package com.halconbit.challenge.java.simple;

/**
 * @author Brayan Esteves
 * Challenge:
 * [ENGLISH]:
 * A <b>even</b> number is one that <b>is divisible by <span style="color:red;">2</span></b>
 * and a <b>odd</b> number is one that <b>is not divisible by <span style="color:red;">2</span></b>.
 * Based on the previous statement, implement an algorithm that allows you to check
 * if a number is even or odd.
 * [=======]
 * [SPANISH]:
 * Un número <b>par</b> es aquel que <b>es divisible en <span style="color:red;">2</span></b>
 * y un número <b>impar</b> es aquel que <b>no es divisible en <span style="color:red;">2</span></b>.
 * Con base a la anterior afirmación, implemente un algoritmo que permite verificar 
 * si un número es para o impar.
 */
public class EvenAndOdd {

    public static void main(String[] args) {
        
        int number = 3;
        
        if(number % 2 == 0) {
            System.out.println("Number: " + number + ". It's even");
        } else {
            System.out.println("Number: " + number + ". It's odd");
        }
        
    }
    
}
