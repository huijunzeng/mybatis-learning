package com.example.dto;

import com.example.dto.base.SexEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZJH
 * @Date: 2019/10/15 15:42
 */

@ApiModel(value = "班级学生关联信息返回")
@Data
public class ClassStudentRelDto implements Serializable {

    @ApiModelProperty("班级id")
    private String classId;

    @ApiModelProperty("学生id")
    private String studentId;

    @ApiModelProperty("学生性别简码")
    private String studentSex;

    @ApiModelProperty("学生性别名称")
    private String studentSexName;

    @ApiModelProperty("学生名字")
    private String studentName;

    public String getStudentSexName() {
        if (this.studentSex == null) {
            return null;
        } else {
            if (SexEnum.getNameByCode(this.studentSex) != null) {
                return SexEnum.getNameByCode(this.studentSex);
            }
        }
        return null;
    }

    public void SetStudentSexName(String studentName) {
        this.studentName = studentName;
    }
}
