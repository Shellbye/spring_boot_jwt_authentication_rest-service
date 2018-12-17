package com.shellbye.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@EnableEurekaClient
public class ServiceController {

    @Autowired
    private MyMsgProperties myMsgProperties;

    @RequestMapping("/msg")
    public String getMsg() {
        return "I provide " + myMsgProperties.getContent();
    }
}
