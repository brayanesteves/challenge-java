package com.halconbit.challenge.java.lambda.java.version.eight.newdatetimeapis;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class DateModifyExample {
    
    public LocalDate localDate_plusDay(int value) {
        LocalDate localDate = LocalDate.now();
        return localDate.plusDays(value);
    }
    
    public LocalDate localDate_plusMonths(int value) {
        LocalDate localDate = LocalDate.now();
        return localDate.plusMonths(value);
    }
    
    public LocalDate localDate_plusYears(int value) {
        LocalDate localDate = LocalDate.now();
        return localDate.plusYears(value);
    }
    
    public LocalDate localDate_minusDays(int value) {
        LocalDate localDate = LocalDate.now();
        return localDate.minusDays(value);
    }
    
    public LocalDate localDate_withYear(int value) {
        LocalDate localDate = LocalDate.now();
        return localDate.withYear(value);
    }
    
    public LocalDate localDate_ChronoField_Year(int value) {
        LocalDate localDate = LocalDate.now();
        return localDate.with(ChronoField.YEAR, value);
    }
    
    public LocalDate localDate_withTemporalAdjuesters_lastDayOfMonth(int value) {
        LocalDate localDate = LocalDate.now();
        return localDate.with(TemporalAdjusters.lastDayOfMonth());
    }
    
}