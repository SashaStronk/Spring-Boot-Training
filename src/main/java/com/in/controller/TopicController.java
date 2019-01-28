package com.in.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                    new Topic("1", "Alex", "Java"),
                    new Topic("2", "Mike", "Javascript"),
                    new Topic("3", "Alike", "Swift")
        );

    }
}
