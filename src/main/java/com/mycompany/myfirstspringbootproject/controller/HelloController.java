package com.mycompany.myfirstspringbootproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String greetUser(){
        return "Hello User";
    }
    
}
