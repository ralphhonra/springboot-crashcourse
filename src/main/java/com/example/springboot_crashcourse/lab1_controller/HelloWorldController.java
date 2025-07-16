package com.example.springboot_crashcourse.lab1_controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Value("${app.greeting.message}")
    private String customGreeting;

    @GetMapping(path = "/hello")
    public String sayHello() {
        return customGreeting;
    }
}
