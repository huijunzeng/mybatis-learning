package com.example.param;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel(value = "班级保存参数")
@Data
public class ClassSaveParam implements Serializable {

    @ApiModelProperty("班级名称")
    private String className;

    @ApiModelProperty("老师id")
    private String teacherId;

}
