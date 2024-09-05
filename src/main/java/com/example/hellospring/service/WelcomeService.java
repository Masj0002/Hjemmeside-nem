package com.example.hellospring.service;

import com.example.hellospring.model.Message;
import com.example.hellospring.repository.WelcomeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WelcomeService {
    private final WelcomeRepository welcomeRepository;

    public WelcomeService(WelcomeRepository welcomeRepository) {
        this.welcomeRepository = welcomeRepository;
    }

    public List<Message> getAllMessages(){
        return welcomeRepository.getAllMessages();
    }
}
