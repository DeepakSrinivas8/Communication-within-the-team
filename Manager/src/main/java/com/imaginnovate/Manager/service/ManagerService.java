package com.imaginnovate.Manager.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    @KafkaListener(topics = "employee1ToManager", groupId = "employee-group")
    public void printEmployee1Messages(String message){
        System.out.println("Employee1:- " + message);
    }

    @KafkaListener(topics = "employee2ToManager", groupId = "employee-group")
    public void printEmployee2Messages(String message){
        System.out.println("Employee2:- " + message);
    }

    @KafkaListener(topics = "employee3ToManager", groupId = "employee-group")
    public void printEmployee3Messages(String message){
        System.out.println("Employee3:- " + message);
    }

    public void sendMessageToEmployee1(String message){
        kafkaTemplate.send("employee-1", message);
    }

    public void sendMessageToEmployee2(String message){
        kafkaTemplate.send("employee-2", message);
    }

    public void sendMessageToEmployee3(String message){
        kafkaTemplate.send("employee-3", message);
    }

}
