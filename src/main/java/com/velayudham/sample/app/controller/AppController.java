package com.velayudham.sample.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/say_hello_from_app")
    String sayHello() {
        return "Hello Sir, I am from App1";
    }
}
