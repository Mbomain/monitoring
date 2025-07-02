package com.example.demo.endpoint.rest.controller;

import org.springframework.stereotype.Controller;

@Controller("/hello")
public class hello {
    public String index() {
        return "Hello, World!";
    }
}
