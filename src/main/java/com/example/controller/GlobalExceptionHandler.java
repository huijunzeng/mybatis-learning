package com.example.controller;

import com.example.exception.CustomizeException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ZJH
 * @Date: 2019/10/15 17:21
 */

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /*@org.springframework.web.bind.annotation.ExceptionHandler(CustomizeException.class)
    @ResponseBody
    public Response handleStudentException(HttpServletRequest request, CustomizeException ex) {
        Response response;
        log.error("StudentException code:{},msg:{}",ex.getResponse().getCode(),ex.getResponse().getMsg());
        response = new Response(ex.getResponse().getCode(),ex.getResponse().getMsg());
        return response;
    }
    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    @ResponseBody
    public Response handleException(HttpServletRequest request, Exception ex) {
        Response response;
        log.error("exception error:{}",ex);
        response = new Response(BaseResultCodeEnum.FASLE.getCode(),
                BaseResultCodeEnum.FASLE.getMsg());
        return response;
    }*/
    /**
     * 应用到所有@RequestMapping注解方法，在其执行之前初始化数据绑定器
     * @param binder
     */
    @InitBinder
    public void initWebBinder(WebDataBinder binder){

    }

    /**
     * 把值绑定到Model中，使全局@RequestMapping可以获取到该值
     * @param model
     */
    @ModelAttribute
    public void addAttribute(Model model) {
        model.addAttribute("attribute",  "The Attribute");
    }

    /**
     * 捕获CustomizeException自定义异常
     * @param e
     * @return json格式类型
     */
    @ResponseBody
    @ExceptionHandler(RuntimeException.class)//指定拦截异常的类型 可数组
    //@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) //自定义浏览器返回状态码
    public Map<String, Object> customExceptionHandler(CustomizeException e) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", e.getCode());
        map.put("msg", e.getMsg());
/*
        map.put("code", e.getResponse().getCode());
        map.put("msg", e.getResponse().getMsg());
*/
        return map;
    }
}
