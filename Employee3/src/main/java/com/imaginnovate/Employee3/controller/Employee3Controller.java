package com.imaginnovate.Employee3.controller;

import com.imaginnovate.Employee3.service.Employee3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("/employee3")
public class Employee3Controller {


    @Autowired
    private Employee3Service employee3Service;

    @PostMapping(value = "manager")
    public ResponseEntity sendMessageToManager(@RequestParam("message") String message){
        System.out.println("You:- "+ message);
        employee3Service.sendMessageToManager(message);
        return new ResponseEntity<>(Map.of("Message", "Message Delivered to Manager"), HttpStatus.OK);
    }
}
