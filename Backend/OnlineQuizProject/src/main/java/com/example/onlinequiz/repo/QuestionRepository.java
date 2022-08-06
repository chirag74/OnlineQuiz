package com.example.onlinequiz.repo;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlinequiz.entity.exam.Question;
import com.example.onlinequiz.entity.exam.Quiz;

public interface QuestionRepository extends JpaRepository<Question, Long> {

	Set<Question> findByQuiz(Quiz quiz);

}
