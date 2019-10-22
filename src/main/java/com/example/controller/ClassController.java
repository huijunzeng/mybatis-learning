package com.example.controller;

import com.example.dto.ClassDtlListDto;
import com.example.exception.BaseResultCodeEnum;
import com.example.exception.CustomizeException;
import com.example.param.ClassDtlListPageQueryParam;
import com.example.param.ClassDtlListQueryParam;
import com.example.param.ClassSaveListParam;
import com.example.param.ClassSaveParam;
import com.example.service.ClassService;
import com.example.utils.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: ZJH
 * @Date: 2019/10/15 15:10
 */

@Api(tags = "班级接口")
@RequestMapping("/class")
@RestController
public class ClassController {

    private static final Logger logger = LoggerFactory.getLogger(ClassController.class);
    
    @Autowired
    private ClassService classService;

    @ApiOperation("班级新增接口")
    @PostMapping(value = "/insert")
    public void insert(@ApiParam(name = "班级新增接口参数") @RequestBody ClassSaveParam classSaveParam) {
        try {
            classService.insert(classSaveParam);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("class_insert_error:{}", e.getMessage());
            if (e instanceof CustomizeException) {
                throw new CustomizeException(BaseResultCodeEnum.NAME_PARAM_EMPTY);
            }
            throw new CustomizeException(BaseResultCodeEnum.FASLE);
        }
    }

    @ApiOperation("班级批量新增接口")
    @PostMapping(value = "/insertBatch")
    public void insertBatch(@ApiParam(name = "班级批量新增接口") @RequestBody ClassSaveListParam classSaveListParam) {
        try {
            classService.insertBatch(classSaveListParam);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("class_insertBatch_error:{}", e.getMessage());
            if (e instanceof CustomizeException) {
                throw new CustomizeException(BaseResultCodeEnum.NAME_PARAM_EMPTY);
            }
            throw new CustomizeException(BaseResultCodeEnum.FASLE);
        }
    }

    @ApiOperation("班级详情列表查询接口")
    @PostMapping(value = "/selectDtlListByParam")
    public List<ClassDtlListDto> selectDtlListByParam(@ApiParam(name = "班级详情列表查询接口") @RequestBody ClassDtlListQueryParam classDtlListQueryParam) {
        try {
            return classService.selectDtlListByParam(classDtlListQueryParam);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("class_selectDtlListByParam_error:{}", e.getMessage());
            throw new CustomizeException(BaseResultCodeEnum.FASLE);
        }
    }

    /**
     * 不用PageHelper工具类分页，原生手动分页最靠谱
     * @param classDtlListPageQueryParam
     * @return
     */
    @ApiOperation("班级详情分页查询接口 手动分页")
    @PostMapping(value = "/selectDtlListByPage")
    public PageInfo selectDtlListByPage(@ApiParam(name = "班级详情分页查询接口 手动分页") @RequestBody ClassDtlListPageQueryParam classDtlListPageQueryParam) {
        try {
            return classService.selectDtlListByPage(classDtlListPageQueryParam);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("class_selectDtlListByPage_error:{}", e.getMessage());
            throw new CustomizeException(BaseResultCodeEnum.FASLE);
        }
    }

    /**
     * PageHelper工具类分页假如是单表或者是多表对应一对一关系的，xml文件写法可以对应selectDtlListByParam接口的写法；
     * 假如是多表对应一对多关系的，xml文件写法为如下接口的写法，但会产生N+1问题，大量创建数据库连接，加大数据库压力，因此不建议，最好用原生手动分页（即上面的案例接口）
     * @param classDtlListPageQueryParam
     * @return
     */
    @ApiOperation("班级详情分页查询接口 PageHelper工具分页  注意，这里的PageInfo是PageInfo自带的分装类，区别于自定义的PageInfo类")
    @PostMapping(value = "/selectDtlListByPageHelper")
    public com.github.pagehelper.PageInfo selectDtlListByPageHelper(@ApiParam(name = "班级详情分页查询接口 PageHelper工具分页") @RequestBody ClassDtlListPageQueryParam classDtlListPageQueryParam) {
        try {
            return classService.selectDtlListByPageHelper(classDtlListPageQueryParam);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("class_selectDtlListByPageHelper_error:{}", e.getMessage());
            throw new CustomizeException(BaseResultCodeEnum.FASLE);
        }
    }
}
