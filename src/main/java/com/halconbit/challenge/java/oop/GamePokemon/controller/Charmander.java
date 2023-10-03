package com.halconbit.challenge.java.oop.GamePokemon.controller;

public class Charmander extends Pokemon implements IFire {
    
    public Charmander() {
        
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