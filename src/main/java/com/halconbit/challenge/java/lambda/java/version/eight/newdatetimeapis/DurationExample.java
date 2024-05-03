package com.halconbit.challenge.java.lambda.java.version.eight.newdatetimeapis;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationExample {
    
    private final int           value                  = 2;
    private final LocalDateTime localDateTime          = LocalDateTime.now();
    private final LocalTime     localTime              = LocalTime.now();
    private final LocalDate     localDate              = LocalDate.now();
    private final LocalDateTime localDateTime_plusTime = LocalDateTime.now().plusHours(this.value);
    private       Duration      duration               = Duration.between(this.localDateTime, this.localDateTime_plusTime);
 
    public long duration_toHours() {
        return this.duration.toHours();
    }
    
    public long duration_toHours_toMinutes(long value) {
        this.duration = Duration.ofHours(value);
        return this.duration.toMinutes();
    }
    
    public long duration_plusMinutes(long value) {
        this.duration = Duration.between(this.localTime, this.localTime.plusMinutes(value));
        return this.duration.toMinutes();
    }
    
    public long duration_plusDays(long value) {
        this.duration = Duration.between(this.localDate, this.localDate.plusDays(value));
        return this.duration.toMinutes();
    }
    
}