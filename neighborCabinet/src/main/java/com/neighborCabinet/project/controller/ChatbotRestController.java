package com.neighborCabinet.project.controller;

import com.neighborCabinet.project.service.ChatbotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatbotRestController {

    private ChatbotService chatbotService;

    @Autowired
    public ChatbotRestController(ChatbotService chatbotService){
        this.chatbotService = chatbotService;
    }

    //챗봇
    @RequestMapping("/chatbot1")
    public String chatbot1 (@RequestParam("message") String message){
        String result = chatbotService.main(message);
        return result;
    }


}
