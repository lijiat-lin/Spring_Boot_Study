package com.lijiat.springboot.web.component;

import org.apache.logging.log4j.util.Strings;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: demo4-web
 * @description: 登录检查
 * @author: zhangjialin
 * @create: 2020-12-29 14:53
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    /**
     * 预检查
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginUser = request.getSession().getAttribute("loginUser");
        if (loginUser == null){
            //未登录，返回登录页
            request.setAttribute("msg","没有权限请先登录");
            request.getRequestDispatcher("/index.html").forward(request,response);
            return false;
        }else{
            //已登录，请求放行
            return true;
        }

    }
}
