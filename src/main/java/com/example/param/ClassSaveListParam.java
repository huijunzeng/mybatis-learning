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

@ApiModel(description = "班级批量新增参数")
@Data
public class ClassSaveListParam implements Serializable {

    @ApiModelProperty("班级新增数组")
    private List<ClassSaveParam> classList;

}
