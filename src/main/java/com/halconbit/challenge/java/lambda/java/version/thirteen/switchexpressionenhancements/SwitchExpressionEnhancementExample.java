package com.halconbit.challenge.java.lambda.java.version.thirteen.switchexpressionenhancements;

import java.time.LocalDate;

public class SwitchExpressionEnhancementExample {
    
    public String switchsLambda(String value) {
        String quarter = switch (value) {
            case "JANUARY", "FEBUARY", "MARCH" -> {
                var isLeapYear = LocalDate.now().isLeapYear();
                yield (isLeapYear ? "FIRST QUARTER - LEAP YEAR" : "FIRST QUARTER");
            }            
            case "APRIL", "MAY", "JUNE" -> "SECOND QUARTER";
            case "JULY", "AUGUST", "SEPTEMBER" -> "THIRD QUARTER";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "FOURTH QUARTER";
            default -> "UNKNOWN QUARTER";
        };
        return quarter;
    }
    
    
}