package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dockerController {

    @GetMapping(name = "/getDockerData")
    public String getDockerData()
    {
        return "Hello I am executing on Docker";
    }
}
