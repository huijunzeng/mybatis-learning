package com.example.controller;

import com.example.exception.BaseResultCodeEnum;
import com.example.exception.CustomizeException;
import com.example.param.*;
import com.example.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
            if (e instanceof CustomizeException) {
                throw new CustomizeException(BaseResultCodeEnum.NAME_PARAM_EMPTY);
            }
            throw new CustomizeException(BaseResultCodeEnum.FASLE);
        }
    }

    @ApiOperation("老师批量新增接口")
    @PostMapping(value = "/insertBatch")
    public void insertBatch(@ApiParam(name = "老师批量新增接口") @RequestBody TeacherSaveListParam teacherSaveListParam) {
        try {
            teacherService.insertBatch(teacherSaveListParam);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("teacher_insertBatch_error:{}", e.getMessage());
            if (e instanceof CustomizeException) {
                throw new CustomizeException(BaseResultCodeEnum.NAME_PARAM_EMPTY);
            }
            throw new CustomizeException(BaseResultCodeEnum.FASLE);
        }
    }

    /**
     * 更新分以下三种
     */
    @ApiOperation("老师批量更新接口  对多条数据的同一个字段更新为同一个值")
    @PostMapping(value = "/updateBatch1")
    public void updateBatch1(@ApiParam(name = "老师批量更新接口  对多条数据的一个字段更新为同一个值") @RequestBody TeacherUpdateOneFieldOneValueParam teacherUpdateOneFieldOneValueParam) {
        try {
            teacherService.updateBatch1(teacherUpdateOneFieldOneValueParam);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("teacher_updateBatch1_error:{}", e.getMessage());
            throw new CustomizeException(BaseResultCodeEnum.FASLE);
        }
    }

    @ApiOperation("老师批量更新接口  对多条数据的多个字段更新为相对应的同一个值")
    @PostMapping(value = "/updateBatch2")
    public void updateBatch2(@ApiParam(name = "老师批量更新接口  对多条数据的多个字段更新为相对应的同一个值") @RequestBody TeacherUpdateOneFieldMoreValuesParam teacherUpdateOneFieldMoreValuesParam) {
        try {
            teacherService.updateBatch2(teacherUpdateOneFieldMoreValuesParam);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("teacher_updateBatch2_error:{}", e.getMessage());
            throw new CustomizeException(BaseResultCodeEnum.FASLE);
        }
    }

    @ApiOperation("老师批量更新接口  对多条数据的多个字段各自更新为不同值")
    @PostMapping(value = "/updateBatch3")
    public void updateBatch3(@ApiParam(name = "老师批量更新接口  对多条数据的多个字段各自更新为不同值") @RequestBody TeacherUpdateMoreFieldsMoreValuesParam teacherUpdateMoreFieldsMoreValuesParam) {
        try {
            teacherService.updateBatch3(teacherUpdateMoreFieldsMoreValuesParam);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("teacher_updateBatch3_error:{}", e.getMessage());
            throw new CustomizeException(BaseResultCodeEnum.FASLE);
        }
    }


}
