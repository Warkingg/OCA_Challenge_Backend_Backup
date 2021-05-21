package com.example.quizzapp.service.history;

import com.example.quizzapp.model.History;
import com.example.quizzapp.service.IGeneralService;

public interface IHistoryService extends IGeneralService<History> {
    History findHistoryByScore(int score);

    History findHistoryByUsername(String username);
}
