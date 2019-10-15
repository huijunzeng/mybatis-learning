package com.example.mapper;

import com.example.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
public interface TeacherMapper extends BaseMapper<Teacher> {
}