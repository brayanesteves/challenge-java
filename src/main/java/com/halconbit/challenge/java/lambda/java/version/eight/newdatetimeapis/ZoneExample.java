package com.halconbit.challenge.java.lambda.java.version.eight.newdatetimeapis;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneExample {
    
    private ZoneId zoneId;
    
    public void getAvailableZoneIds() {
        this.zoneId.getAvailableZoneIds().stream().forEach(System.out::println);
    }
    
    // value = "Europe/London"; //
    // value = "America/New_York"; //
    public ZonedDateTime zoneId_now(String value) {
        return ZonedDateTime.now(ZoneId.of(value));
    }
    
}