package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pojo.Product;

//ProductRepository.java
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
