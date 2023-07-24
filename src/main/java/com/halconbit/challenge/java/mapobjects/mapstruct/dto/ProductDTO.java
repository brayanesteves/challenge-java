package com.halconbit.challenge.java.mapobjects.mapstruct.dto;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.math.BigDecimal;

/**
 *
 * @author brayan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTO {
    private long                    id;
    private String                name;
    private LocalDateTime creationDate;
    private CategoryDTO    categoryDto;
    private String               price;
}
