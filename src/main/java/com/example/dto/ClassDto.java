package com.example.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel(value = "班级信息返回")
@Data
public class ClassDto implements Serializable {

    @ApiModelProperty("班级id")
    private String classId;

    @ApiModelProperty("班级名称")
    private String className;

}
