package com.example.quizzapp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String topicName;

    private String level;

    private int totalTime;

    private int score;

    @ManyToOne
    private User user;

    public History() {
    }

    public History(String username, String topicName, String level, int totalTime, int score) {
        this.username = username;
        this.topicName = topicName;
        this.level = level;
        this.totalTime = totalTime;
        this.score = score;
    }
}
