package com.imaginnovate.Employee2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Employee2Service {

    @Autowired
    KafkaTemplate<String, Object> kafkaTemplate;

    @KafkaListener(topics = "employee-2", groupId = "employee-group")
    public void printCustomerMessages(String message){
        System.out.println("Manager:- " + message);
    }

    public void sendMessageToManager(String message){
        kafkaTemplate.send("employee2ToManager", message);
    }
}

