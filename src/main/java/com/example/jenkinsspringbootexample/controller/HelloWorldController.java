package com.example.jenkinsspringbootexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello_world")
    public String helloWorld() {
        return "hello world";
    }
}
