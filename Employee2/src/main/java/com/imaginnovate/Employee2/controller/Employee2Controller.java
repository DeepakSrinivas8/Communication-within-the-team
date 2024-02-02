package com.imaginnovate.Employee2.controller;

import com.imaginnovate.Employee2.service.Employee2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("/employee2")
public class Employee2Controller {

    @Autowired
    private Employee2Service employee2Service;

    @PostMapping(value = "manager")
    public ResponseEntity sendMessageToManager(@RequestParam("message") String message){
        System.out.println("You:- "+ message);
        employee2Service.sendMessageToManager(message);
        return new ResponseEntity<>(Map.of("Message", "Message Delivered to Manager"), HttpStatus.OK);
    }
}
