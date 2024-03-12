package com.example.demomysql.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "hobbies")
public class HobbyEntity {
    @Id
    @Column(name = "hobby_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "hobby_name")
    private String name;
    @Column(name = "hobby_image")
    private byte[] hobbyImage;
    @Column(name = "chat_id")
    private int chatId;
}
