package com.example.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    @KafkaListener(topics = "producer_topic", groupId = "")
    public void listenToTopic(String message){
        System.out.println("message is recieved" +message);

    }
}
