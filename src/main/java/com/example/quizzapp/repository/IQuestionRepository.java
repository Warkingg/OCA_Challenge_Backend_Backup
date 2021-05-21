package com.example.quizzapp.repository;

import com.example.quizzapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IQuestionRepository extends JpaRepository<Question,Long> {
}
