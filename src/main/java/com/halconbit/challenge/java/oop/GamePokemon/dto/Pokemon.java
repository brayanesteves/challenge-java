package com.halconbit.challenge.java.oop.GamePokemon.dto;

public abstract class Pokemon {
    
    protected int    numberPokedex;
    protected String name;
    protected double weight;
    protected String gender;
    protected int    season;
    
    protected abstract void attackTackle();    
    protected abstract void attackScratch();
    protected abstract void attackBite();
}
