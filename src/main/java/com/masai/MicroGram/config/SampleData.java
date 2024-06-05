package com.masai.MicroGram.config;

import com.masai.MicroGram.entity.Chat;
import com.masai.MicroGram.entity.Message;
import com.masai.MicroGram.service.ChatService;
import com.masai.MicroGram.service.MessageService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SampleData {
    @Autowired
    private ChatService chatService;

    @Autowired
    private MessageService messageService;

    @PostConstruct
    public void init() {
        Chat chat1 = new Chat(1L, "Casual Chat");
        Chat chat2 = new Chat(2L, "Tech Chat");
        chatService.save(chat1);
        chatService.save(chat2);

        Message message1 = new Message(1L, "Hello, everyone!", 1L);
        Message message2 = new Message(2L, "Let's talk about tech!", 2L);
        messageService.save(message1);
        messageService.save(message2);
    }
}
