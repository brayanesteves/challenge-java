package com.halconbit.challenge.java.oop.GamePokemon.controller;

import com.halconbit.challenge.java.oop.GamePokemon.dto.Pokemon;
import com.halconbit.challenge.java.oop.GamePokemon.interfaces.IElectrical;

public class Pikachu extends Pokemon implements IElectrical {
    
    public Pikachu() {
        
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
    
    // <Class [Interface]: IElectrical>
    @Override
    public void attackImpactThunder() {
        System.out.println("Hello, I am Bulbasaur and it's my attack - impact thunder.");
    }
    
    @Override
    public void attackThunderFist() {
        System.out.println("Hello, I am Bulbasaur and it's my attack - thunder fist.");
    }
    // </Class [Interface]: IElectrical>
    
}