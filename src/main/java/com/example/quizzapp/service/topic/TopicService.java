package com.example.quizzapp.service.topic;

import com.example.quizzapp.model.Topic;
import com.example.quizzapp.repository.ITopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class TopicService implements ITopicService{
    @Autowired
    private ITopicRepository topicRepository;
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
        return topicRepository.save(topic);
    }

    @Override
    public void remove(Long id) {

    }
}
