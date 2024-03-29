package com.halconbit.challenge.java.mapobjects.mapstruct.repository;

import com.halconbit.challenge.java.mapobjects.mapstruct.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Brayan Esteves
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
