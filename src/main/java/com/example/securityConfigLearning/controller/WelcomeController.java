package com.example.securityConfigLearning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class WelcomeController {

    @GetMapping("/")
    public String getWelcome() {
        return "welcome";
    }

    @GetMapping("/admin")
    public String adminApi() {
        return "admin";
    }

    @GetMapping("/user")
    public String userApi() {
        return "user";
    }
}
