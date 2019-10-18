package com.example.service;

import com.example.entity.TeacherEntity;
import com.example.exception.BaseResultCodeEnum;
import com.example.exception.CustomizeException;
import com.example.mapper.TeacherEntityMapper;
import com.example.param.TeacherSaveListParam;
import com.example.param.TeacherSaveParam;
import com.example.utils.BeanConverter;
import com.example.utils.IdGenerate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.exception.ThrowingWrapper.throwingConsumerWrapper;

/**
 * @Author: ZJH
 * @Date: 2019/10/15 14:43
 */

@Service
public class TeacherService {

    @Autowired
    private TeacherEntityMapper teacherEntityMapper;

    public void insert(TeacherSaveParam teacherSaveParam) throws Exception {
        TeacherEntity teacherEntity = BeanConverter.copy(teacherSaveParam, TeacherEntity.class);
        teacherEntity.setTeacherId(String.valueOf(IdGenerate.getInstance().nextId()));
        teacherEntityMapper.insertSelective(teacherEntity);
    }

    public void insertBatch(TeacherSaveListParam teacherSaveParam) {
        List<TeacherSaveParam> teacherList = teacherSaveParam.getTeacherList();
        if (teacherList == null || teacherList.isEmpty()) {
            throw new CustomizeException(BaseResultCodeEnum.NO_DATA);
        }
        List<TeacherEntity> saveList = BeanConverter.copy(teacherList, TeacherEntity.class);
        saveList.stream().forEach(throwingConsumerWrapper(teacher -> teacher.setTeacherId(String.valueOf(IdGenerate.getInstance().nextId())), Exception.class));
        teacherEntityMapper.insertBatch(saveList);
    }
}
