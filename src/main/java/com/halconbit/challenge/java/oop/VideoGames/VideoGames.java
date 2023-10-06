package com.halconbit.challenge.java.oop.VideoGames;

import com.halconbit.challenge.java.oop.VideoGames.dto.VideoGame;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Brayan Esteves
 * Challenge:
 * [ENGLISH]:
 * Practice Exercise | Exercise: Video Games.
 * Create a class called 'Videojuego', which has the following attributes code,
 * title, console, numberOfPlayers, category (taking into account all its attributes,
 * constructors, 'getters' methods and 'setters').
 * 1) Create an 'ArrayList' of type 'Videojuego'. Create 5 video games and store
 *    them in the collection.
 * 2) Traverse the 'ArrayList' created and display on the screen the title,
 *    console and number of players of the stored video games.
 * 3) Change the name and number of players of two video games. Display on the
 *    screen the data of all the video games, after the change.
 * 4) Traverse the 'ArrayList' and display on the screen only the video games
 *    that are for the "Nintendo 64" console.
 * [=======]
 * [SPANISH]:
 * Ejercicio Práctico | Ejercicio: Videojuegos.
 * Crear una clase llamada 'Videojuego', que tenga los siguientes atributos
 * código, titulo, consola, cantidadJugadores, categoria (tener en cuenta todos
 * sus atributos, constructores, métodos 'getters' y 'setters').
 * 1) Crear un 'ArrayList' de tipo 'Videojuego'. Crear 5 videojuegos y guardarlos
 *    en la 'collection'.
 * 2) Recorrer la 'ArrayList' creada y mostrar por pantalla el titulo, consola y
 *    cantidad de jugadores de los videojuegos almacenados.
 * 3) Cambiar el nombre y la cantidad de jugadores de dos videojuegos. Mostrar
 *    por pantlla los datos de todos los videojuegos, luego del cambio.
 * 4) Recorrer la 'ArrayList' y mostrar por pantalla únicamente a los videojuegos
 *    que sean de la consola "Nintendo 64".
 */
public class VideoGames {
    
    public static void main(String[] args) {
        
        // Step 1.
        System.out.println("=====<STEP Nº1>=====");
        List<VideoGame> listVideogames = new ArrayList<VideoGame>();
        
        VideoGame videoGame1 = new VideoGame(123,      "Banjo Kazooie", "Nintendo 64", 4, "Platform");
        VideoGame videoGame2 = new VideoGame(456,       "Mario Part 3", "Nintendo 64", 4, "Platform");
        VideoGame videoGame3 = new VideoGame(789,   "Age of Empire II",          "PC", 1, "Strategy");
        VideoGame videoGame4 = new VideoGame(101, "Counter Strike 1.6",          "PC", 1, "Shooter");
        VideoGame videoGame5 = new VideoGame(100,      "Mario Kart 64", "Nintendo 64", 4, "Platform");
        
        listVideogames.add(videoGame1);
        listVideogames.add(videoGame2);
        listVideogames.add(videoGame3);
        listVideogames.add(videoGame4);
        listVideogames.add(videoGame5);
        System.out.println("=====</STEP Nº1>=====");
        
        // Step Nº2.
        System.out.println("=====<STEP Nº2>=====");
        for(VideoGame videoGame : listVideogames) {
            System.out.println("Code:[" + videoGame.getCode() + "] | Title:[" + videoGame.getTitle() + "] | Console:[" + videoGame.getConsole() + "] | Number of Players:[" + videoGame.getNumberOfPlayers() + "] |");
        }
        System.out.println("=====</STEP Nº2>=====");
        System.out.println("=================");
        
        // Step Nº3.
        System.out.println("=====<STEP Nº3>=====");
        
        System.out.println("<BEFORE: videoGame1>");
        System.out.println("Code:[" + videoGame1.getCode() + "] | Title:[" + videoGame1.getTitle() + "] | Console:[" + videoGame1.getConsole() + "] | Number of Players:[" + videoGame1.getNumberOfPlayers() + "] |");
        System.out.println("</BEFORE: videoGame1>");
        
        videoGame1.setTitle("Banjo Tooie");
        videoGame1.setNumberOfPlayers(2);
        
        System.out.println("<AFTER: videoGame1>");
        System.out.println("Code:[" + videoGame1.getCode() + "] | Title:[" + videoGame1.getTitle() + "] | Console:[" + videoGame1.getConsole() + "] | Number of Players:[" + videoGame1.getNumberOfPlayers() + "] |");
        System.out.println("</AFTER: videoGame1>");
        
        System.out.println("=================");
        
        System.out.println("<BEFORE: videoGame5>");
        System.out.println("Code:[" + videoGame5.getCode() + "] | Title:[" + videoGame5.getTitle() + "] | Console:[" + videoGame5.getConsole() + "] | Number of Players:[" + videoGame5.getNumberOfPlayers() + "] |");
        System.out.println("</BEFORE: videoGame5>");
        
        videoGame5.setTitle("Super Mario Kart 64");
        videoGame5.setNumberOfPlayers(4);
        
        System.out.println("<AFTER: videoGame5>");
        System.out.println("Code:[" + videoGame5.getCode() + "] | Title:[" + videoGame5.getTitle() + "] | Console:[" + videoGame5.getConsole() + "] | Number of Players:[" + videoGame5.getNumberOfPlayers() + "] |");
        System.out.println("</AFTER: videoGame5>");
        
        System.out.println("=====</STEP Nº3>=====");
        System.out.println("=================");
        
        // Step Nº4.
        System.out.println("=====<STEP Nº4>=====");
        for(VideoGame videoGame : listVideogames) {
            if(videoGame.getConsole().equals("Nintendo 64")) {
                System.out.println(videoGame.toString());
            }
        }
        System.out.println("=====</STEP Nº4>=====");
        
        
    }
    
}
