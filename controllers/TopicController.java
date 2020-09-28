package com.example.demo.controllers;

import com.example.demo.models.TopicModel;
import com.example.demo.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {


    //autowired = needs dependency injection
    @Autowired
    private TopicService topicService;

    @GetMapping("/topics")
    public List<TopicModel> getAllTopics(){
        return topicService.getAllTopics();
    }

    @GetMapping("/topics/{id}")
    public TopicModel getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

}








