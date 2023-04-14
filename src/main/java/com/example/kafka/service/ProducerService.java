package com.example.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
     KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessageToTopic(String message) {

        kafkaTemplate.send("prodcuer_topic", message);
    }
}
