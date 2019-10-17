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

@ApiModel(description = "老师批量新增参数")
@Data
public class TeacherSaveListParam implements Serializable {

    @ApiModelProperty("老师新增数组")
    private List<TeacherSaveParam> teacherList;

}
