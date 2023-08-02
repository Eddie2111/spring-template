package com.example.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.concurrent.atomic.AtomicLong;

import com.example.api.Test;

@RestController
public class TestController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();// what does this do?
    @GetMapping("/")
    public Test test(@RequestParam(value="name", defaultValue="World") String name){
        return new Test(counter.incrementAndGet(), String.format(template, name));
    }
}
