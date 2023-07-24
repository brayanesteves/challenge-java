package com.halconbit.challenge.java.mapobjects.mapstruct.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;


/**
 *
 * @author brayan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "category")
public class CategoryEntity {
    
    @Id
    private long                    id;

    private String                name;
    
    private boolean             status;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;
}
