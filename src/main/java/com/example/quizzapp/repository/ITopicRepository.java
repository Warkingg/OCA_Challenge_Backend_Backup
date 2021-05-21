package com.example.quizzapp.repository;

import com.example.quizzapp.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITopicRepository extends JpaRepository<Topic,Long> {
}
