package com.example.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel(description = "学生新增参数")
@Data
public class StudentSaveParam implements Serializable {

    @ApiModelProperty("班级id")
    private String cId;

    @ApiModelProperty("学生性别")
    private String sSex;

    @ApiModelProperty("学生名字")
    private String sName;
}
