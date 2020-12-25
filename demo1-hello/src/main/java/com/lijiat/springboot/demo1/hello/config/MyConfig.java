package com.lijiat.springboot.demo1.hello.config;

import com.lijiat.springboot.demo1.hello.service.PersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: demo1-hello
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-25 15:44
 */
@Configuration
public class MyConfig {

    /**
     * 将方法的返回值添加到容器中，容器中这个组件默认的id就是方法名
     * @return
     */
    @Bean
    public PersonService personService(){
        System.out.println("@Bean自动配置");
        return new PersonService();
    }
}
