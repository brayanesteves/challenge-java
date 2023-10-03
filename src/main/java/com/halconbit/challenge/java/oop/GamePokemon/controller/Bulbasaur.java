package com.halconbit.challenge.java.oop.GamePokemon.controller;

import com.halconbit.challenge.java.oop.GamePokemon.dto.Pokemon;
import com.halconbit.challenge.java.oop.GamePokemon.interfaces.IPlant;

public class Bulbasaur extends Pokemon implements IPlant {
    
    public Bulbasaur() {
        
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
    
    // <Class [Interface]: IPlant>
    @Override
    public void attackDrainage() {
        System.out.println("Hello, I am Bulbasaur and it's my attack - drainage.");
    }
    
    @Override
    public void attackParalyze() {
        System.out.println("Hello, I am Bulbasaur and it's my attack - paralyze.");
    }
    // </Class [Interface]: IPlant>
    
}