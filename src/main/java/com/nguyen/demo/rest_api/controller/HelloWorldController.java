package com.nguyen.demo.rest_api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// @Controller
// @ResponseBody
@RestController
public class HelloWorldController {

    //HTTP GET request
    // http://localhost:8081/hello-world
    @GetMapping("/hello-world")
    public String hellowWorld(){
        return "Hello World!";
    }
}
