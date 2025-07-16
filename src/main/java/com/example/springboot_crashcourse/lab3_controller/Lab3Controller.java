package com.example.springboot_crashcourse.lab3_controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Lab3Controller {
    @GetMapping("/info")
    public Map<String, String> getAppInfo() {
        Map<String, String> info = new HashMap<>();
        info.put("appName", "MyFirstSpringBootAPI");
        info.put("version", "1.0.0");
        info.put("status", "Running");

        return info;
    }

    @GetMapping("/features")
    public ArrayList<String> getFeatures() {
        return new ArrayList<>(Arrays.asList("REST API", "Spring Boot", "Easy Setup", "Fast Development"));
    }
}
