package com.example.onlinequiz.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlinequiz.entity.exam.Category;
import com.example.onlinequiz.entity.exam.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long>{

	List<Quiz> findBycategory(Category category);

	List<Quiz> findByActive(boolean b);

	List<Quiz> findByCategoryAndActive(Category c, boolean b);

}
