package com.example.quizzapp.service.topic;

import com.example.quizzapp.model.Topic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class TopicService implements ITopicService{
    @Override
    public Page<Topic> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Topic> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Topic save(Topic topic) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
