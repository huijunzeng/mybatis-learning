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

@ApiModel(value = "班级老师关联信息返回")
@Data
public class ClassTeacherRelDto implements Serializable {


    @ApiModelProperty("老师id")
    private String teacherId;

    @ApiModelProperty("老师性别简码")
    private String teacherSex;

    @ApiModelProperty("老师性别名称")
    private String teacherSexName;

    @ApiModelProperty("老师名字")
    private String teacherName;

    public String getTeacherSexName() {
        if (this.teacherSex == null) {
            return null;
        } else {
            if (SexEnum.getNameByCode(this.teacherSex) != null) {
                return SexEnum.getNameByCode(this.teacherSex);
            }
        }
        return null;
    }

    public void setTeacherSexName(String teacherSexName) {
        this.teacherSexName = teacherSexName;
    }

}
