package com.halconbit.challenge.java.lambda.java.version.eight.newdatetimeapis;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateExample {
    
    public LocalDate localDate() {
        LocalDate localDate = LocalDate.now();
        return localDate;
    }
    
    public LocalDate localDate_ofYearDay(int year, int dayOfYear) {
        LocalDate localDate = LocalDate.ofYearDay(year, dayOfYear);
        return localDate;
    }
    
    public LocalDate localDate_of(int year, int month, int dayOfYear) {
        LocalDate localDate = LocalDate.of(year, month, dayOfYear);
        return localDate;
    }
    
    public Month localDate_getMonthSpecific(int year, int month, int dayOfYear) {
        LocalDate localDate = LocalDate.of(year, month, dayOfYear);
        return localDate.getMonth();
    }
    
    public Month localDate_getMonthNow() {
        LocalDate localDate = LocalDate.now();
        return localDate.getMonth();
    }
    
    public int localDate_getMonthValueNow() {
        LocalDate localDate = LocalDate.now();
        return localDate.getMonthValue();
    }
    
    public DayOfWeek localDate_getDayOfWeekNow() {
        LocalDate localDate = LocalDate.now();
        return localDate.getDayOfWeek();
    }
    
    public int localDate_getDayOfYearNow() {
        LocalDate localDate = LocalDate.now();
        return localDate.getDayOfYear();
    }
    
    public int localDate_getChronoFieldDAY_OF_MONTH_Now() {
        LocalDate localDate = LocalDate.now();
        return localDate.get(ChronoField.DAY_OF_MONTH);
    }
    
    public int localDate_getChronoFieldDAY_OF_YEAR_Now() {
        LocalDate localDate = LocalDate.now();
        return localDate.get(ChronoField.DAY_OF_YEAR);
    }
    
}