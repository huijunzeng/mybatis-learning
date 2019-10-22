package com.example.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZJH
 * @Date: 2019/10/15 15:42
 */

@ApiModel(description = "班级详情分页查询参数")
@Data
public class ClassDtlListPageQueryParam extends PageParam implements Serializable {

    @ApiModelProperty("班级名字")
    private String className;

}
