package com.halconbit.challenge.java.oop.GamePokemon.controller;

public class Pikachu extends Pokemon implements IElectrical {
    
    public Pikachu() {
        
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