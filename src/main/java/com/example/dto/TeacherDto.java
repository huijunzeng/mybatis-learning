package com.example.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZJH
 * @Date: 2019/10/15 15:42
 */

@ApiModel(value = "老师信息返回")
@Data
public class TeacherDto implements Serializable {

    @ApiModelProperty("老师id")
    private String teacherId;

    @ApiModelProperty("老师性别")
    private String teacherSex;

    @ApiModelProperty("老师名字")
    private String teacherName;

}
