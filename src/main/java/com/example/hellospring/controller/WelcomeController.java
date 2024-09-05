package com.example.hellospring.controller;


import com.example.hellospring.model.Message;
import com.example.hellospring.service.WelcomeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Welcome")
public class WelcomeController {

 private final WelcomeService welcomeService;


    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }


    @GetMapping("")
    public ResponseEntity<List<Message>> getAllMessages(){
        List<Message> messages = welcomeService.getAllMessages();
        return new ResponseEntity<>(messages, HttpStatus.OK);

    }
}
