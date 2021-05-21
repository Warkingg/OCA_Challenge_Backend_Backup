package com.example.quizzapp.service.history;

import com.example.quizzapp.model.History;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class HistoryService implements IHistoryService{
    @Override
    public Page<History> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<History> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public History save(History history) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public History findHistoryByScore(int score) {
        return null;
    }

    @Override
    public History findHistoryByUsername(String username) {
        return null;
    }
}
