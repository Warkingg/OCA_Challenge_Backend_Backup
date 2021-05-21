package com.example.quizzapp.service.level;

import com.example.quizzapp.model.Level;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class LevelService implements ILevelService{
    @Override
    public Page<Level> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Level> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Level save(Level level) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
