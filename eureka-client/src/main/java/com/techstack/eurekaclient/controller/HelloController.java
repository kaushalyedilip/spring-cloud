package com.techstack.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

    @Value("${message: Default Hello}")
    private String message;

    @GetMapping("hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("message")
    public String getProperty() {
        return message;
    }
}
