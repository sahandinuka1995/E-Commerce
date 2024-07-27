package com.projectexample.Proexsample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectexample.Proexsample.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    
}
