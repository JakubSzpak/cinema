package com.szpak.cinema.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

    @GetMapping("/health")
    public String health() {
        return "ok";
    }
}