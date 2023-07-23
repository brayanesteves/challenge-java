package com.halconbit.challenge.java.mapobjects.mapstruct.dto;

import java.time.LocalDateTime;

/**
 *
 * @author brayan
 */
public class GetProduct {
    
    private long id;
    private String name;
    private LocalDateTime creationDate;

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the creationDate
     */
    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    /**
     * @param creationDate the creationDate to set
     */
    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
    
    @Override
    public String toString() {
        return "GetProduct{" + "id=" + this.id + ", name='" + this.name + '\'' + ", creationDate='" + this.creationDate + '\'' + "}";
    }
    
}
