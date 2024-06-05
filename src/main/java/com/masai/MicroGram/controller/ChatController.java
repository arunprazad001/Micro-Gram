package com.masai.MicroGram.controller;

import com.masai.MicroGram.entity.Chat;
import com.masai.MicroGram.service.ChatService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/chats")
public class ChatController {
    @Autowired
    private ChatService chatService;

    @GetMapping("get/{id}")
    public Chat getChatById(@PathVariable Long id) {
        return chatService.findById(id);
    }

    @GetMapping("/findAll")
    public List<Chat> getAllChats() {
        return chatService.findAll();
    }

    @PostMapping("/create")
    public void createChat(@RequestBody Chat chat) {
        chatService.save(chat);
    }

    @PutMapping("update/{id}")
    public void updateChat(@PathVariable Long id, @RequestBody Chat chat) {
        chat.setId(id);
        chatService.update(chat);
    }

    @DeleteMapping("delete/{id}")
    public void deleteChat(@PathVariable Long id) {
        chatService.delete(id);
    }
}
