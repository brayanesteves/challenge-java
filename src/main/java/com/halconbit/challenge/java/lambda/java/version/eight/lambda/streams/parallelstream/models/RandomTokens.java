package com.halconbit.challenge.java.lambda.java.version.eight.lambda.streams.parallelstream.models;

public class RandomTokens {
    
    long id;
    long tokens;

    public RandomTokens() {
    }

    public RandomTokens(long id, long tokens) {
        this.id     = id;
        this.tokens = tokens;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTokens() {
        return tokens;
    }

    public void setTokens(long tokens) {
        this.tokens = tokens;
    }

    @Override
    public String toString() {
        return "RandomTokens{" + "id=" + id + ", tokens=" + tokens + '}';
    }
    
}