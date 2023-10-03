package com.halconbit.challenge.java.oop.GamePokemon.controller;

import com.halconbit.challenge.java.oop.GamePokemon.dto.Pokemon;
import com.halconbit.challenge.java.oop.GamePokemon.interfaces.IFire;

public class Charmander extends Pokemon implements IFire {
    
    public Charmander() {
        
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
    
    // <Class [Interface]: IFire>
    @Override
    public void attackFireFist() {
        System.out.println("Hello, I am Bulbasaur and it's my attack - fire fist.");
    }
    
    @Override
    public void attackLaunchesFlames() {
        System.out.println("Hello, I am Bulbasaur and it's my attack - launches flames.");
    }
    
    @Override
    public void attackEmbers() {
        System.out.println("Hello, I am Bulbasaur and it's my attack - embers.");
    }
    // </Class [Interface]: IFire>
    
}