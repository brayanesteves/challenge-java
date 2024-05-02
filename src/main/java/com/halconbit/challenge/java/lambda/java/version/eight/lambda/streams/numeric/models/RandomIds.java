package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.numeric.models;

public class RandomIds {
    
    int id;
    int randomNumbers;

    public RandomIds() {
    }

    public RandomIds(int id, int randomNumbers) {
        this.id            = id;
        this.randomNumbers = randomNumbers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRandomNumbers() {
        return randomNumbers;
    }

    public void setRandomNumbers(int randomNumbers) {
        this.randomNumbers = randomNumbers;
    }

    @Override
    public String toString() {
        return "RandomIds{" + "id=" + id + ", randomNumbers=" + randomNumbers + '}';
    }    
    
}