package com.example.quizzapp.service.quiz;

import com.example.quizzapp.model.Quiz;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class QuizService implements IQuizService{
    @Override
    public Page<Quiz> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Quiz> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Quiz save(Quiz quiz) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
