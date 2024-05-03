package com.halconbit.challenge.java.lambda.java.version.eight.newdatetimeapis;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class ConvertToLocalDateTime {
    
    private Date          date           = new Date();
    private LocalDateTime localDateTime;
    private LocalDate     localDate;
    private java.sql.Date dateSql;
    
    public LocalDateTime atZone() {
        this.localDateTime = this.date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        return this.localDateTime;
    }
    
    public LocalDate dateSql() {
        this.dateSql = new java.sql.Date(System.currentTimeMillis());
        this.localDate = this.dateSql.toLocalDate();
        return this.localDate;
    }
    
}