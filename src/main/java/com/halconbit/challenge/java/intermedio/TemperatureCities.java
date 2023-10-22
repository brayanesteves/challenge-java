package com.halconbit.challenge.java.intermedio;

import java.util.Scanner;

/**
 * @author Brayan Esteves
 * Challenge:
 * [ENGLISH]:
 * <b>Three different vectors</b> store the names, minimum and maximum temperatures
 * of 5 cities in the province of Misiones. The first vector stores the names of
 * the cities, the second the minimum temperatures reached and the third the maximum
 * temperatures reached in the last week. A program is needed that allows loading
 * of the cities, their minimum and maximum temperatures; It should also be able
 * to inform on the screen which city had the lowest temperature and which had
 * the highest temperature (Also stating the number of degrees).
 * Example:
 * 1) 'Cities' Vector: Oberá, Posadas, L. N. Alem. [...]
 * 2) 'Minimum temperatures' Vector: 16, 18, 15 [...]
 * 3) 'Maximum temperatures' Vector: 29, 32, 28 [...]
 * [=======]
 * [SPANISH]:
 * En <b>tres vectores diferentes</b> se guardan los nombres, temperaturas mínimas
 * y máximas de 5 ciudades de la provincia de Misiones. En el primer vector se
 * guardan los nombres de las ciudades, en el segundo las temperaturas mínimas
 * alcanzadas y en el tercero las temperaturas máximas alcanzadas en la última semana.
 * Se necesita un programa que permita la carga de las ciudades, sus temperaturas
 * mínimas y máximas; además, deberá poder informar por pantalla cual fue la ciudad
 * con la temperatura más baja y cual con la temperatura más alta (Dando a conocer
 * al mismo tiempo la cantidad de grados).
 * Ejemplo:
 * 1) Vector 'Ciudades': Oberá, Posadas, L. N. Alem. [...]
 * 2) Vector 'Temperaturas mínimas': 16, 18, 15 [...]
 * 3) Vector 'Temperaturas máximas': 29, 32, 28 [...]
 */
public class TemperatureCities {

    public static void main(String[] args) {
        
        // We create the 3 vectors.
        String cities[]  = new String[5];
        Double minimum[] = new Double[5];
        Double maximum[] = new Double[5];
        
        Scanner keyboard_string = new Scanner(System.in);
        Scanner keyboard_double = new Scanner(System.in);
        
        // Load the vectors.
        for(int i = 0; i < cities.length; i++) {
            System.out.println("City Nº[" + i + "] -  Enter the name of the city:");
            cities[i] = keyboard_string.next();
            
            System.out.println("Minimum Nº[" + i + "] -  Enter the minimum of the city:");
            minimum[i] = keyboard_double.nextDouble();
            
            System.out.println("Maximum Nº[" + i + "] -  Enter the maximum of the city:");
            maximum[i] = keyboard_double.nextDouble();
        }
        
        // We determine the minimum.
        Double Minimum         = 9999999.00;
        int    positionMinimum = -1;        
        
        for(int i = 0; i < minimum.length; i++) {
            if(minimum[i] < Minimum) {
                Minimum         = minimum[i];
                positionMinimum = i;
            }
        }
        
        // We determine the maximum.
        Double Maximum         = -9999999.00;
        int    positionMaximum = -1;        
        
        for(int i = 0; i < maximum.length; i++) {
            if(maximum[i] > Maximum) {
                Maximum         = maximum[i];
                positionMaximum = i;
            }
        }
        
        System.out.println("The minimum temperature is: " + Minimum);
        System.out.println("It was registered in the city of: " + cities[positionMinimum]);
        System.out.println("=========");
        System.out.println("The maximum temperature is: " + Maximum);
        System.out.println("It was registered in the city of: " + cities[positionMaximum]);
        
    }
    
}
