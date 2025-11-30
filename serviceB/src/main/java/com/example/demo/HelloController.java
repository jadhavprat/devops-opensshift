package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/openshift")
    public String hello() {
        return "Hello Kubernetes & OpenShift! from serviceB";
    }
}
