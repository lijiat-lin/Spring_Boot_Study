package com.lijiat.springboot.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @program: demo4-web
 * @description:
 * @author: zhangjialin
 * @create: 2021-01-04 13:54
 */
public class MyListener  implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("contextInitialized.................web应用启动");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("contextDestroyed....................当前web项目销毁");
    }
}
