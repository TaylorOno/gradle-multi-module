package com.github.taylorono.gradlemultimodule.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/api")
    public String sayHello() {
        return "hello";
    }
}
