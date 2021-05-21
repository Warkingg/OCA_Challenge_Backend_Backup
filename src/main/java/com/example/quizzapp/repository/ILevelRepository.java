package com.example.quizzapp.repository;

import com.example.quizzapp.model.Level;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILevelRepository extends JpaRepository<Level,Long> {
}
