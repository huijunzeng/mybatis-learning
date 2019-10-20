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

@ApiModel(description = "老师批量更新参数 对多条数据的多个字段各自更新为不同值")
@Data
public class TeacherUpdateMoreFieldsMoreValuesParam implements Serializable {

    @ApiModelProperty("老师更新数组")
    private List<TeacherUpdateParam> teacherList;

}
