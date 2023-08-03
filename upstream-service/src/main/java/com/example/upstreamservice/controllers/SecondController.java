package com.example.upstreamservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class SecondController {
    @GetMapping("/second")
    public String second() throws InterruptedException {
        TimeUnit.SECONDS.sleep(10);
        return "test";

    }
}
