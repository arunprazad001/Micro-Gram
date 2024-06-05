package com.masai.MicroGram.controller;

import com.masai.MicroGram.entity.Message;
import com.masai.MicroGram.service.MessageService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/messages")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping("get/{id}")
    public Message getMessageById(@PathVariable Long id) {
        return messageService.findById(id);
    }

    @GetMapping("/findAll")
    public List<Message> getAllMessages() {
        return messageService.findAll();
    }

    @PostMapping("/create")
    public void createMessage(@RequestBody Message message) {
        messageService.save(message);
    }

    @PutMapping("update/{id}")
    public void updateMessage(@PathVariable Long id, @RequestBody Message message) {
        message.setId(id);
        messageService.update(message);
    }

    @DeleteMapping("delete/{id}")
    public void deleteMessage(@PathVariable Long id) {
        messageService.delete(id);
    }
}
