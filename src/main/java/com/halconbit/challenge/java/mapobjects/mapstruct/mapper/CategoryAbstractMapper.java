package com.halconbit.challenge.java.mapobjects.mapstruct.mapper;

import com.halconbit.challenge.java.mapobjects.mapstruct.repository.CategoryRepository;
import com.halconbit.challenge.java.mapobjects.mapstruct.dto.CategoryDTO;
import com.halconbit.challenge.java.mapobjects.mapstruct.entity.CategoryEntity;

import java.util.List;
import org.mapstruct.InheritInverseConfiguration;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author Brayan Esteves
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = {})
public abstract class CategoryAbstractMapper {
    
    @Autowired
    private CategoryRepository categoryRepository;
    
    @Mappings({        
        @Mapping(source = "id", target = "id"),
        @Mapping(source = "name", target = "name"),
        @Mapping(source = "status", target = "status"),
        @Mapping(source = "creationDate", target = "creationDate"),
        /*@Mapping(source = "category.id", target = "category.id"),
        @Mapping(source = "category.name", target = "category.name"),
        @Mapping(source = "category.status", target = "category.status"),
        @Mapping(source = "category.creationDate", target = "category.creationDate")*/
    })  
   abstract CategoryDTO toGetCategory(CategoryEntity categoryEntity);
    
    /**
     * Map inverse
     */
   
    CategoryDTO toEntity(CategoryDTO categoryDTO) {
        if(categoryDTO == null) {
            return nuegoryEntll;
        }
        
        CategoryEntity categoryEntity = this.categoryRepository.findById(categoryDTO.getId()).orElse(null);
        
        if(categoryEntity == null) {
            return null;
        }
        
        categoryEntity.setId(categoryDTO.getId());
        categoryEntity.setName(categoryDTO.getName());
        
        return categoryDTO;
    }
    
    abstract List<CategoryDTO> toGetCategoryList(List<CategoryEntity> productList);
    
    abstract List<CategoryEntity> toEntityList(List<CategoryDTO> getCategoryList);
    
}
