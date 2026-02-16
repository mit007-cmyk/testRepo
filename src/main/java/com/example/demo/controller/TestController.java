package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test-npe")
    public String testNPE() {

        String text = null;

        // This will throw NullPointerException
        return text.length() + "";
    }
}
