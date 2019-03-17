package com.sda.demo.sdademo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String getHelloWorld() {
        return "Hello world Spring!";
    }

}
