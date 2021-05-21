package com.example.quizzapp.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "topic", cascade = CascadeType.ALL)
    private List<Level> levels;

    public Topic(String name) {this.name = name;}

    public void addLevel(Level level){
        if(getLevels()==null){
            this.levels = new ArrayList<>();
        }
        getLevels().add(level);
        level.setTopic(this);
    }

    public Topic() {
    }

    public Topic(String name, List<Level> levels) {
        this.name = name;
        this.levels = levels;
    }
}
