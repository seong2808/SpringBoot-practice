package com.example.firstproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping(value = "helloWorld")
    public String helloWorld() {
        return "hello World";
    }
}
