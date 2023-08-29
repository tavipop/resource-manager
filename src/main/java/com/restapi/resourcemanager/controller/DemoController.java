package com.restapi.resourcemanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/demo")
public class DemoController {

    @GetMapping(value = "/resource")
    public String getTestData() {
        return "Hello from server!";
    }

}
