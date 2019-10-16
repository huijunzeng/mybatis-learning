package com.example.controller;

import com.example.dto.TeacherDto;
import com.example.param.TeacherSaveParam;
import com.example.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: ZJH
 * @Date: 2019/10/15 14:59
 */

@Api(tags = "老师接口")
@RestController("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @ApiOperation(value = "老师新增接口")
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public TeacherDto save(@ApiParam(name = "老师新增接口参数") @RequestBody TeacherSaveParam teacherSaveParam) {
       /* try {
            int a = 1/0;
            System.out.println("success");
        } catch (Exception e) {
            e.printStackTrace();*/
            //throw new CustomizeException(BaseResultCodeEnum.TEST);
            //throw new CustomizeException(BaseResultCodeEnum.TEST);
        //}
        return new TeacherDto();
    }
}
