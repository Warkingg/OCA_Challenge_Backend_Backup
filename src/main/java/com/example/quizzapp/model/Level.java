package com.example.quizzapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Level {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String difficulty;

    @OneToMany(mappedBy = "level",cascade = CascadeType.ALL)
    private List<Question> questions;

    @ManyToOne
    private Topic topic;

    public void addQuestion(Question question){
        if(getQuestions()==null){
            this.questions = new ArrayList<>();
        }
        getQuestions().add(question);
        question.setLevel(this);
    }

    public Level(String difficulty, List<Question> questions, Topic topic) {
        this.difficulty = difficulty;
        this.questions = questions;
        this.topic = topic;
    }

}
