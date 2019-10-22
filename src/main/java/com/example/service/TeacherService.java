package com.example.service;

import com.example.entity.TeacherEntity;
import com.example.mapper.TeacherEntityMapper;
import com.example.param.*;
import com.example.utils.BeanConverter;
import com.example.utils.IdGenerate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.example.exception.ThrowingWrapper.throwingConsumerWrapper;

/**
 * @Author: ZJH
 * @Date: 2019/10/15 14:43
 */

@Service
public class TeacherService {

    @Autowired
    private TeacherEntityMapper entityMapper;

    @Transactional(rollbackFor = Exception.class)
    public void insert(TeacherSaveParam teacherSaveParam) throws Exception {
        TeacherEntity teacherEntity = BeanConverter.copy(teacherSaveParam, TeacherEntity.class);
        teacherEntity.setTeacherId(String.valueOf(IdGenerate.getInstance().nextId()));
        entityMapper.insertSelective(teacherEntity);
    }

    @Transactional(rollbackFor = Exception.class)
    public void insertBatch(TeacherSaveListParam teacherSaveParam) {
        List<TeacherSaveParam> teacherList = teacherSaveParam.getTeacherList();
        if (teacherList != null && !teacherList.isEmpty()) {
            List<TeacherEntity> saveList = BeanConverter.copy(teacherList, TeacherEntity.class);
            saveList.stream().forEach(throwingConsumerWrapper(teacherEntity -> teacherEntity.setTeacherId(String.valueOf(IdGenerate.getInstance().nextId())), Exception.class));
            entityMapper.insertBatch(saveList);
        }
    }

    @Transactional(rollbackFor = Exception.class)
    public void updateBatch1(TeacherUpdateOneFieldOneValueParam teacherUpdateOneFieldOneValueParam) {
        String teacherSex = teacherUpdateOneFieldOneValueParam.getTeacherSex();
        List<String> idList = teacherUpdateOneFieldOneValueParam.getIdList();
        entityMapper.updateBatch1(teacherSex, idList);
    }

    @Transactional(rollbackFor = Exception.class)
    public void updateBatch2(TeacherUpdateOneFieldMoreValuesParam teacherUpdateOneFieldMoreValuesParam) {
        List<TeacherUpdateClassIdParam> teacherList = teacherUpdateOneFieldMoreValuesParam.getTeacherList();
        entityMapper.updateBatch2(teacherList);
    }

    @Transactional(rollbackFor = Exception.class)
    public void updateBatch3(TeacherUpdateMoreFieldsMoreValuesParam teacherUpdateMoreFieldsMoreValuesParam) {
        List<TeacherUpdateParam> teacherList = teacherUpdateMoreFieldsMoreValuesParam.getTeacherList();
        entityMapper.updateBatch3(teacherList);
    }
}
