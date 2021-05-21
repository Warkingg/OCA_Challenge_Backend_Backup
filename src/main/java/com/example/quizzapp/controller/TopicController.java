package com.example.quizzapp.controller;

import com.example.quizzapp.model.Topic;
import com.example.quizzapp.service.topic.ITopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/topics")
public class TopicController {
    @Autowired
    private ITopicService topicService;

    @GetMapping
    public ResponseEntity<Iterable<Topic>> getAllTopic() {
        return new ResponseEntity<>(topicService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/pagination")
    public ResponseEntity<Iterable<Topic>> getAllTopicUsingPagination(@RequestParam int page, @RequestParam int size) {
        Iterable<Topic> topics = topicService.findAll(page, size);
        return new ResponseEntity<>(topics, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Topic> createTopic(@RequestBody Topic topic) {
        return new ResponseEntity<>(topicService.save(topic), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Topic> getTopic(@PathVariable("id") Long id) {
        Optional<Topic> topicOptional = topicService.findById(id);
        return new ResponseEntity<>(topicOptional.get(), HttpStatus.OK);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Topic> editTopic(@RequestBody Topic topic) {
        Topic topic1 = topicService.save(topic);
        return new ResponseEntity<>(topic1, HttpStatus.OK);
    }

}
