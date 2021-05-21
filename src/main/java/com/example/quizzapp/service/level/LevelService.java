package com.example.quizzapp.service.level;

import com.example.quizzapp.model.Level;
import com.example.quizzapp.model.Topic;
import com.example.quizzapp.repository.ILevelRepository;
import com.example.quizzapp.repository.ITopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class LevelService implements ILevelService{
    @Autowired
    private ILevelRepository levelRepository;

    @Autowired
    private ITopicRepository topicRepository;

    @Override
    public Page<Level> findAll(Pageable pageable) {
        return levelRepository.findAll(pageable);
    }

    @Override
    public Optional<Level> findById(Long id) {
        return levelRepository.findById(id);
    }

    @Override
    public Level save(Level level) {
        return null;
    }

    @Override
    public void remove(Long id) {
        levelRepository.deleteById(id);
    }

    @Override
    public Level addLevel(Level level, Topic topic) {
        topic.addLevel(level);
        return levelRepository.save(level);
    }
}
