package com.halconbit.challenge.java.simple;

import java.util.Scanner;

/**
 * @author Brayan Esteves
 * Challenge:
 * [ENGLISH]:
 * In a 4 row by 4 column table, the grades of 4 high school students are stored.
 * Each row corresponds to the grades and average of each student. A program is
 * needed that allows a teacher to load, in the 3 positions (Columns) of each row,
 * the grades of the student and that in the last column the averages are calculated.
 * Once the calculations have been made, it is desired to show the 3 grades of
 * each student and the corresponding average, traversing the matrix.
 * [=======]
 * [SPANISH]: * 
 * En una tabla de 4 filas y 4 columnas, se guardan las notas de 4 alumnos de
 * secundaria. Cada fila corresponde a las notas y al promedio de cada alumno.
 * Se necesita un programa que permita a un profesor cargar,
 * en las 3 posiciones (Columnas) de cada fila, las notas del alumno y que en la
 * última columna se calculen los promedios. Una vez realizados los calculos,
 * se desea mostrar las 3 notas de cada alumno y el promedio correspondiente,
 * recorriendo la matriz.
 */
public class TheGradesOfTheStudent_Matrix {
    
    public static void main(String[] args) {       
        
        Double  matrix [][] = new Double[4][4];
        Scanner keyboard    = new Scanner(System.in);
        Double  addition    = 0.00;
        
        // 
        for(int row = 0; row < 4; row++) {
            for(int column = 0; column < 3; column++) {
                System.out.println("Enter the student Nº " + row);
                matrix[row][column] = keyboard.nextDouble();
                addition            = addition + matrix[row][column];
            }
            // Load average in last column.
            matrix[row][3] = addition / 3;
            // Reset.
            addition = 0.00;
        }
        
        // Load average in last column.
        for(int row = 0; row < 4; row++) {
            System.out.println("Student's notes Nº " + row + " are: ");
            for(int column = 0; column < 3; column++) {
                System.out.println("Notes Nº " + column + " " + matrix[row][column]);
            }
            System.out.println("The average of the grades is: " + matrix[row][3]);
        }
        
    }
    
}