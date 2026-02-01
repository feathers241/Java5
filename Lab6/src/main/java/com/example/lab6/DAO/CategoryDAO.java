package com.example.lab6.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lab6.Entity.Category;

public interface CategoryDAO extends JpaRepository<Category, Integer>{
}
