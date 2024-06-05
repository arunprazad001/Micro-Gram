package com.masai.MicroGram.service;

import com.masai.MicroGram.dao.MessageDao;
import com.masai.MicroGram.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class MessageService {
    @Autowired
    private MessageDao messageDAO;

    public Message findById(Long id) {
        return messageDAO.findById(id);
    }

    public List<Message> findAll() {
        return messageDAO.findAll();
    }

    public void save(Message message) {
        messageDAO.save(message);
    }

    public void update(Message message) {
        messageDAO.update(message);
    }

    public void delete(Long id) {
        messageDAO.delete(id);
    }
}
