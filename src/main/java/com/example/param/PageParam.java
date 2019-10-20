package com.example.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 分页参数
 * @Author: ZJH
 * @Date: 2019/8/5 12:27
 */

@ApiModel(value = "分页参数")
@Data
public class PageParam implements Serializable {

    @ApiModelProperty("页码")
    private int pageNum = 1;

    @ApiModelProperty("页大小")
    private int pageSize = 1;

}
