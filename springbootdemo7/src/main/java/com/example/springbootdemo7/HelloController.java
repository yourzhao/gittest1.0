package com.example.springbootdemo7;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    String hello(){
        return "第二个springboot demo";
    }
}
