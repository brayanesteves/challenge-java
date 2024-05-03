package com.halconbit.challenge.java.lambda.java.version.eight.newdatetimeapis;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {
    
    private final LocalDateTime localDateTime = LocalDateTime.now();
    
    public LocalDateTime localDateTime() {
        return this.localDateTime;
    }
    
    public LocalDateTime localDateTime_of(int year, int month, int dayOfMonth, int hour, int minute, int second) {
        return this.localDateTime.of(year, month, dayOfMonth, hour, minute, second);
    }
    
    public LocalDateTime localDateTime_of(LocalDate localDate, LocalTime localTime) {
        return this.localDateTime.of(localDate.now(), localTime.now());
    }
    
    // <GET> //
    public int localDateTime_getHour() {
        return this.localDateTime.getHour();
    }
    
    public Month localDateTime_getMonth() {
        return this.localDateTime.getMonth();
    }
    
    public int localDateTime_getMinute() {
        return this.localDateTime.getMinute();
    }

    public int localDateTime_getSecond() {
        return this.localDateTime.getSecond();
    }
    
    public int localDateTime_getChronoField_MONTH_OF_YEAR() {
        return this.localDateTime.get(ChronoField.MONTH_OF_YEAR);
    }
    // <.GET> //
    
    // ========================= //
    
    // <MODIFY> //
    public LocalDateTime plusYears(long value) {
        return this.localDateTime.plusYears(value);
    }
    
    public LocalDateTime plusHours(long value) {
        return this.localDateTime.plusHours(value);
    }
    
    public LocalDateTime plusMinutes(long value) {
        return this.localDateTime.plusMinutes(value);
    }
    
    public LocalDateTime withLocalTime_MIDNIGHT(long value) {
        return this.localDateTime.with(LocalTime.MIDNIGHT);
    }
    // <.MODIFY> //
    
}