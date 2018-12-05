package com.shellbye.rest;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@EnableEurekaClient
public class ServiceController {
    @RequestMapping("/msg")
    public String getImages() {
        return "I provide msg001";
    }
}
