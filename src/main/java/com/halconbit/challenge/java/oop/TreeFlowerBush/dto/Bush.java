package com.halconbit.challenge.java.oop.TreeFlowerBush.dto;

public class Bush extends Plant {
    
    private double  bushWidth;
    private boolean isDomestic;
    private String  bushVariety;
    private String  leafColor;
    private boolean isPrunedOrNot;

    public Bush() {
    }

    public Bush(double bushWidth, boolean isDomestic, String bushVariety, String leafColor, boolean isPrunedOrNot,
            // Attributes 'Plant'
            String name, double stemHeight, boolean hasLeaves, String idealClimate) {
        super(name, stemHeight, hasLeaves, idealClimate);
        this.bushWidth     = bushWidth;
        this.isDomestic    = isDomestic;
        this.bushVariety   = bushVariety;
        this.leafColor     = leafColor;
        this.isPrunedOrNot = isPrunedOrNot;
    }

    public double getBushWidth() {
        return bushWidth;
    }

    public void setBushWidth(double bushWidth) {
        this.bushWidth = bushWidth;
    }

    public boolean isIsDomestic() {
        return isDomestic;
    }

    public void setIsDomestic(boolean isDomestic) {
        this.isDomestic = isDomestic;
    }

    public String getBushVariety() {
        return bushVariety;
    }

    public void setBushVariety(String bushVariety) {
        this.bushVariety = bushVariety;
    }

    public String getLeafColor() {
        return leafColor;
    }

    public void setLeafColor(String leafColor) {
        this.leafColor = leafColor;
    }

    public boolean isIsPrunedOrNot() {
        return isPrunedOrNot;
    }

    public void setIsPrunedOrNot(boolean isPrunedOrNot) {
        this.isPrunedOrNot = isPrunedOrNot;
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
        System.out.println("Hello I am a bush.");
    }
    
}