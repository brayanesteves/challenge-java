package com.halconbit.challenge.java.mapobjects.mapstruct.test;

import com.halconbit.challenge.java.mapobjects.mapstruct.dto.GetProduct;
import com.halconbit.challenge.java.mapobjects.mapstruct.entity.Product;
import com.halconbit.challenge.java.mapobjects.mapstruct.mapper.ProductMapper;
import com.halconbit.challenge.java.mapobjects.mapstruct.repository.ProductRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Brayan Esteves
 */
@Configuration
public class InitDatabase {
    
    @Autowired
    private ProductRepository productRepository;
    
    @Autowired
    private ProductMapper     productMapper;
    
    @Bean
    public CommandLineRunner testProductMapperCommand() {
        return args -> {
            
            List<Product> products = this.productRepository.findAll();
            
            System.out.println("PRODUCTS");
            products.forEach(System.out::println);
            
            System.out.println("GET PRODUCT");
            List<GetProduct> getProductList                  = products.stream().map(product -> this.productMapper.productToGetDTO(product)).collect(Collectors.toList());
            List<GetProduct> getProductList_Aux              = products.stream().map(product -> this.productMapper.productToGetDTO(product)).peek(System.out::println).collect(Collectors.toList());
            List<GetProduct> getProductList_toGetProductList = this.productMapper.toGetProductList(products);
            getProductList_toGetProductList.forEach(System.out::println);
            
            System.out.println("MAPPED PRODUCTS");
            List<Product> mappedProducts                     = this.productMapper.toEntityList(getProductList);
            mappedProducts.forEach(System.out::println);
            
        };
    }
}
