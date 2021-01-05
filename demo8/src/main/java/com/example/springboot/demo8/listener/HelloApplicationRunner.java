package com.example.springboot.demo8.listener;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @program: demo8
 * @description:
 * @author: zhangjialin
 * @create: 2021-01-05 17:19
 */
@Component
public class HelloApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("********************** HelloApplicationRunner ... run");
    }
}
