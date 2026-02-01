package com.example.lab6.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lab6.Entity.Product;

public interface ProductDAO extends JpaRepository<Product, Integer> {

}
