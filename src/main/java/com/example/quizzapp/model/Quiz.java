package com.example.quizzapp.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String topicName;

    private Integer score;

    private Integer totalTime;

    @ManyToMany(mappedBy = "quiz", cascade = CascadeType.ALL)
    private List<History> histories;

}
