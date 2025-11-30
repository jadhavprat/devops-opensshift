package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageListener {

    @KafkaListener(topics = "openshift-topic", groupId = "group1")
    public void listen(String message) {
        System.out.println("Service B received: " + message);
    }
}