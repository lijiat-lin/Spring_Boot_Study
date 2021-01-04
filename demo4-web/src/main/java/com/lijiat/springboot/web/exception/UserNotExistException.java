package com.lijiat.springboot.web.exception;

/**
 * @program: demo4-web
 * @description:
 * @author: zhangjialin
 * @create: 2021-01-04 10:27
 */
public class UserNotExistException extends RuntimeException{

    public UserNotExistException() {
        super("用户不存在");
    }
}
