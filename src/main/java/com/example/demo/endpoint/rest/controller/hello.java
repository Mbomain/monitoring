package com.example.demo.endpoint.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/hello")
public class hello {
    @GetMapping
    public String index() {
        return "Hello, World!";
    }
}
