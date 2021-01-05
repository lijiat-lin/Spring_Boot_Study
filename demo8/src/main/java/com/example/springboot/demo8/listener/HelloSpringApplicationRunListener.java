package com.example.springboot.demo8.listener;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @program: demo8
 * @description:
 * @author: zhangjialin
 * @create: 2021-01-05 16:53
 */
public class HelloSpringApplicationRunListener implements SpringApplicationRunListener {

    public HelloSpringApplicationRunListener(SpringApplication application, String[] args) {
    }

    @Override
    public void starting(ConfigurableBootstrapContext bootstrapContext) {
        System.out.println("********************** SpringApplicationRunListener ... starting ...");
    }

    @Override
    public void environmentPrepared(ConfigurableBootstrapContext bootstrapContext, ConfigurableEnvironment environment) {
        System.out.println("********************** SpringApplicationRunListener ... environmentPrepared ..."+environment.getSystemProperties().get("os.name"));
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("********************** SpringApplicationRunListener ... contextPrepared ...");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("********************** SpringApplicationRunListener ... contextLoaded ...");
    }

    @Override
    public void started(ConfigurableApplicationContext context) {
        System.out.println("********************** SpringApplicationRunListener ... started ...");
    }

    @Override
    public void running(ConfigurableApplicationContext context) {
        System.out.println("********************** SpringApplicationRunListener ... running ...");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.out.println("********************** SpringApplicationRunListener ... failed ...");
    }

}
