package com.example.quizzapp.service.level;

import com.example.quizzapp.model.Level;
import com.example.quizzapp.model.Topic;
import com.example.quizzapp.service.IGeneralService;

public interface ILevelService extends IGeneralService<Level> {
    Level addLevel(Level level, Topic Topic);
}
