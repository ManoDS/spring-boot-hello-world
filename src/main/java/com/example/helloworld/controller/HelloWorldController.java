package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String sendGreetings() {
        return "Hello, how are you!";
    }

    @GetMapping("/meeting")
    public String sendMeetings() { return "Hello, I am inside a meeting!"; }
}
