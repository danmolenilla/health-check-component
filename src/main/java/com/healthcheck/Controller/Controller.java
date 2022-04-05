package com.healthcheck.Controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/")
public class Controller {

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public String sayHello() {
        System.out.println("Hello World");
        return "Hello";
    }
}
