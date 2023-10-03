package com.halconbit.challenge.java.oop.GamePokemon;

import java.util.Scanner;

/**
 * @author Brayan Esteves
 * Challenge:
 * [ENGLISH]:
 * [=======]
 * [SPANISH]:
 */
public class GamePokemon {
    
    public static void main(String[] args) {        
        
        Squirtle   squirtle   = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur  bulbasaur  = new Bulbasaur();
        Pikachu    pikachu    = new Pikachu();
        
        System.out.println("<POKEMON: ATTACK>");
        squirtle.attackBite();
        squirtle.attackHydroBomb();
        System.out.println("=============");
        charmander.attackBite();
        charmander.attackLaunchesFlames();
        System.out.println("=============");
        bulbasaur.attackBite();
        bulbasaur.attackDrainage();
        System.out.println("=============");
        pikachu.attackBite();
        pikachu.attackImpactThunder();
        System.out.println("</POKEMON: ATTACK>");
        
    }
    
}

