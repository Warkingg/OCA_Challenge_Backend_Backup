package com.example.quizzapp.service.topic;

import com.example.quizzapp.model.Topic;
import com.example.quizzapp.repository.ITopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class TopicService implements ITopicService{
    @Autowired
    private ITopicRepository topicRepository;
    @Override
    public Iterable<Topic> findAll() {
        return topicRepository.findAll();
    }

    @Override
    public Optional<Topic> findById(Long id) {
        return topicRepository.findById(id);
    }

    @Override
    public Topic save(Topic topic) {
        return topicRepository.save(topic);
    }

    @Override
    public void remove(Long id) {
        topicRepository.deleteById(id);
    }

    @Override
    public Iterable<Topic> findAll(int page, int size) {
        PageRequest pageRequest = PageRequest.of(page,size);
        Page<Topic> topics = topicRepository.findAll(pageRequest);
        return topics.getContent();
    }
}
