package com.example.quizzapp.service.history;

import com.example.quizzapp.model.History;
import com.example.quizzapp.repository.IHistoryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class HistoryService implements IHistoryService{
    private IHistoryRepository historyRepository;

    @Override
    public Iterable<History> findAll() {
        return historyRepository.findAll();
    }

    @Override
    public Optional<History> findById(Long id) {
        return historyRepository.findById(id);
    }

    @Override
    public History save(History history) {
        return save(history);
    }

    @Override
    public void remove(Long id) {
        historyRepository.deleteById(id);
    }

    @Override
    public History findHistoryByScore(int score) {
        return null;
    }

    @Override
    public History findHistoryByUsername(String username) {
        return null;
    }

    @Override
    public Iterable<History> findAll(int page, int size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        Page<History> histories = historyRepository.findAll(pageRequest);
        return histories.getContent();
    }
}
