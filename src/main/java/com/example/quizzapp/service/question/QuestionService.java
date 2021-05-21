package com.example.quizzapp.service.question;

import com.example.quizzapp.model.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class QuestionService implements IQuestionService{
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
}
