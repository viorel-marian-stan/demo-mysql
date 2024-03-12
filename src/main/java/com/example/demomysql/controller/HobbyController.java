package com.example.demomysql.controller;

import com.example.demomysql.entity.HobbyEntity;
import com.example.demomysql.service.HobbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class HobbyController {
    private final HobbyService hobbyService;
    @Autowired
    public HobbyController(HobbyService hobbyService) {
        this.hobbyService = hobbyService;
    }

    @GetMapping("/health")
    public ResponseEntity<String> checkHealth() {
        return ResponseEntity.ok("Server is up and running...");
    }

    @GetMapping("/hobbies")
    public ResponseEntity<List<HobbyEntity>> getHobbies() {
        return ResponseEntity.ok(hobbyService.getHobbies());
    }

    @PostMapping("/hobbies/create")
    public ResponseEntity<HobbyEntity> createHobby(@RequestBody HobbyEntity hobbyEntity) {
        /*
        * @RequestBody = primesc un json care se deserializeaza direct in HobbyEntity
        * @RequestParam = primesc parametrul in url (query parameter) --> ex: http://localhost:8080/api/v1/hobbies?id=1
        * @PathVariable = parametru in url. se foloseste impreuna cu {} la anotarea de pe metoda ex: @GetMapping("/api/v1/hobbies/{id}")
        * @ModelAttribute = preluarea datelor entitatii din formular (in Postman ->> Body --> Form data)
        * */
        return ResponseEntity.ok(hobbyService.createHobby(hobbyEntity));
    }
}
