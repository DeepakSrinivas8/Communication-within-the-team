package com.imaginnovate.Employee1.controller;


import com.imaginnovate.Employee1.service.Employee1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("/employee1")
public class Employee1Controller {

    @Autowired
    private Employee1Service employee1Service;

    @PostMapping(value = "manager")
    public ResponseEntity sendMessageToManager(@RequestParam("message") String message){
        System.out.println("You:- "+ message);
        employee1Service.sendMessageToManager(message);
        return new ResponseEntity<>(Map.of("Message", "Message Delivered to Manager"), HttpStatus.OK);
    }


}
