package com.halconbit.challenge.java.oop.Amphitheatre.logic;

import java.util.List;

/**
 *
 * @author Brayan Esteves
 */
public class Customer {
    
    private int          id;
    private String       identityDocument;
    private String       name;
    private String       lastname;
    private List<Ticket> listTicket;

    public Customer() {
    }

    public Customer(int id, String identityDocument, String name, String lastname) {
        this.id               = id;
        this.identityDocument = identityDocument;
        this.name             = name;
        this.lastname         = lastname;
    }
    
    public Customer(int id, String identityDocument, String name, String lastname, List<Ticket> listTicket) {
        this.id               = id;
        this.identityDocument = identityDocument;
        this.name             = name;
        this.lastname         = lastname;
        this.listTicket       = listTicket;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentityDocument() {
        return identityDocument;
    }

    public void setIdentityDocument(String identityDocument) {
        this.identityDocument = identityDocument;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<Ticket> getListTicket() {
        return this.listTicket;
    }

    public void setListTicket(List<Ticket> listTicket) {
        this.listTicket = listTicket;
    }
    
}