package com.lijiat.springboot.demo1.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = "{classpath:bean.xml}")
@SpringBootApplication
public class Demo1HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo1HelloApplication.class, args);
    }

}
