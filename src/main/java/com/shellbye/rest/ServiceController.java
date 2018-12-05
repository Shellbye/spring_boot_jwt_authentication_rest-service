package com.shellbye.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ServiceController {
    @RequestMapping("/msg")
    public String getImages() {
        return "I provide msg001";
    }
}
