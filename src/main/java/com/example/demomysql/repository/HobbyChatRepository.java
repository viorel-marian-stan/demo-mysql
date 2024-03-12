package com.example.demomysql.repository;

import com.example.demomysql.entity.HobbyChatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HobbyChatRepository extends JpaRepository<HobbyChatEntity, Integer> {
}
