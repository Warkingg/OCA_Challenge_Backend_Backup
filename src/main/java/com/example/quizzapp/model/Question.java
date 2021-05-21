package com.example.quizzapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    private boolean isAnswered;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private List<Answer> answers;

    @ManyToOne
    private Level level;

    public void addAnswer(Answer answer){
        if(getAnswers()==null){
            this.answers = new ArrayList<>();
        }
        getAnswers().add(answer);
        answer.setQuestion(this);
    }

    public Question(String type, boolean isAnswered, List<Answer> answers, Level level) {
        this.type = type;
        this.isAnswered = isAnswered;
        this.answers = answers;
        this.level = level;
    }
}
