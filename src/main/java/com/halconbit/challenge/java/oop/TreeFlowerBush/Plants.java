package com.halconbit.challenge.java.simple;

import java.util.Scanner;

/**
 * @author Brayan Esteves
 * Challenge:
 * [ENGLISH]:
 * Exercise 1.
 * 1) Create a 'Plant' class with the following attributes: name, stem height,
 *    hasLeaves, ideal climate (With their corresponding methods and constructors).
 * 2) Create its child classes that share their attributes and methods:
 * 2.A) Tree: variety, type of trunk, trunk radius, color, type of leaves.
 * 2.B) Flower: color of petals, average number of petals, color of pistil,
 *      color of petals, flower variety, season that blooms.
 * 2.C) Bush: Bush width, isDomestic, bush variety, leaf color, isPrunedOrNot.
 * 3) Once the classes have been created, create the following methods:
 * 3.A) Tree: method to display a message on screen saying "Hello I am a tree".
 * 3.B) Flower: method to display a message on screen saying "Hello I am a flower".
 * 3.C) Bush: method to display a message on screen saying "Hello I am a bush".
 * 4) Create an object of each child class in the 'Main'. Call the 3 methods
 *    from each object.
 * 5) Change the access modifier of the methods from 'public' to 'private'.
 *    Try to access these methods from the 'main'.
 * [=======]
 * [SPANISH]:
 * Ejercicio Nº1.
 * 1) Crear una clase 'Planta' con los atributos: nombre, alto del tallo,
 *    tieneHojas, clima ideal (Con sus métodos y constructores correspondientes).
 * 2) Crear sus clases hijas que compartan sus atributos y métodos:
 * 2.A) Árbol: variedad, tipo de tronco, radio de tronco, color, tipo de hojas.
 * 2.B) Flor: color de pétalos, cantidad promedio de pétalos, color del pistilo,
 *      color de los pétalos, variedad de flor, estación que florece.
 * 2.C) Arbusto: Ancho arbusto, esDomestico, variedad arbusto, color de hojas, sePodaONo.
 * 3) Una vez creada las clases, crear los siguientes métodos:
 * 3.A) Árbol: método para mostrar un mensaje en pantalla que diga "Hola soy un árbol".
 * 3.B) Flor: método para mostrar un mensaje en pantalla que diga "Hola soy una flor".
 * 3.C) Arbusto: método para mostrar un mensaje en pantalla que diga "Hola soy un arbusto".
 * 4) Crear en el 'Main' un objeto de cada clase hija. Llamar a los 3 métodos
 *    desde cada objeto.
 * 5) Cambiar el modificador de acceso de los métodos de 'public' a 'private'.
 *    Intentar acceder desde el 'main' a estos métodos.
 */
public class Plants {
    
    public static void main(String[] args) {
        
        Tree   tree   = new Tree();
        Flower flower = new Flower();
        Bush   bush   = new Bush();
        
        tree.sayWhatIAm();
        flower.sayWhatIAm();
        bush.sayWhatIAm();
    }
    
}
