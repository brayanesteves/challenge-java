package com.halconbit.challenge.java.oop.TreeFlowerBush.dto;

public abstract class Plant {
    
    private String  name;
    private double  stemHeight;
    private boolean hasLeaves;
    private String  idealClimate;

    public Plant() {
    }

    public Plant(String name, double stemHeight, boolean hasLeaves, String idealClimate) {
        this.name         = name;
        this.stemHeight   = stemHeight;
        this.hasLeaves    = hasLeaves;
        this.idealClimate = idealClimate;
    }

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
    
    protected abstract void sayWhatIAm();
    
}