package com.halconbit.challenge.java.oop.Amphitheatre;

import com.halconbit.challenge.java.oop.Amphitheatre.logic.Ticket;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * @author Brayan Esteves
 * Challenge:
 * [ENGLISH]:
 * Practice Exercise.
 * TRAINEE Technical Test.
 * 2nd Part - OOP.
 * Based on the same scenario of the seat reservation system for an amphitheater,
 * the time has come to propose the "ticket system" that each person will obtain
 * when reserving their seat. For this, consider the following:
 * 1) Create the "template" necessary to store the following data per ticket,
 *    number, row, seat, purchase date, validity date, price.
 * 2) Use a "logical database" through some data structure that allows storing
 *    an undetermined number of tickets. Load a series of tickets into said structure.
 * 3) Create a method that goes through the selected structure and sums the prices
 *    of all tickets. Show the total on screen. GUI is not necessary for this.
 * 4) Ask the user to enter a row number. Based on this, display on screen the
 *    data of the tickets belonging to that row. GUI is not necessary for this.
 * 5) Considerations: Neither GUI nor DB implementation is necessary. 100% logical
 *    handling of application development will be evaluated.
 * 6) Extra: In case you want to add a "template" for clients with the following
 *    data: id, identity document, name, surname. How would it be implemented?
 *    In what way would it relate to the ticket so that it has the data of the
 *    client assigned to it? Carry out the implementation.
 * [=======]
 * [SPANISH]:
 * Ejercicio Práctico.
 * Prueba técnica TRAINEE.
 * 2da Parte - POO.
 * Basándose en el mismo escenario del sistema de reserva de asientos para un
 * anfiteatro, llegó el momento de plantear el "sistema de tickets" que obtendrá
 * cada persona al reservar su asiento. Para ello, tener en cuenta lo siguiente:
 * 1) Crear la "plantilla" necesaria para guardar los siguientes datos por ticket,
 *    número, fila, asiento, fecha de compra, fecha de validez, precio.
 * 2) Usar una "base de datos lógica" mediante  alguna estructura de datos que
 *    permita almacenar un número indeterminado de tickets.Cargar una serie de
 *    tickets a dicha estructura.
 * 3) Crear un método que recorra la estructura seleccionada y sume los precios
 *    de todos los tickets. Mostrar por pantalla el total. No es necesario usar
 *    IGU para esto.
 * 4) Solicitar el usuario que ingrese un número de fila. A partir de esto, mostrar
 *    por pantalla los datos de los tickets pertenecientes a esa fila. No es
 *    necesario usar IGU para esto.
 * 5) Consideraciones: No es necesaria implementación ni de IGU ni de BD. Se
 *    evaluará 100% el manejo lógico del desarrollo de la aplicación.
 * 6) Extra: En caso que se desee agregar una "plantilla" para clientes con los
 *    datos: id, documento de identidad, nombre, apellido. ¿Cómo se implementaría?
 *    ¿De qué manera se relacionaría con ticket para que el mismo posea los datos
 *    del cliente que tiene asignado? Realizar la implementación.
 */
public class Amphitheatre {
    
    public static void main(String[] args) {
        
        // Point 1.
        // Database logic.
        List<Ticket> listTickets = new ArrayList<Ticket>();
        
        // Point 2.
        Ticket ticket_0 = new Ticket(12, 2, 3, new Date(), new Date(), 1500);
        Ticket ticket_1 = new Ticket(13, 2, 4, new Date(), new Date(), 1500);
        Ticket ticket_2 = new Ticket();
        ticket_2.setNumber(20);
        ticket_2.setRow(5);
        ticket_2.setSeat(1);
        ticket_2.setPurchaseDate(new Date());
        ticket_2.setValidityDate(new Date());
        ticket_2.setPrice(2300);
        
        listTickets.add(ticket_0);
        listTickets.add(ticket_1);
        listTickets.add(ticket_2);
        
        // Point 3.
        // Sums the price.
        double sumsTheTicket = 0;
        for(Ticket ticket : listTickets) {
            sumsTheTicket = sumsTheTicket + ticket.getPrice();
        }
        System.out.println("Sums the price is: " + sumsTheTicket);
        
        // Point 4.
        // Search ticket.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter row at search.");
        int     row  = keyboard.nextInt();
        boolean flag = false;
        for(Ticket ticket : listTickets) {
            if(ticket.getRow() == row) {
                System.out.println(ticket.toString());
                flag = true;
            }
        }
        
        if(!flag) {
            System.out.println("Not found data in the row.");
        }
    }
    
}
