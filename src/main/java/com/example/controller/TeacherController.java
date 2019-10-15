package com.example.controller;

import com.example.exception.BaseResultCode;
import com.example.exception.BaseResultCodeEnum;
import com.example.exception.CustomizeException;
import com.example.service.TeacherService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ZJH
 * @Date: 2019/10/15 14:59
 */

@Api(value = "老师接口")
@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping("/test")
    public String test() {
       /* try {
            int a = 1/0;
            System.out.println("success");
        } catch (Exception e) {
            e.printStackTrace();*/
            throw new CustomizeException(BaseResultCode.FAIL_CODE, BaseResultCode.FAIL_MSG);
            //throw new CustomizeException(BaseResultCodeEnum.TEST);
        //}
    }
}
