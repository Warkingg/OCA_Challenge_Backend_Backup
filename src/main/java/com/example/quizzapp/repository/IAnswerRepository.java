package com.example.quizzapp.repository;

import com.example.quizzapp.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAnswerRepository extends JpaRepository<Answer, Long> {
}
