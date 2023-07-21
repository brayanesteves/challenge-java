package com.halconbit.challenge.java.mapobjects.mapstruct.mapper;

import com.halconbit.challenge.java.mapobjects.mapstruct.dto.GetProduct;
import com.halconbit.challenge.java.mapobjects.mapstruct.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.MappingConstants;
/**
 *
 * @author brayan
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductMapper {
    
    @Mappings({
        @Mapping(source = "id", target = "id"),
        @Mapping(source = "name", target = "name"),
        @Mapping(source = "creationDate", target = "creationDate", dateFormat = "yyyy-MM-dd HH-mm-ss")
    })    
    GetProduct productToGetDTO(Product product);
}
