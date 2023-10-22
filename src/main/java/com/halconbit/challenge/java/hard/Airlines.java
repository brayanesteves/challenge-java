package com.halconbit.challenge.java.hard;

import java.util.Scanner;

/**
 * @author Brayan Esteves
 * Challenge:
 * [ENGLISH]:
 * A flight company has 6 destinations to which it operates 3 flights daily, one
 * in the morning, another at noon and another at night. To manage this data, it
 * uses a matrix, where each row is a destination and in each column the number
 * of available seats is stored. For example:
 *                     0        1       2
 *                  Morning Afternoon Night 
 * 0 Rio de Janeiro   120      15      30
 * 1 Cancún            65       1       2
 * 2 Madrid             4      52       7
 * 3 Rome              46      32      16
 * 4 Milan             64      23      11
 * 5 Iguarú            61      12      91
 * i. A program is needed that allows the matrix to be loaded with the number of
 *    seats for each flight.
 * ii. At the same time, the program must allow a user to enter the destination
 *     number they want to go to, the flight number (Depending if they want to
 *     travel in the morning, at noon or at night) and the number of tickets
 *     they need.
 * iii. Based on the user's request, the program must check if there are enough
 *      seats for the number of tickets required. If so, a message should be
 *      displayed on the screen saying "your reservation was successfully made"
 *      and the seats requested by the user should be deducted from the total seats.
 *      If there are no more available seats, an error message should be displayed
 *      saying "sorry, we could not complete your operation because there are no
 *      seats available".
 * The airline company states that they DO NOT KNOW how many sales/reservations
 * are made per day. Therefore, to finish sales, the word "finish" is entered.
 * [=======]
 * [SPANISH]:
 * Una compañia de vuelos cuenta con 6 destinos a los que realiza 3 vuelos diariamente,
 * uno por la mañana, otro al mediodia y otro por la noche. Para adminsitrar estos
 * datos, utiliza una matriz, donde cada fila es un destino y en cada columna se
 * guarda la cantidad de asientos disponibles. Por ejemplo:
 *                    0       1       2
 *                  Mañana Mediodía Noche
 * 0 Rio de Janeiro   120     15     30
 * 1 Cancún            65      1      2
 * 2 Madrid             4     52      7
 * 3 Roma              46     32     16
 * 4 Milán             64     23     11
 * 5 Iguarú            61     12     91
 * i. Se necesita un programa que permita la carga de la matriz con la cantidad
 *    de asientos para cada vuelo.
 * ii. Al mismo tiempo, el programa debe permitir a un usuario ingresar el número
 *     de destino al que quiere dirigirse, el número de vuelo (Dependiendo si
 *     quiere viajar a la mañana, al mediodia o a la noche) y la cantidad de
 *     pasajes que necesita.
 * iii. A partir de la solicitud del usuario, el programa debe controlar si hay
 *      la cantidad suficiente de asientos para la cantidad de pasajes que se
 *      requiere. En caso de que así sea, se debe mostrar un cartel por pantalla
 *      que diga "su reserva fue realizada con éxito" y se debe descontar del total
 *      de asientos los solicitados por el usuario. En caso de no haber más asientos
 *      disponibles, se debe informar otro cartel que diga "disculpe, no se pudo
 *      completar su operación dado que no hay asientos disponibles".
 * Desde la compañia de vuelos, manifiestan que NO CONOCEN cuantas ventas/reservas
 * se hacen por día. Por lo cual, para finalizar las ventas se ingresa la palabra
 * "finish".
 */
public class Airlines {

    public static void main(String[] args) {
        
        // We create the matrix.
        int flights[][] = new int[6][3];
        
        Scanner keyboard_int = new Scanner(System.in);
        
        // We load the matrix.
        for(int row = 0; row < 6; row++) {
            for(int column = 0; column < 3; column++) {
                System.out.println("Enter the number of seats for the destination." + row + " Schedule " + column);
                flights[row][column] = keyboard_int.nextInt();
            }
        }
        
        // Seat sales.
        Scanner keyboard_string = new Scanner(System.in);
        String  flag            = "";
        int     destination, schedule, seats;
        
        while(!flag.equalsIgnoreCase("finish")) {
            System.out.println("Enter the destination number.");
            destination = keyboard_int.nextInt();
            
            System.out.println("Enter the flight schedule.");
            schedule    = keyboard_int.nextInt();
            
            System.out.println("Enter the seats number.");
            seats       = keyboard_int.nextInt();
            
            if(destination >= 0 && destination <= 5) {
                if(schedule >= 0 && schedule <= 2) {
                    
                    if(flights[destination][schedule] >= seats) {
                        System.out.println("Your reservation was successfully made.");
                        flights[destination][schedule] = flights[destination][schedule] - seats;
                    } else {
                        System.out.println("Sorry, we could not complete your operation because there are no seats available.");
                    }
                    
                } else {
                    System.out.println("Schedule does not exist. Enter between 0 and 2.");
                }
            } else {
                System.out.println("Destination does not exist. Enter between 0 and 5.");
            }
            
            System.out.println("Do you want to continue booking? Enter \"finish\" to finish or enter any value to continue.");
            flag = keyboard_string.next();
            
        }
        
    }
    
}
