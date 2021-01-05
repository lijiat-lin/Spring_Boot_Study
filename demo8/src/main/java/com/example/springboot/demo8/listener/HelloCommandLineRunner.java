package com.example.springboot.demo8.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @program: demo8
 * @description:
 * @author: zhangjialin
 * @create: 2021-01-05 17:19
 */
@Component
public class HelloCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("********************** HelloCommandLineRunner ... run "+ Arrays.asList(args));
    }
}
