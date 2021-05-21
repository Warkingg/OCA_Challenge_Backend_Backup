package com.example.quizzapp.repository;

import com.example.quizzapp.model.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHistoryRepository extends JpaRepository<History,Long> {
    History findHistoryByScore(int score);

    History findHistoryByUsername(String username);
}
