package com.example.docker_prac;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldContainer {
    @GetMapping(path = "/")
    public String helloWorld() {
        return "Hello World";
    }
}
