package com.halconbit.challenge.java.oop.TreeFlowerBush.dto;

/**
 *
 * @author brayan
 */
public class Tree extends Plant {
    
    private String variety;
    private String typeOfTrunk;
    private double trunkRadius;
    private String color;
    private String typeOfLeaves;

    public Tree() {
    }

    public Tree(String variety, String typeOfTrunk, double trunkRadius, String color, String typeOfLeaves,
            // Attributes 'Plant'
            String name, double stemHeight, boolean hasLeaves, String idealClimate) {
        super(name, stemHeight, hasLeaves, idealClimate);
        this.variety      = variety;
        this.typeOfTrunk  = typeOfTrunk;
        this.trunkRadius  = trunkRadius;
        this.color        = color;
        this.typeOfLeaves = typeOfLeaves;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getTypeOfTrunk() {
        return typeOfTrunk;
    }

    public void setTypeOfTrunk(String typeOfTrunk) {
        this.typeOfTrunk = typeOfTrunk;
    }

    public double getTrunkRadius() {
        return trunkRadius;
    }

    public void setTrunkRadius(double trunkRadius) {
        this.trunkRadius = trunkRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypeOfLeaves() {
        return typeOfLeaves;
    }

    public void setTypeOfLeaves(String typeOfLeaves) {
        this.typeOfLeaves = typeOfLeaves;
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
        System.out.println("Hello I am a tree.");
    }    
    
}