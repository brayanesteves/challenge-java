package com.halconbit.challenge.java.lambda.java.version.eight.newdatetimeapis;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeModifyExample {
    
    private LocalTime localTime = LocalTime.now();
    
    public LocalTime plusHours(long value) {
        return this.localTime.plusHours(value);
    }
    
    public LocalTime plusMinutes(long value) {
        return this.localTime.plusMinutes(value);
    }
    
    public LocalTime plusSeconds(long value) {
        return this.localTime.plusSeconds(value);
    }
    
    public LocalTime plusNanos(long value) {
        return this.localTime.plusNanos(value);
    }
    
    public LocalTime minusHours(long value) {
        return this.localTime.minusHours(value);
    }
    
    public LocalTime minusChronoUnit_HOURS(long value) {
        return this.localTime.minus(value, ChronoUnit.HOURS);
    }
    
    public LocalTime withLocalTime_MIDNIGHT(long value) {
        return this.localTime.with(LocalTime.MIDNIGHT);
    }
    
    public LocalTime withChronoField_HOUR_OF_DAY(long value) {
        return this.localTime.with(ChronoField.HOUR_OF_DAY, value);
    }
    
}