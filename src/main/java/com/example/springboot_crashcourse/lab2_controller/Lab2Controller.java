package com.example.springboot_crashcourse.lab2_controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Lab2Controller {
    @GetMapping("/greetings")
    public String greetWithParam(@RequestParam(value = "name", required = false, defaultValue = "the default value") String name) {
        return "Greetings with param!: " + name;
    }

    @GetMapping("/sum/{num1}/{num2}")
    public String getSum(
            @PathVariable int num1,
            @PathVariable int num2,
            @RequestParam(value = "sender", required = true, defaultValue = "default name") String sender
    ) {
        return String.format("Hi %s. The sum of %d and %d is %d", sender, num1, num2, (num1 + num2));
    }
}
