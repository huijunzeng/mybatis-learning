package com.example.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZJH
 * @Date: 2019/10/15 15:42
 */

@ApiModel(description = "老师更新班级id参数")
@Data
public class TeacherUpdateClassIdParam implements Serializable {

    @ApiModelProperty("老师id")
    private String teacherId;

    @ApiModelProperty("班级id")
    private String classId;

}
