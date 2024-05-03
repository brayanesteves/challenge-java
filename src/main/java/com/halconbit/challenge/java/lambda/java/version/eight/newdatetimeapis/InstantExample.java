package com.halconbit.challenge.java.lambda.java.version.eight.newdatetimeapis;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class InstantExample {
    
    private Instant       timestamp = Instant.now();
    private Duration      duration;
    private LocalDateTime localDateTime;
    
    public int getNano() {
        return this.timestamp.getNano();
    }
    
    public long plusSeconds_toSeconds(long value) {
        Instant timestampLocal = Instant.now().plusSeconds(value);
        this.duration          = Duration.between(timestampLocal, this.timestamp);
        return this.duration.toSeconds();
    }
    
    public LocalDateTime ofInstant(long value) {
        this.localDateTime = LocalDateTime.ofInstant(this.timestamp, ZoneId.systemDefault());
        return this.localDateTime;
    }
    
}