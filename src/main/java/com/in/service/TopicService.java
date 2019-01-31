package com.in.service;

import com.in.controller.Topic;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class  TopicService {

    List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("1", "Alex", "Java"),
            new Topic("2", "Mike", "Javascript"),
            new Topic("3", "Alike", "Swift")));


    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();  //!!!
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if (t.getId().equals(id)) {
                topics.set(i, topic);
                return;
            }
        }
    }

    /* My example
    public void deleteTopic(String id) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if (t.getId().equals(id)) {
                topics.remove(i);
                return;
            }
        }
   }
*/
    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}

