package com.imaginnovate.Employee1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Employee1Service {

    @Autowired
    KafkaTemplate<String, Object> kafkaTemplate;

    @KafkaListener(topics = "employee-1", groupId = "employee-group")
    public void printManagerMessages(String message){
        System.out.println("Manager:- " + message);
    }

    public void sendMessageToManager(String message){
        kafkaTemplate.send("employee1ToManager", message);
    }
}
