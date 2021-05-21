package com.example.quizzapp.service.question;

import com.example.quizzapp.model.Level;
import com.example.quizzapp.model.Question;
import com.example.quizzapp.repository.IQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class QuestionService implements IQuestionService{

    @Autowired
    private IQuestionRepository questionRepository;
    @Override
    public Page<Question> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Question> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Question save(Question question) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public Question addQuestion(Question question, Level level) {
        level.addQuestion(question);
        return questionRepository.save(question);
    }
}
