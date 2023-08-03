package com.example.webapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class FirstController {
    private final WebClient webClient = WebClient.builder().build();

    @GetMapping("/first")
    public Mono<String> first() {
        return webClient.get().uri("http://127.0.0.1:8090/second")
                .exchangeToMono(clientResponse -> clientResponse.bodyToMono(String.class));
    }
}
