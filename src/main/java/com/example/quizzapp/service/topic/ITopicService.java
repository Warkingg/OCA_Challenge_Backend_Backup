package com.example.quizzapp.service.topic;

import com.example.quizzapp.model.Topic;
import com.example.quizzapp.service.IGeneralService;

public interface ITopicService extends IGeneralService<Topic> {
    Iterable<Topic> findAll(int page, int size);
}
