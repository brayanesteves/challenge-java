package com.halconbit.challenge.java.oop.TreeFlowerBush.dto;

public class Flower extends Plant {
    
    private String colorOfPetals;
    private int    averageNumberOfPetals;
    private String colorOfPistil;
    private String flowerVariety;
    private String seasonThatBlooms;

    public Flower() {
    }

    public Flower(String colorOfPetals, int averageNumberOfPetals, String colorOfPistil, String flowerVariety, String seasonThatBlooms,
            // Attributes 'Plant'
            String name, double stemHeight, boolean hasLeaves, String idealClimate) {
        super(name, stemHeight, hasLeaves, idealClimate);
        this.colorOfPetals         = colorOfPetals;
        this.averageNumberOfPetals = averageNumberOfPetals;
        this.colorOfPistil         = colorOfPistil;
        this.flowerVariety         = flowerVariety;
        this.seasonThatBlooms      = seasonThatBlooms;
    }

    public String getColorOfPetals() {
        return colorOfPetals;
    }

    public void setColorOfPetals(String colorOfPetals) {
        this.colorOfPetals = colorOfPetals;
    }

    public int getAverageNumberOfPetals() {
        return averageNumberOfPetals;
    }

    public void setAverageNumberOfPetals(int averageNumberOfPetals) {
        this.averageNumberOfPetals = averageNumberOfPetals;
    }

    public String getColorOfPistil() {
        return colorOfPistil;
    }

    public void setColorOfPistil(String colorOfPistil) {
        this.colorOfPistil = colorOfPistil;
    }

    public String getFlowerVariety() {
        return flowerVariety;
    }

    public void setFlowerVariety(String flowerVariety) {
        this.flowerVariety = flowerVariety;
    }

    public String getSeasonThatBlooms() {
        return seasonThatBlooms;
    }

    public void setSeasonThatBlooms(String seasonThatBlooms) {
        this.seasonThatBlooms = seasonThatBlooms;
    }
    
    
    
    // <ATTRIBUTE: PLANT>
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStemHeight() {
        return stemHeight;
    }

    public void setStemHeight(double stemHeight) {
        this.stemHeight = stemHeight;
    }

    public boolean isHasLeaves() {
        return hasLeaves;
    }

    public void setHasLeaves(boolean hasLeaves) {
        this.hasLeaves = hasLeaves;
    }

    public String getIdealClimate() {
        return idealClimate;
    }

    public void setIdealClimate(String idealClimate) {
        this.idealClimate = idealClimate;
    }   
    // </ATTRIBUTE: PLANT>
    
    @Override
    public void sayWhatIAm() {
        System.out.println("Hello I am a flower.");
    }
    
}