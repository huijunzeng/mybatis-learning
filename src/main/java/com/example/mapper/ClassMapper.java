package com.example.mapper;

import com.example.entity.Class;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
public interface ClassMapper extends BaseMapper<Class> {
}