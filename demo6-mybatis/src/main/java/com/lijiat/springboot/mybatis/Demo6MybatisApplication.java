package com.lijiat.springboot.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.lijiat.springboot.mybatis.dao")
public class Demo6MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo6MybatisApplication.class, args);
    }

}
