package com.example.demomysql.service;

import com.example.demomysql.entity.HobbyChatEntity;
import com.example.demomysql.repository.HobbyChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class HobbyChatService {
    private final HobbyChatRepository hobbyChatRepository;
    @Autowired
    public HobbyChatService(HobbyChatRepository hobbyChatRepository) {
        this.hobbyChatRepository = hobbyChatRepository;
    }

    public List<HobbyChatEntity> getHobbiesChat() {
        return hobbyChatRepository.findAll();
    }
}
