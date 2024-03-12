package com.example.demomysql.service;

import com.example.demomysql.entity.HobbyChatEntity;
import com.example.demomysql.entity.HobbyEntity;
import com.example.demomysql.repository.HobbyChatRepository;
import com.example.demomysql.repository.HobbyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HobbyService {
    private final HobbyRepository hobbyRepository;
    private final HobbyChatRepository hobbyChatRepository;
    @Autowired
    public HobbyService(HobbyRepository hobbyRepository, HobbyChatRepository hobbyChatRepository) {
        this.hobbyRepository = hobbyRepository;
        this.hobbyChatRepository = hobbyChatRepository;
    }

    public List<HobbyEntity> getHobbies() {
        return hobbyRepository.findAll();
    }

    @Transactional
    public HobbyEntity createHobby(HobbyEntity hobbyEntity) {
        //validari ca totul e in regula cu entitatea --> ex: validationService.validate(hobbyEntity), aruncare exceptie (eventual custom exception si tratata)
        HobbyChatEntity chatEntity =
                HobbyChatEntity.builder()
                .chatName(hobbyEntity.getName() + "_chat")
                .build();
        HobbyChatEntity createdChat = hobbyChatRepository.save(chatEntity);
        hobbyEntity.setChatId(createdChat.getId());
        return hobbyRepository.save(hobbyEntity);
    }
}
