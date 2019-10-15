package com.example.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel(value = "学生信息返回")
@Data
public class StudentDto implements Serializable {

    @ApiModelProperty("学生id")
    private String sId;

    @ApiModelProperty("班级id")
    private String cId;

    @ApiModelProperty("学生性别")
    private String sSex;

    @ApiModelProperty("学生名字")
    private String sName;
}
