package com.halconbit.challenge.java.intermedio;

import java.util.Scanner;

/**
 * @author Brayan Esteves
 * Challenge:
 * [ENGLISH]:
 * In the city of Oberá, Misiones, the "Marathon of the Immigrant" is held every
 * year as part of the National Immigrant Festival. The event has a day of
 * registrations the day before the race, so the exact number of registrants
 * that may come is unknown.
 * From the Federation of Communities (the organizing body), they stated that the
 * following data is requested for the registration of each participant:
 * dni (national identity document number), name and age.
 * As for the possible categories for a registration, the following are handled:
 * 1) Minors A (From 6 to 10 years old).
 * 2) Minors B (From 11 to 17 years old).
 * 3) Youth (From 18 to 30 years old).
 * 4) Adults (From 31 to 50 years old).
 * 5) Older adults (Over 50 years old).
 * A program is needed that, based on the entry of the data and age of each
 * participant, shows on screen which category the participant must be registered in.
 * It should be noted that, to end registrations at the end of the day, a dni
 * with the value 0 and a name with the word "end" must be entered.
 * [=======]
 * [SPANISH]:
 * En la cantidad de Oberá, Misiones se realiza año a año, la "Maratón de Inmigrante"
 * en el marco de la Fiesta Nacional de Inmigrante. El evento cuenta con un día
 * de inscripciones el día anterior a la carrera, por lo que se desconoce la
 * cantidad exacta de inscriptos que puede llegar a haber.
 * Desde la Federación de Colectividades (Organismo que organiza), manifestaron
 * que se solicitan los siguientes datos para la inscripción de cada participante:
 * dni, nombre y edad.
 * En cuanto a las categorias posibles para una inscripción, se manejan las
 * siguientes:
 * 1) Menores A (De 6 a 10 años).
 * 2) Menores B (De 11 a 17 años).
 * 3) Juveniles (De 18 a 30 años).
 * 4) Adultos (De 31 a 50 años).
 * 5) Adultos mayores (Mayores de 50 años).
 * Se necesita un programa que, a partir del ingreso de los datos y edad de cada
 * participante, se muestre por pantalla a qué categoria debe ser inscripto.
 * Cabe destacar que, al finalizar el día, para dar fin a las inscripciones, se
 * debe ingresar un dni con el valor 0 y un nombre con la palabra "fin".
 */
public class ImmigrantMarathon {
    
    public static void main(String[] args) {
        
  
        // 1) Request data from people: National Identity Document number, name and age.
        Scanner keyboard_string = new Scanner(System.in);
        Scanner keyboard_integer = new Scanner(System.in);
        
        System.out.println("Enter the person 'National Identify Document Number': ");
        String nationalIdentifyDocumentNumber = keyboard_string.nextLine();
        System.out.println("Enter the person 'Name': ");
        String name = keyboard_string.nextLine();
        System.out.println("Enter the person 'Age': ");
        int age = keyboard_integer.nextInt();
        
        // 2) Determine which category the person has to register for.
        while((!nationalIdentifyDocumentNumber.equals("0")) && (!name.equalsIgnoreCase("end"))) {
            // 3) Inform the person.
            if(age >= 6 && age <= 10) {
                System.out.println("The category: Minors A.");
            } else {
                if(age >= 11 & age <= 17) {
                    System.out.println("The category: Minors B.");
                } else {
                    if(age >= 18 && age <= 30) {
                        System.out.println("The category: Youth.");
                    } else {
                        if(age >= 31 && age <= 50) {
                            System.out.println("The category: Adults.");
                        } else {
                            if(age >= 51) {
                                System.out.println("The category: Older adults.");
                            } else {
                                System.out.println("The person does not have the indicated age.");
                            }
                        }
                    }
                }
            }
            
            // 4) We do not know the amount of people.
            System.out.println("Enter the person 'National Identify Document Number': ");
            nationalIdentifyDocumentNumber = keyboard_string.nextLine();
            System.out.println("Enter the person 'Name': ");
            name = keyboard_string.nextLine();
            System.out.println("Enter the person 'Age': ");
            age = keyboard_integer.nextInt();
            System.out.println("=========");
            System.out.println("National Identify Document Number: " + nationalIdentifyDocumentNumber);
            System.out.println("Name: " + name);
        }
    }
    
}
