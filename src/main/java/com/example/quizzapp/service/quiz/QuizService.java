package com.example.quizzapp.service.quiz;

import com.example.quizzapp.model.Quiz;
import com.example.quizzapp.repository.IQuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Optional;

public class QuizService implements IQuizService{
    @Autowired
    private IQuizRepository quizRepository;
    @Override
    public Iterable<Quiz> findAll() {
        return quizRepository.findAll();
    }

    @Override
    public Optional<Quiz> findById(Long id) {
        return quizRepository.findById(id);
    }

    @Override
    public Quiz save(Quiz quiz) {
        return save(quiz);
    }

    @Override
    public void remove(Long id) {
        quizRepository.deleteById(id);
    }

    @Override
    public Iterable<Quiz> findAll(int page, int size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        Page<Quiz> quizzes = quizRepository.findAll(pageRequest);
        return quizzes.getContent();
    }
}
