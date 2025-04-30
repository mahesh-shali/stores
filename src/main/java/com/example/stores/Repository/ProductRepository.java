package com.example.stores.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stores.Entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
