package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String callServiceB() {
        String response = restTemplate.getForObject("http://localhost:9091/openshift", String.class);
        return "Service-A says → " + response;
    }
}