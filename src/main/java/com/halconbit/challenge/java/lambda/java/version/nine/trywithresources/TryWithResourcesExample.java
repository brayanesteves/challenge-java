package com.halconbit.challenge.java.lambda.java.version.nine.trywithresources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class TryWithResourcesExample {
    
    // Java 8.
    public String bufferedReader_JavaVersion8(String value) throws IOException {
        Reader inputString = new StringReader(value);
        BufferedReader bufferedReader = new BufferedReader(inputString);
        try(BufferedReader bufferedReaderAux = bufferedReader) {
            return "bufferedReaderAux.readLine()[Java version 8]:" + bufferedReaderAux.readLine();
        }
    }
    
    // Java 9.
    public String bufferedReader_JavaVersion9(String value) throws IOException {
        Reader inputString = new StringReader(value);
        BufferedReader bufferedReader = new BufferedReader(inputString);
        try(bufferedReader) {
            return "bufferedReader.readLine()[Java version 9]: " + bufferedReader.readLine();
        }
    }
    
}