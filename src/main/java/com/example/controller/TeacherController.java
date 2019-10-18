package com.example.controller;

import com.example.exception.BaseResultCodeEnum;
import com.example.exception.CustomizeException;
import com.example.param.TeacherSaveListParam;
import com.example.param.TeacherSaveParam;
import com.example.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @Author: ZJH
 * @Date: 2019/10/15 14:59
 */

@Api(tags = "老师接口")
@RequestMapping("/teacher")
@RestController
public class TeacherController {

    private static final Logger logger = LoggerFactory.getLogger(TeacherController.class);

    @Autowired
    private TeacherService teacherService;

    @ApiOperation("老师新增接口")
    @PostMapping(value = "/insert")
    public void insert(@ApiParam(name = "老师新增接口参数") @RequestBody TeacherSaveParam teacherSaveParam) {
        try {
            teacherService.insert(teacherSaveParam);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("teacher_insert_error:{}", e.getMessage());
            throw new CustomizeException(BaseResultCodeEnum.FASLE);
        }
    }

    @ApiOperation("老师新增接口")
    @PostMapping(value = "/insertBatch")
    public void insertBatch(@ApiParam(name = "老师新增接口参数") @RequestBody TeacherSaveListParam teacherSaveListParam) {
        try {
            teacherService.insertBatch(teacherSaveListParam);
        } catch (Exception e) {
            e.printStackTrace();
            if (e instanceof CustomizeException) {
                CustomizeException customizeException = (CustomizeException) e;
                throw new CustomizeException(customizeException.getResponse());
            }
            logger.error("teacher_insertBatch_error:{}", e.getMessage());
            throw new CustomizeException(BaseResultCodeEnum.FASLE);
        }
    }
}
