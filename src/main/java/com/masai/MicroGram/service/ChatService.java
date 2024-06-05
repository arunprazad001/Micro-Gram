package com.masai.MicroGram.service;

import com.masai.MicroGram.dao.ChatDao;
import com.masai.MicroGram.entity.Chat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ChatService {
    @Autowired
    private ChatDao chatDAO;

    public Chat findById(Long id) {
        return chatDAO.findById(id);
    }

    public List<Chat> findAll() {
        return chatDAO.findAll();
    }

    public void save(Chat chat) {
        chatDAO.save(chat);
    }

    public void update(Chat chat) {
        chatDAO.update(chat);
    }

    public void delete(Long id) {
        chatDAO.delete(id);
    }
}
