package com.halconbit.challenge.java.lambda.java.version.eight.newdatetimeapis;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ConvertToZoneDateTimeExample {
    
    private LocalDateTime localDateTime = LocalDateTime.now();
    
    // value = "Europe/London"; //
    // value = "America/New_York"; //
    public ZonedDateTime zoneId_now(String value) {
        return ZonedDateTime.now(ZoneId.of(value));
    }

    // value = -10 => 2020-01-22T23:01:27.628706600-10:00 //
    public OffsetDateTime atOffset_ofHours(int value) {
        return this.localDateTime.atOffset(ZoneOffset.ofHours(value));
    }
    
}