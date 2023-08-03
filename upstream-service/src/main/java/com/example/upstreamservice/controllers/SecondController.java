package com.example.upstreamservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.concurrent.TimeUnit;

@Controller
public class SecondController {
    @GetMapping("/second")
    public String second() throws InterruptedException {
        TimeUnit.SECONDS.sleep(20);
        return "test";

    }
}
