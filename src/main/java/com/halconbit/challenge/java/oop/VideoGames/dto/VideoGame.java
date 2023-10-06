package com.halconbit.challenge.java.oop.VideoGames.dto;

/**
 *
 * @author brayan
 */
public class VideoGame {
    
    private int    code;
    private String title;
    private String console;
    private int    numberOfPlayers;
    private String category;

    public VideoGame() {
    }

    public VideoGame(int code, String title, String console, int numberOfPlayers, String category) {
        this.code            = code;
        this.title           = title;
        this.console         = console;
        this.numberOfPlayers = numberOfPlayers;
        this.category        = category;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConsole() {
        return this.console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public int getNumberOfPlayers() {
        return this.numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "VideoGame{" + "code=" + this.code + ", title=" + this.title + ", console=" + this.console + ", numberOfPlayers=" + this.numberOfPlayers + ", category=" + this.category + '}';
    }
    
    
    
}
