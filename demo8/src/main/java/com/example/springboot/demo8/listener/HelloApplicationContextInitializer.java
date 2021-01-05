package com.example.springboot.demo8.listener;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @program: demo8
 * @description:
 * @author: zhangjialin
 * @create: 2021-01-05 16:47
 */

public class HelloApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("********************** HelloApplicationContextInitializer ...initialize... "+applicationContext);
    }
}
