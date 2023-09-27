package com.halconbit.challenge.java.simple;

import java.util.Scanner;

/**
 * @author Brayan Esteves
 * Challenge:
 * [ENGLISH]:
 * A small pantry wants to calculate the salaries of its employees.
 * The positions of the same can have 3 categories:
 * 1- Stocker,
 * 2 - Cashier,
 * 3 - Supervisor.
 * [•] Stockers earn $15,890.00 ARS + a 10% bonus. 
 * [•] Cashiers earn a fixed $25,630.89 ARS.
 * [•] Supervisors earn a gross $35,560.20 ARS from which 11% is deducted for retirement.
 * A program is needed that, depending on the type of employee in question, 
 * calculates and displays on screen the corresponding salary.
 * [=======]
 * [SPANISH]:
 * Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos de los mismos pueden tener 3 categorias:
 * 1 - repositor,
 * 2 - cajero,
 * 3 - supervisor.
 * [·] Los repositores cobran 15.890,00 ARS + un bono del 10%.
 * [·] Los cajeros cobran 25.630,89 ARS fijos.
 * [·] Los supervisores cobrán 35.560,20 ARS en bruto al cual se les descuenta un 11% de jubilación.
 * Se necesita un programa que, dependiendo del tipo de empleado del que se trate, 
 * calcule y muestre en pantalla el correscpondiente sueldo.
 */
public class SmallGroceryStore {
    
    public static void main(String[] args) {
        double salary = 0.00;
        int category;
        
        System.out.println("Enter the type of category for which you want to calculate the salary.");
        Scanner keyboard = new Scanner (System.in);
        category = keyboard.nextInt();
        
        if(category == 1) {
            salary = 15890.00 + (15890.00 * 0.10);
        } else {
            if(category == 2) {
                salary = 25630.89;
            } else {
                if(category == 3) {
                    salary = 35560.20 - (35560.20 * 0.11);
                } else {
                    System.out.println("You must enter a valid category number.");
                }
            }
        }
        
        if(category == 1 || category == 2 || category == 3) {
            System.out.println("The total salary for the selected category " + category + " .Is equal to: " + salary);
        }
        
    }
    
}

