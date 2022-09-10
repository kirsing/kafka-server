package com.example.mykafkaserver.controller;

import com.example.mykafkaserver.model.User;
import com.example.mykafkaserver.producer.KafkaJsonProducer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {
//    KafkaTemplate kafkaTemplate;
    private final KafkaJsonProducer jsonProducer;
    @GetMapping
    public void getList(){
//        kafkaTemplate.sendMessage(new User("John"));
        jsonProducer.sendMessage(new User("Lion"));
    }
}