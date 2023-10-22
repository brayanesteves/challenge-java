package com.halconbit.challenge.java.simple;

/**
 * @author Brayan Esteves
 * Challenge:
 * [ENGLISH]:
 * Carry out a program that allows loading completely with the number 5 a matrix
 * of 4x5 (4 rows, 5 columns).
 * [=======]
 * [SPANISH]:
 * Llevar a cabo un programa que permite cargar completamente con números 5 una
 * matriz de 4x5 (4 filas, 5 columnas).
 */
public class FillMatrix4x5 {
    
    public static void main(String[] args) {
        
        // We create.
        int matrix[][] = new int[4][5];
        
        // We fill with number 5.
        for(int row = 0; row < 4; row++) {
            for(int column = 0; column < 5; column++) {
                matrix[row][column] = 5;
            }
        }
        
        // Display on screen.
        for(int row = 0; row < 4; row++) {
            for(int column = 0; column < 5; column++) {
                System.out.println("[" + row + "]" + "[" + column + "] :" + matrix[row][column]);
            }
        }
        
    }
    
}
