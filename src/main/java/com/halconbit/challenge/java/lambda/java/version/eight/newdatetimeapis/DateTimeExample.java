package com.halconbit.challenge.java.lambda.java.version.eight.newdatetimeapis;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateTimeExample {
    
    public String simpledateformatter_date() {
        // Date and 'SimpleDateFormat()'.
        Date       dateObj    = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(dateObj);
    }
    
    public String simpledateformatter_hour() {
        // Date and 'SimpleDateFormat()'.
        Date       dateObj    = new Date();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        return dateFormat.format(dateObj);
    }
    
    public Date calendar_getTime() {
        return Calendar.getInstance().getTime();
    }
    
    public LocalDate localDate() {
        LocalDate localDate = LocalDate.now();
        return localDate;
    }
    
    public LocalTime localTime() {
        LocalTime localTime = LocalTime.now();
        return localTime;
    }
    
    public LocalDateTime localDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime;
    }
    
}