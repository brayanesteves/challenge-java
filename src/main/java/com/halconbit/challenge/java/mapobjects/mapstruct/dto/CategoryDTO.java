package com.halconbit.challenge.java.mapobjects.mapstruct.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

/**
 *
 * @author Brayan Esteves
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoryDTO {
    
    private long                    id;
    private String                name;    
    private boolean             status;
    private LocalDateTime creationDate;
    
}
