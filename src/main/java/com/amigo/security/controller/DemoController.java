package com.amigo.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo/")
public class DemoController {

    @GetMapping("sayHello")
    @Secured("USER")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok().body("Hello from secured endpoint");
    }
}
