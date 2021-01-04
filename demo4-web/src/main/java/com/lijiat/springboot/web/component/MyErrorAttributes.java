package com.lijiat.springboot.web.component;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/**
 * @program: demo4-web
 * @description:
 * @author: zhangjialin
 * @create: 2021-01-04 11:26
 */
@Component
public class MyErrorAttributes extends DefaultErrorAttributes {
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, ErrorAttributeOptions options) {
        Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, options);
        errorAttributes.put("company","hahaha");
        Map<String,Object> ext = (Map<String, Object>) webRequest.getAttribute("ext", WebRequest.SCOPE_REQUEST);
        errorAttributes.put("ext",ext);
        return errorAttributes;

    }
}
