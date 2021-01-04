package com.lijiat.springboot.web.controller;

import com.lijiat.springboot.web.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: demo4-web
 * @description:
 * @author: zhangjialin
 * @create: 2021-01-04 10:37
 */
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(UserNotExistException.class)
    public String handlerException(Exception e, HttpServletRequest request){
        Map<String,Object>  map = new HashMap<>();
        map.put("code","user not exist");
        map.put("message",e.getMessage());
        request.setAttribute("java.servlet.error.status_code",500);
        request.setAttribute("ext",map);
        return "forward:/error";
    }
}
