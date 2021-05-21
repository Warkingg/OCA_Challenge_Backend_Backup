package com.example.quizzapp.service.question;

import com.example.quizzapp.model.Level;
import com.example.quizzapp.model.Question;
import com.example.quizzapp.service.IGeneralService;

public interface IQuestionService extends IGeneralService<Question> {
    Question addQuestion(Question question, Level level);

    Iterable<Question> findAll(int page, int size);
}
