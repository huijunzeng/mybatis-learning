package com.example.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZJH
 * @Date: 2019/10/15 15:42
 */

@ApiModel(description = "老师新增参数")
@Data
public class TeacherSaveParam implements Serializable {

    @ApiModelProperty("老师性别")
    private String teacherSex;

    @ApiModelProperty("老师名字")
    private String teacherName;

}
