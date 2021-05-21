package com.example.quizzapp.repository;

import com.example.quizzapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IQuizRepository extends JpaRepository<Quiz, Long> {
}
