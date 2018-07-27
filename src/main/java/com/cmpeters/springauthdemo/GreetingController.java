package com.cmpeters.springauthdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    @GetMapping
    public ResponseEntity<String> getBasicGreeting(){
        return ResponseEntity.ok("Hello, world");
    }



}
