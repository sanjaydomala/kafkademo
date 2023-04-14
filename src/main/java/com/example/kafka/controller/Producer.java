package com.example.kafka.controller;

import com.example.kafka.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka/api")
public class Producer {

    @Autowired
    ProducerService producerService;

    @GetMapping("/producerMsg")
    public void getMessagefromClient(@RequestParam("message") String message){
        producerService.sendMessageToTopic(message);

    }
}
