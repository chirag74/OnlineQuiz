package com.example.onlinequiz.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlinequiz.entity.exam.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
