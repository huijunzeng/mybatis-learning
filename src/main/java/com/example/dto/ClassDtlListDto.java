package com.example.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: ZJH
 * @Date: 2019/10/15 15:42
 */

@ApiModel(value = "班级详情信息返回")
@Data
public class ClassDtlListDto implements Serializable {

    @ApiModelProperty("班级id")
    private String classId;

    @ApiModelProperty("班级名称")
    private String className;

    @ApiModelProperty("班级老师关联信息list")
    private List<ClassTeacherRelDto> classTeacherRelList;

    @ApiModelProperty("班级学生关联信息list")
    private List<ClassStudentRelDto> classStudentRelList;

}
