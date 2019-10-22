package com.example.dto;

import com.example.dto.base.SexEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: ZJH
 * @Date: 2019/10/15 15:42
 */

@ApiModel(value = "老师分页信息返回")
@Data
public class TeacherDtlListDto implements Serializable {

    @ApiModelProperty("老师性别简码")
    private String teacherSex;

    @ApiModelProperty("老师性别名称")
    private String teacherSexName;

    @ApiModelProperty("老师名字")
    private String teacherName;

    @ApiModelProperty("老师班级关联信息list")
    private List<ClassTeacherRelDto> teacherClassRelList;

    @ApiModelProperty("班级学生关联信息list")
    private List<ClassStudentRelDto> classStudentRelList;

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
