package com.onlineshopping.springboot.dao;

import com.onlineshopping.springboot.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;


import java.util.List;

@Repository
public interface ProductDao extends CrudRepository<Product, Integer> {
    List<Product> findAll(Pageable pageable);
    List<Product> findByProductNameContainingIgnoreCaseOrProductDescriptionContainingIgnoreCase(
            String productName, String productDescription, Pageable pageable
    );
}
