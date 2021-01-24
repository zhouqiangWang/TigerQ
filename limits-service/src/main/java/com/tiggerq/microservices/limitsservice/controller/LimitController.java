package com.tiggerq.microservices.limitsservice.controller;

import com.tiggerq.microservices.limitsservice.bean.Limits;
import com.tiggerq.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
    @Autowired
    private Configuration configuration;
    @GetMapping("/limits")
    public Limits list() {
        //return new Limits(1, 1000);
        return new Limits(configuration.getMin(),configuration.getMax());
    }
}
