package com.example.mapper;

import com.example.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {
}