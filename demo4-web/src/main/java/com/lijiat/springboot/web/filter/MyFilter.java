package com.lijiat.springboot.web.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @program: demo4-web
 * @description:
 * @author: zhangjialin
 * @create: 2021-01-04 13:49
 */
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("My Filter process...");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
