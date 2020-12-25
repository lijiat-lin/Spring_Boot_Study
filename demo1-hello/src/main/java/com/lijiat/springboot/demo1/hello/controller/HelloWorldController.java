package com.lijiat.springboot.demo1.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo1-hello
 * @description: helloworld
 * @author: zhangjialin
 * @create: 2020-12-25 10:35
 */
@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello world";
    }
}
