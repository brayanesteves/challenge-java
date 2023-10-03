package com.halconbit.challenge.java.oop.GamePokemon.controller;

import com.halconbit.challenge.java.oop.GamePokemon.dto.Pokemon;
import com.halconbit.challenge.java.oop.GamePokemon.interfaces.IWater;

public class Squirtle extends Pokemon implements IWater {
    
    public Squirtle() {
        
    }
    
    // <Class [Abstract]: Pokemon>
    @Override
    public void attackTackle() {
        System.out.println("Hello, I am Bulbasaur and it's my attack - tackle.");
    }
    
    @Override
    public void attackScratch() {
        System.out.println("Hello, I am Bulbasaur and it's my attack - scartch.");
    }
    
    @Override
    public void attackBite() {
        System.out.println("Hello, I am Bulbasaur and it's my attack - bite.");
    }
    // </Class [Abstract]: Pokemon>
    
    // <Class [Interface]: IWater>
    @Override
    public void attackHydroBomb() {
        System.out.println("Hello, I am Bulbasaur and it's my attack - hydro bomb.");
    }
    
    @Override
    public void attackBubble() {
        System.out.println("Hello, I am Bulbasaur and it's my attack - bubble.");
    }
    
    @Override
    public void attackWaterGun() {
        System.out.println("Hello, I am Bulbasaur and it's my attack - water gun.");
    }
    // </Class [Interface]: IWater>
    
}