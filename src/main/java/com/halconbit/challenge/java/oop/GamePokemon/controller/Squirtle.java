package com.halconbit.challenge.java.oop.GamePokemon.controller;

public class Squirtle extends Pokemon implements IWater {
    
    public Squirtle() {
        
    }
    
    // <Class [Abstract]: Pokemon>
    @Override
    protected void attackTackle() {
        System.out.println("Hello, I am Bulbasaur and it's my attack - tackle.");
    }
    
    @Override
    protected void attackScratch() {
        System.out.println("Hello, I am Bulbasaur and it's my attack - scartch.");
    }
    
    @Override
    protected void attackBite() {
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