package com.example.controller;

import com.example.exception.BaseResultCodeEnum;
import com.example.exception.CustomizeException;
import com.example.param.StudentSaveListParam;
import com.example.param.StudentSaveParam;
import com.example.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ZJH
 * @Date: 2019/10/15 15:10
 */

@Api(tags = "学生接口")
@RequestMapping("/student")
@RestController
public class StudentController {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
    
    @Autowired
    private StudentService studentService;

    @ApiOperation("学生新增接口")
    @PostMapping(value = "/insert")
    public void insert(@ApiParam(name = "学生新增接口参数") @RequestBody StudentSaveParam studentSaveParam) {
        try {
            studentService.insert(studentSaveParam);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("student_insert_error:{}", e.getMessage());
            if (e instanceof CustomizeException) {
                throw new CustomizeException(BaseResultCodeEnum.NAME_PARAM_EMPTY);
            }
            throw new CustomizeException(BaseResultCodeEnum.FASLE);
        }
    }

    @ApiOperation("学生批量新增接口")
    @PostMapping(value = "/insertBatch")
    public void insertBatch(@ApiParam(name = "学生批量新增接口") @RequestBody StudentSaveListParam studentSaveListParam) {
        try {
            studentService.insertBatch(studentSaveListParam);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("student_insertBatch_error:{}", e.getMessage());
            if (e instanceof CustomizeException) {
                throw new CustomizeException(BaseResultCodeEnum.NAME_PARAM_EMPTY);
            }
            throw new CustomizeException(BaseResultCodeEnum.FASLE);
        }
    }
}
