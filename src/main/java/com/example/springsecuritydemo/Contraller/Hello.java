package com.example.springsecuritydemo.Contraller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
