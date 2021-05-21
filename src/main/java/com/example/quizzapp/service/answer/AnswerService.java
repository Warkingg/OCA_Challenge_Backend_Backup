package com.example.quizzapp.service.answer;

import com.example.quizzapp.model.Answer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class AnswerService implements IAnswerService{
    @Override
    public Page<Answer> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Answer> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Answer save(Answer answer) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
