package com.example.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: ZJH
 * @Date: 2019/10/15 15:42
 */

@ApiModel(description = "老师批量更新参数 对多条数据的多个字段更新为相对应的同一个值")
@Data
public class TeacherUpdateOneFieldMoreValuesParam implements Serializable {

    @ApiModelProperty("老师更新班级id数组")
    private List<TeacherUpdateClassIdParam> teacherList;

}
