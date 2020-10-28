package com.d.controller;

import com.d.feign.ProviderFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Value("${server.port}")
    private int port;
    @Value("${spring.application.name}")
    private String name;
    @Autowired
    ProviderFeignClient providerFeignClient;

    @GetMapping(path = "/index")
    public String index() {
        return name + ":" + port;
    }

    @GetMapping(path = "/provider")
    public String provider() {
        return providerFeignClient.index();
    }
}
