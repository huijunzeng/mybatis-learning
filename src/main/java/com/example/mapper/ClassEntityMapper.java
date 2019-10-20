package com.example.mapper;

import com.example.dto.ClassDtlListDto;
import com.example.dto.ClassStudentRelDto;
import com.example.dto.ClassTeacherRelDto;
import com.example.entity.ClassEntity;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

public interface ClassEntityMapper extends BaseMapper<ClassEntity> {

    void insertBatch(@Param("saveList") List<ClassEntity> saveList);

    Integer selectTotalRecord(@Param("className") String className);

    List<ClassDtlListDto> selectDtlListByParam(@Param("className") String className);

    // mybatis两种方式传递参数 其一如下，其二在service层用一个map封装传递
    // @Param注解最好不要省（在只有一个基本类型的参数时是可以省略的），注解的属性名称需要与xml中的取值名称保持一致，如果是map传递，名称以及map的key都需与xml中的取值保持一致
    List<ClassDtlListDto> selectDtlListByPage(@Param("className") String className, @Param("startIndex") int startIndex, @Param("pageSize") int pageSize);

    List<ClassDtlListDto> selectDtlListByPageHelper(@Param("className") String className);

    List<ClassTeacherRelDto> selectTeacherListByClassId(@Param("classId") String classId);

    List<ClassStudentRelDto> selectStudentListByClassId(@Param("classId") String classId);
}