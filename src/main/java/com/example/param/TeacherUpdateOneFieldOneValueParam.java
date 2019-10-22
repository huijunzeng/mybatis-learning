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

@ApiModel(description = "老师批量更新参数 对多条数据的同一个字段更新为同一个值")
@Data
public class TeacherUpdateOneFieldOneValueParam implements Serializable {

    @ApiModelProperty("老师性别")
    private String teacherSex;

    @ApiModelProperty("id数组")
    private List<String> idList;

}
