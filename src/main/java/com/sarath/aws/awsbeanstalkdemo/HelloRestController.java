package com.sarath.aws.awsbeanstalkdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {


    @GetMapping
    public String hello(){
        return "Hello from sarath";
    }
}


