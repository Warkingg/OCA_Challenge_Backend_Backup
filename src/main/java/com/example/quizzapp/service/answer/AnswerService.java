package com.example.quizzapp.service.answer;

import com.example.quizzapp.model.Answer;
import com.example.quizzapp.model.Question;
import com.example.quizzapp.repository.IAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class AnswerService implements IAnswerService{
    @Autowired
    private IAnswerRepository answerRepository;

    @Override
    public Iterable<Answer> findAll() {
        return answerRepository.findAll();
    }

    @Override
    public Optional<Answer> findById(Long id) {
        return answerRepository.findById(id);
    }

    @Override
    public Answer save(Answer answer) {
        return null;
    }

    @Override
    public void remove(Long id) {
        answerRepository.deleteById(id);
    }

    @Override
    public Answer addAnswer(Answer answer, Question question) {
        question.addAnswer(answer);
        return answerRepository.save(answer);
    }

    @Override
    public Iterable<Answer> findAll(int page, int size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        Page<Answer> answers = answerRepository.findAll(pageRequest);
        return answers.getContent();
    }
}
