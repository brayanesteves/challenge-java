package com.halconbit.challenge.java.oop.Amphitheatre.logic;

import java.util.Date;

/**
 *
 * @author Brayan Esteves
 */
public class Ticket {
    
    private int    number;
    private int    row;
    private int    seat;
    private Date   purchaseDate;
    private Date   validityDate;
    private double price;

    public Ticket() {
    }

    public Ticket(int number, int row, int seat, Date purchaseDate, Date validityDate, double price) {
        this.number       = number;
        this.row          = row;
        this.seat         = seat;
        this.purchaseDate = purchaseDate;
        this.validityDate = validityDate;
        this.price        = price;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getRow() {
        return this.row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getSeat() {
        return this.seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Date getValidityDate() {
        return this.validityDate;
    }

    public void setValidityDate(Date validityDate) {
        this.validityDate = validityDate;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket{" + "number=" + this.number + ", row=" + this.row + ", seat=" + this.seat + ", purchaseDate=" + this.purchaseDate + ", validityDate=" + this.validityDate + ", price=" + this.price + '}';
    }
    
}
