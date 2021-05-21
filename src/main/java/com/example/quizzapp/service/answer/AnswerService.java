package com.example.quizzapp.service.answer;

import com.example.quizzapp.model.Answer;
import com.example.quizzapp.model.Question;
import com.example.quizzapp.repository.IAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class AnswerService implements IAnswerService{
    @Autowired
    private IAnswerRepository answerRepository;
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

    @Override
    public Answer addAnswer(Answer answer, Question question) {
        question.addAnswer(answer);
        return answerRepository.save(answer);
    }
}
