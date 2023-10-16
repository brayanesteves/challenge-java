package com.halconbit.challenge.java.simple;

/**
 * @author Brayan Esteves
 * Challenge:
 * [ENGLISH]:
 * Carry out a program that includes a vector that stores the names: Alejandra,
 * Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa and Ludmila. Perform a pass
 * of the vector to load the data and another pass to display them on the screen.
 * [=======]
 * [SPANISH]:
 * Llevar a cabo un programa que incluya un vector que almacene los nombres:
 * Alejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa y Ludmila.
 * Realizar un recorrido del vector, para cargar los datos y otro recorrido para
 * mostrar los mismos por pantalla.
 */
public class ArrayNames {

    public static void main(String[] args) {
        
        String vector[] = new String[8];
        
        vector[0] = "Alejandra";
        vector[1] = "Leonardo";
        vector[2] = "Rosa";
        vector[3] = "Guillermo";
        vector[4] = "Gabriel";
        vector[5] = "Daniel";
        vector[6] = "Luisa";
        vector[7] = "Ludmila";
        
        for(int i = 0; i <= vector.length; i++) {
            System.out.println("In the position: " + i + " There is the name: " +vector[i]);
        }
        
    }
    
}
