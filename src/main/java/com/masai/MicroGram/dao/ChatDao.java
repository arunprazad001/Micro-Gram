package com.masai.MicroGram.dao;

import com.masai.MicroGram.entity.Chat;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class ChatDao {
    private final List<Chat>chats=new ArrayList<>();

    public Chat findById(Long id){
        return chats.stream().filter(chat -> chat.getId().equals(id)).findFirst().orElse(null);
    }
    public List<Chat> findAll() {
        return new ArrayList<>(chats);
    }

    public void save(Chat chat) {
        chats.add(chat);
    }

    public void update(Chat chat) {
        delete(chat.getId());
        save(chat);
    }
    public void delete(Long id){
        chats.removeIf(chat -> chat.getId().equals(id));
    }
}
