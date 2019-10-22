package com.example.mapper;

import com.example.entity.StudentEntity;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

public interface StudentEntityMapper extends BaseMapper<StudentEntity> {

    void insertBatch(@Param("saveList") List<StudentEntity> saveList);
}