package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.optional;

import java.util.Optional;

public class OptionalOfEmptyExample {
    
    public Optional<String> optionalString(String value) {
        Optional<String> optionalString = Optional.of(value);
        return optionalString;
    }
    
    public static Optional<String> getWords(String[] wordsList) {
        String[] words = new String[10];
        if(wordsList.length > words.length) {
            words[words.length] = wordsList[words.length];
        }
        words = wordsList;
        Optional<String> optionalString = Optional.ofNullable(words[1]);
        if(optionalString.isPresent()) {
            return optionalString;
        } else {
            return Optional.empty();
        }
    }
    
}