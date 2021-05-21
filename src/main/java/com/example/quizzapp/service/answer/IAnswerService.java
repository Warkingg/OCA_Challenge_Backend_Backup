package com.example.quizzapp.service.answer;

import com.example.quizzapp.model.Answer;
import com.example.quizzapp.model.Question;
import com.example.quizzapp.service.IGeneralService;

public interface IAnswerService extends IGeneralService<Answer> {
    Answer addAnswer(Answer answer, Question question);
}
