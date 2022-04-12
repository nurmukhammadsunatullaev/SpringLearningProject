package com.example.springlearningproject.controller;

import com.example.springlearningproject.config.GenerateToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GenerateToken
    private String token;

    @GetMapping
    public String indexAction(){
        return token;
    }
}
