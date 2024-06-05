package com.masai.MicroGram.dao;

import com.masai.MicroGram.entity.Message;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class MessageDao {
    private final List<Message> messages = new ArrayList<>();

    public Message findById(Long id) {
        return messages.stream().filter(message -> message.getId().equals(id)).findFirst().orElse(null);
    }

    public List<Message> findAll() {
        return new ArrayList<>(messages);
    }

    public void save(Message message) {
        messages.add(message);
    }

    public void update(Message message) {
        delete(message.getId());
        save(message);
    }

    public void delete(Long id) {
        messages.removeIf(message -> message.getId().equals(id));
    }
}
