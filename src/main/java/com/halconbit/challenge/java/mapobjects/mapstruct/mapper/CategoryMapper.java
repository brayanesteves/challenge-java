package com.halconbit.challenge.java.mapobjects.mapstruct.mapper;

import com.halconbit.challenge.java.mapobjects.mapstruct.dto.CategoryDTO;
import com.halconbit.challenge.java.mapobjects.mapstruct.entity.CategoryEntity;

import java.util.List;
import org.mapstruct.InheritInverseConfiguration;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

/**
 *
 * @author brayan
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = {})
public interface CategoryMapper {
    
    @Mappings({
        @Mapping(source = "id", target = "id"),
        @Mapping(source = "name", target = "name"),
        @Mapping(source = "status", target = "status"),
        @Mapping(source = "creationDate", target = "creationDate", dateFormat = "yyyy-MM-dd HH:mm:ss")
    }) 
    CategoryDTO toGetCategory(CategoryEntity categoryEntity);
    
    /**
     * Map inverse
     */
    @InheritInverseConfiguration
    CategoryEntity toEntity(CategoryDTO categoryDTO);
    
    List<CategoryDTO> toGetCategoryList(List<CategoryEntity> productList);
    
    List<CategoryEntity> toEntityList(List<CategoryDTO> getCategoryList);
}
