package com.example.mapper;

import com.example.entity.TeacherEntity;
import com.example.param.TeacherUpdateMoreFieldsMoreValuesParam;
import com.example.param.TeacherUpdateOneFieldMoreValuesParam;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

public interface TeacherEntityMapper extends BaseMapper<TeacherEntity> {

    void insertBatch(@Param("saveList") List<TeacherEntity> saveList);

    void updateBatch1(@Param("teacherSex") String teacherSex, @Param("idList") List<String> idList);

    void updateBatch2(@Param("teacherUpdateOneFieldMoreValuesParam") TeacherUpdateOneFieldMoreValuesParam teacherUpdateOneFieldMoreValuesParam);

    void updateBatch3(@Param("teacherUpdateMoreFieldsMoreValuesParam") TeacherUpdateMoreFieldsMoreValuesParam teacherUpdateMoreFieldsMoreValuesParam);
}