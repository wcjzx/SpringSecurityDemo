package org.example.springsecuritydemo.Contraller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

        @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
