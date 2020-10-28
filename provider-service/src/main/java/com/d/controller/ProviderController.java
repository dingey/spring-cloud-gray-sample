package com.d.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @Value("${server.port}")
    private int port;
    @Value("${spring.application.name}")
    private String name;

    @GetMapping(path = "/index")
    public String index() {
        return name + ":" + port;
    }
}
