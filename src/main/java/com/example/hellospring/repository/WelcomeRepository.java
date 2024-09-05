package com.example.hellospring.repository;

import com.example.hellospring.controller.WelcomeController;
import com.example.hellospring.model.Message;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class WelcomeRepository {
    private int messageID = 1;
    private final List<Message> messages = new ArrayList<>();

    public WelcomeRepository(){
        populateMessages();
    }



    private int getMessageID(){
        return messageID++;
    }
    private void populateMessages(){
        messages.add(new Message(getMessageID(),"Hej Spring 1"));
        messages.add(new Message(getMessageID(),"Hej Spring 2"));
        messages.add(new Message(getMessageID(),"Hej Spring 3"));
    }

    public List<Message> getAllMessages() {
        return messages;
    }
}
