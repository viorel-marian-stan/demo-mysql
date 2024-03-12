package com.example.demomysql.repository;

import com.example.demomysql.entity.HobbyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HobbyRepository extends JpaRepository<HobbyEntity, Integer> {
}
