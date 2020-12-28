package com.lijiat.springboot.logging;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class Demo3LoggingApplicationTests {

    /**
     * 日志
     */
    private static final Logger LOG = LoggerFactory.getLogger(Demo3LoggingApplicationTests.class);

    @Test
    public void contextLoads() {
        //日志的级别；
        //由低到高   trace<debug<info<warn<error
        //可以调整输出的日志级别；日志就只会在这个级别以以后的高级别生效
        LOG.trace("这是trace日志...");
        LOG.debug("这是debug日志...");
        //SpringBoot默认给我们使用的是info级别的，没有指定级别的就用SpringBoot默认规定的级别；root级别
        LOG.info("这是info日志...");
        LOG.warn("这是warn日志...");
        LOG.error("这是error日志...");
    }

}
