package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.optional;

import java.util.Optional;

public class OptionalIfIsExample {
   
    public Optional<String> isPresent(String value) {
        Optional<String> stringOptional = Optional.ofNullable(value);
        return stringOptional.isPresent() ? stringOptional : null;
    }
    
    public Optional<String> ifPresent(String value) {
        Optional<String> stringOptional = Optional.ofNullable(value);
        Optional<String> print = stringOptional.isPresent() ? stringOptional : null;
        print.ifPresent(s -> s.toString());
        return print;
    }
    
}