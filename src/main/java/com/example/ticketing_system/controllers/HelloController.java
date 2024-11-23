package com.example.ticketing_system.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
    @GetMapping("/messages")
    public List<String> getMessages() {
        return List.of("ane meka ba bn", "I hate oop", "FK IIT");
    }
}
