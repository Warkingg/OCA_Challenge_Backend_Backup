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

}
