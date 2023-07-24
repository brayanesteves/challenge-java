package com.halconbit.challenge.java.mapobjects.mapstruct.mapper;

import com.halconbit.challenge.java.mapobjects.mapstruct.dto.GetProduct;
import com.halconbit.challenge.java.mapobjects.mapstruct.entity.Product;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.MappingConstants;
/**
 *
 * @author Brayan Esteves
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = {CategoryMapper.class})
public interface ProductMapper {
    
    /*@Mappings({
        @Mapping(source = "creationDate", target = "creationDate", dateFormat = "yyyy-MM-dd HH:mm:ss")
    })    
    GetProduct toGetDTO(Product product*/
    
    @Mappings({
        @Mapping(source = "id", target = "id"),
        @Mapping(source = "name", target = "name"),
        @Mapping(source = "creationDate", target = "creationDate", dateFormat = "yyyy-MM-dd HH:mm:ss"),
        @Mapping(source = "category", target = "category"),
        @Mapping(source = "price", target = "price", numberFormat = "$0.00")
        
    })
    GetProduct productToGetDTO(Product product);
    
    /**
     * Map inverse
     */
    @InheritInverseConfiguration
    @Mappings({
        @Mapping(target = "creationDate", ignore = true)
    })
    Product toEntity(GetProduct getProduct);
    
    List<GetProduct> toGetProductList(List<Product> productList);
    
    List<Product> toEntityList(List<GetProduct> getProductList);
}
