package com.openchat.openchat.controller;


import com.openchat.openchat.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage")    //THis annotations means -When a client sends a message to the endpoint /sendMessage,
                                       // this method will be triggered
    @SendTo("/topic/messages")
    //This aannotaions broadcast the return value to all the clients subscribed to particular topic


    public ChatMessage sendMessage(ChatMessage message)
    {
        return message;
    }

    @GetMapping("/chat")
    public String chat(){
        return "chat";
    }
}
