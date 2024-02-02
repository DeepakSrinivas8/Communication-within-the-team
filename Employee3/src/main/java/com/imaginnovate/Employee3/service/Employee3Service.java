package com.imaginnovate.Employee3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Employee3Service {

    @Autowired
    KafkaTemplate<String, Object> kafkaTemplate;

    @KafkaListener(topics = "employee-3", groupId = "employee-group")
    public void printCustomerMessages(String message){
        System.out.println("Manager:- " + message);
    }

    public void sendMessageToManager(String message){
        kafkaTemplate.send("employee3ToManager", message);
    }
}
