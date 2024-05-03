package com.halconbit.challenge.java.lambda.java.version.twelve.switchexpressions;

public class SwitchStatementExample {

    public String switchs(String value) {
        String quarter = "";
        switch (value) {
            case "JANUARY":
                quarter = "FIRST QUARTER";
                break;
            case "FEBUARY":
                quarter = "FIRST QUARTER";
                break;
            case "MARCH":
                quarter = "FIRST QUARTER";
                break;
            case "APRIL":
                quarter = "SECOND QUARTER";
                break;
            case "MAY":
                quarter = "SECOND QUARTER";
                break;
            case "JUNE":
                quarter = "SECOND QUARTER";
                break;
            case "JULY":
                quarter = "THIRD QUARTER";
                break;
            case "AUGUST":
                quarter = "THIRD QUARTER";
                break;
            case "SEPTEMBER":
                quarter = "THIRD QUARTER";
                break;
            case "OCTOBER":
                quarter = "FOURTH QUARTER";
                break;
            case "NOVEMBER":
                quarter = "FOURTH QUARTER";
                break;
            case "DECEMBER":
                quarter = "FOURTH QUARTER";
                break;
            default:
                quarter = "UNKNOWN QUARTER";
                break;
        }
        return quarter;
    }
    
    public String switchsLambda(String value) {
        String quarter = switch (value) {
            case "JANUARY", "FEBUARY", "MARCH" -> "FIRST QUARTER";            
            case "APRIL", "MAY", "JUNE" -> "SECOND QUARTER";
            case "JULY", "AUGUST", "SEPTEMBER" -> "THIRD QUARTER";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "FOURTH QUARTER";
            default -> "UNKNOWN QUARTER";
        };
        return quarter;
    }

}
