package com.halconbit.challenge.java.lambda.java.version.eight.newdatetimeapis;

import java.time.LocalTime;
import java.time.temporal.ChronoField;


public class LocalTimeExample {
    
    public LocalTime of(int hour, int minute) {
        LocalTime localTime = LocalTime.of(hour, minute);
        return localTime;
    }
    
    public LocalTime of(int hour, int minute, int second) {
        LocalTime localTime = LocalTime.of(hour, minute, second);
        return localTime;
    }
    
    public LocalTime of(int hour, int minute, int second, int nanoOfSecond) {
        LocalTime localTime = LocalTime.of(hour, minute, second, nanoOfSecond);
        return localTime;
    }
    
    public int getHour() {
        LocalTime localTime = LocalTime.now();
        return localTime.getHour();
    }
    
    public int getMinute() {
        LocalTime localTime = LocalTime.now();
        return localTime.getMinute();
    }
    
    public int getSecond() {
        LocalTime localTime = LocalTime.now();
        return localTime.getSecond();
    }
    
    public int getNano() {
        LocalTime localTime = LocalTime.now();
        return localTime.getNano();
    }
    
    public int getChronoFieldSECOND_OF_DAY() {
        LocalTime localTime = LocalTime.now();
        return localTime.get(ChronoField.SECOND_OF_DAY);
    }
    
    public int getChronoFieldMINUTE_OF_DAY() {
        LocalTime localTime = LocalTime.now();
        return localTime.get(ChronoField.MINUTE_OF_DAY);
    }
    
}