package com.cove.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping
    public String home() {
        return "Hello, Home Page";
    }

    @GetMapping("/login")
    public String login() {
        return "test";
    }


    @GetMapping("/student")
    public String user() {
        return "Hello, student";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Hello, admin";
    }

    @GetMapping("/instructor")
    public String instructor() {
        return "Hello, instructor";
    }
}
