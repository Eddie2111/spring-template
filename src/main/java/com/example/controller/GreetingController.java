package com.example.controller;

import java.util.concurrent.atomic.AtomicLong;
import com.example.api.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// The @RestController annotation tells Spring to render the resulting string directly back to the caller.
// The @GetMapping annotation ensures that HTTP GET requests to /greeting are mapped to the greeting() method.
// The @RequestParam binds the value of the query string parameter name into the name parameter of the greeting() method.

@RestController
public class GreetingController{
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting") // The @GetMapping annotation ensures that HTTP GET requests to /greeting are mapped to the greeting() method.
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}