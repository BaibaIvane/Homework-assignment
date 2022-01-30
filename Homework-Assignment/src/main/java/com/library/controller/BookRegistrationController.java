package com.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRegistrationController {

    @GetMapping("/")
    public String method() {
        return "Hello there!";
    }
}
