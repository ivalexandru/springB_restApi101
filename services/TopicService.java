package com.example.demo.services;

import com.example.demo.models.TopicModel;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

//singleton, an instance will be created at startup

@Service
public class TopicService {

 List<TopicModel>  topics = Arrays.asList(
        new TopicModel("spring", "spr fr", "descriere spring"),
        new TopicModel("autumn", "autumn fr", "descriere autumn"),
        new TopicModel("winter", "winter fr", "descriere winter")
        );

 public List<TopicModel> getAllTopics(){
    return topics;
 }

 public TopicModel getTopic( String id){

     return topics.stream()
             .filter(i -> i.getId().equals(id))
             .findFirst()
             .get();
 }

}
