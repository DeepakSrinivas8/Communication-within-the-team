package com.imaginnovate.Manager.controller;


import com.imaginnovate.Manager.service.ManagerService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private ManagerService managerService;


    @PostMapping(value = "employee1")
    public ResponseEntity sendMessageToEmployee1(@RequestParam("message") String message){
        System.out.println("Manager to Employee-1:- "+ message);
        managerService.sendMessageToEmployee1(message);
        return new ResponseEntity<>(Map.of("Message", "Message Delivered to Employee 1"), HttpStatus.OK);
    }

    @PostMapping(value = "employee2")
    public ResponseEntity sendMessageToEmployee2(@RequestParam("message") String message){
        System.out.println("Manager to Employee-2:- "+ message);
        managerService.sendMessageToEmployee2(message);
        return new ResponseEntity<>(Map.of("Message", "Message Delivered to Employee 2"), HttpStatus.OK);
    }

    @PostMapping(value = "employee3")
    public ResponseEntity sendMessageToEmployee3(@RequestParam("message") String message){
        System.out.println("Manager to Employee-3:- "+ message);
        managerService.sendMessageToEmployee3(message);
        return new ResponseEntity<>(Map.of("Message", "Message Delivered to Employee 3"), HttpStatus.OK);
    }

}
