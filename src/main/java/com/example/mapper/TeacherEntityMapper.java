package com.example.mapper;

import com.example.entity.TeacherEntity;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

public interface TeacherEntityMapper extends BaseMapper<TeacherEntity> {

    void insertBatch(@Param("saveList") List<TeacherEntity> saveList);
}