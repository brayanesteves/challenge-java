package com.halconbit.challenge.java.lambda.java.version.eight.newdatetimeapis;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeToDateAndTimeExample {
    
    private LocalDateTime localDateTime = LocalDateTime.now();
    
    public LocalDate toLocalDate() {
        return this.localDateTime.toLocalDate();
    }
    
    public LocalTime toLocalTime() {
        return this.localDateTime.toLocalTime();
    }
    
    public LocalDateTime localDateTime_of(LocalDate localDate, LocalTime localTime) {
        return this.localDateTime.of(localDate, localTime);
    }
    
}