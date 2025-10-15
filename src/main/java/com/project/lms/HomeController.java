package com.project.lms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Library Management System is running";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
