package com.halconbit.challenge.java.mapobjects.mapstruct.mapper;

import com.halconbit.challenge.java.mapobjects.mapstruct.dto.GetProduct;
import com.halconbit.challenge.java.mapobjects.mapstruct.entity.Product;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-22T21:33:14-0400",
    comments = "version: 1.5.4.Final, compiler: javac, environment: Java 17.0.7 (Private Build)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public GetProduct productToGetDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        GetProduct getProduct = new GetProduct();

        getProduct.setId( product.getId() );
        getProduct.setName( product.getName() );
        getProduct.setCreationDate( product.getCreationDate() );

        return getProduct;
    }

    @Override
    public Product toEntity(GetProduct getProduct) {
        if ( getProduct == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( getProduct.getId() );
        product.setName( getProduct.getName() );
        product.setCreationDate( getProduct.getCreationDate() );

        return product;
    }
}
